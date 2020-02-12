import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';
import { ImageService, ImageRequest, InstancetypeService } from '../api/aws/index';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-awsvm',
  templateUrl: './awsvm.component.html',
  styleUrls: ['./awsvm.component.css'],
  providers: [ImageService, InstancetypeService]
})
export class AwsvmComponent implements OnInit {

  newVMForm: FormGroup;
  selectedImagetype = '1';
  imageTypeDescription = "ImageId Input";
  images: any[];
  types: any[];
  displayNumImages = 10;
  displayNumTypes = 10;

  imagesSearchInfo = false;
  typesSearchInfo = false;

  constructor(private imageService: ImageService,
              private instancetypeService: InstancetypeService,
              private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.newVMForm = this.formBuilder.group({
      imageInput: [''],
      selectedImage: [''],
      selectedtype: [''],
      maxMemory: ['']

    });
    this.imagesSearchInfo = false;
    this.typesSearchInfo = false;
  }

  onSubmit() {

  }

  onChange(event) {
    this.selectedImagetype = event.target.value;

    if(this.selectedImagetype === '1') {
        this.imageTypeDescription = "ImageId Input";
    }else{
        this.imageTypeDescription = "ImageName Input";
    }
  }

  loadImages() {
    this.imagesSearchInfo = true;
    let imageRequest:ImageRequest = {};


    if (this.f.imageInput.value.length > 0){
      //Check if it is imageId or imageName and set attribute accordingly
      if(this.selectedImagetype === '1') {
          this.imageTypeDescription = "ImageId Input";
          imageRequest.imageId =  this.f.imageInput.value;
      }else{
          this.imageTypeDescription = "ImageName Input";
          imageRequest.imageName =  this.f.imageInput.value;
      }
    }

    this.imageService.imageLoadImages(imageRequest).subscribe(
      images => {
        this.images  = images.images;
      },
      error => {
        console.log(error);
      });
  }

  loadInstanceTypes() {
    this.typesSearchInfo = true;

    if(this.f.maxMemory.value) {
      this.instancetypeService.instancetypeLoadInstanceTypeWithMemory(this.f.maxMemory.value).subscribe(
        types => {
          this.types  = types.types;
        },
        error => {
          console.log(error);
        });
    }else {
      this.instancetypeService.instancetypeLoadInstanceType().subscribe(
        types => {
          this.types  = types.types;
        },
        error => {
          console.log(error);
        });
    }

  }

  increaseImagesBy(value) {
    this.displayNumImages += value;
  }

  increaseTypesBy(value) {
    this.displayNumTypes += value;
  }



  get f() { return this.newVMForm.controls; }

}
