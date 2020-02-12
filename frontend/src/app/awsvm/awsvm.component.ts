import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';
import { ImageService, ImageRequest } from '../api/aws/index';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-awsvm',
  templateUrl: './awsvm.component.html',
  styleUrls: ['./awsvm.component.css'],
  providers: [ImageService]
})
export class AwsvmComponent implements OnInit {

  newVMForm: FormGroup;
  selectedImagetype = '1';
  imageTypeDescription = "ImageId Input";
  images: any[];
  displayNum = 10;

  imagesSearchInfo = false;

  constructor(private imageService: ImageService,
              private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.newVMForm = this.formBuilder.group({
      image: [''],
      images: ['']

    });
    this.imagesSearchInfo = false;
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


    if (this.f.image.value.length > 0){
      //Check if it is imageId or imageName and set attribute accordingly
      if(this.selectedImagetype === '1') {
          this.imageTypeDescription = "ImageId Input";
          imageRequest.imageId =  this.f.image.value;
      }else{
          this.imageTypeDescription = "ImageName Input";
          imageRequest.imageName =  this.f.image.value;
      }
    }

    this.imageService.imageLoadImages(imageRequest).subscribe(

      types => {
        this.images  = types.images;
      },
      error => {
        console.log(error);
      });
  }

  increaseBy(value) {
    this.displayNum += value;
  }

  get f() { return this.newVMForm.controls; }

}
