import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { FormBuilder, FormGroup, Validators, FormControl } from '@angular/forms';
import { ImageService, ImageRequest, InstancetypeService, SecuritygroupService,
  SecurityGroupRequestAuthorizeConfiguration, SecurityGroupRequest,
  KeypairService, KeyPairRequest, VmService, VMRequest, VpcService } from '../api/aws/index';
import {Observable} from 'rxjs';

@Component({
  selector: 'app-awsvm',
  templateUrl: './awsvm.component.html',
  styleUrls: ['./awsvm.component.css'],
  providers: [ImageService, InstancetypeService, SecuritygroupService, KeypairService, VmService, VpcService]
})
export class AwsvmComponent implements OnInit {

  newVMForm: FormGroup;
  selectedImagetype = '1';
  imageTypeDescription = "ImageId Input";
  images: any[];
  types: any[];
  vpcs: any[];
  displayNumImages = 10;
  displayNumTypes = 10;
  groupId: string = null;
  keypair: string = null;
  instanceId: string= null;
  imagesSearchInfo = false;
  typesSearchInfo = false;
  securityGroupInfo = false;
  keypairSearchInfo = false;
  instanceCreateInfo = false;


  authorizeConfig: Array<SecurityGroupRequestAuthorizeConfiguration> = [];



  constructor(private imageService: ImageService,
              private instancetypeService: InstancetypeService,
              private securitygroupService: SecuritygroupService,
              private keypairService: KeypairService,
              private vmService: VmService,
              private vpcService: VpcService,
              private router: Router,
              private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.newVMForm = this.formBuilder.group({
      imageInput: [''],
      selectedImage: [''],
      selectedtype: [''],
      maxMemory: [''],
      securityGroupName: [''],
      securityGroupDescription: [''],
      vpcId: [''],
      ip: [''],
      port: [''],
      protocol: [''],
      groupId: [''],
      keypairInput:[''],
      keypair: [''],
      vmname: ['']

    });
    this.imagesSearchInfo = false;
    this.typesSearchInfo = false;
    this.securityGroupInfo = false;
    this.keypairSearchInfo = false;
    this.instanceCreateInfo = false;

    this.vpcService.vpcLoadVPCs().subscribe(
      vpcs => {
        this.vpcs = vpcs.vpcs;
      },
      error => {
        console.log(error);
      });
  }

  onSubmit() {
    this.instanceCreateInfo = true;

    let vmRequest:VMRequest = {
      imageId: this.f.selectedImage.value.toString(),
      instanceType: this.f.selectedtype.value.toString(),
      keyName: this.keypair.toString(),
      securityGroups: [this.groupId],
      vmname: this.f.vmname.value.toString()
    };

    this.vmService.vmCreateVM(vmRequest).subscribe(
      instance => {
        console.log(instance);
        this.router.navigate(['/awshome']);
      },
      error => {
        console.log(error);
      });

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

  addToTable() {
    let authorize:SecurityGroupRequestAuthorizeConfiguration = {
      ipaddress: this.f.ip.value,
      port: this.f.port.value,
      protocol: this.f.protocol.value,
    };
    this.authorizeConfig.push(authorize);

    this.newVMForm.controls['ip'].setValue("");
    this.newVMForm.controls['port'].setValue("");
    this.newVMForm.controls['protocol'].setValue("");

  }
  onProtocolChange($event){
    this.newVMForm.controls['protocol'].setValue($event.target.options[$event.target.options.selectedIndex].text);
  }

  onImageChange($event){
    this.newVMForm.controls['selectedImage'].setValue($event.target.options[$event.target.options.selectedIndex].value);
  }

  onVPCChange($event){
    this.newVMForm.controls['vpcId'].setValue($event.target.options[$event.target.options.selectedIndex].value);
  }
  onTypeChange($event){
    this.newVMForm.controls['selectedtype'].setValue($event.target.options[$event.target.options.selectedIndex].value);
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

  loadOrCreateSecurityGroup() {
      this.securityGroupInfo = true;

      if(this.authorizeConfig && this.authorizeConfig.length) {
        let securityGroup:SecurityGroupRequest = {
          //authorizeConfiguration?: Array<SecurityGroupRequestAuthorizeConfiguration>;
          groupDescription: this.f.securityGroupDescription.value,
          groupName: this.f.securityGroupName.value,
          vpcId: this.f.vpcId.value,
          authorizeConfiguration: this.authorizeConfig
        }

        this.securitygroupService.securitygroupLoadOrCreateSecurityGroupWithAuthorization(securityGroup).subscribe(
          securityGroup => {
            this.groupId = securityGroup.groupId
            //console.log(securityGroup.groupId)
          //  this.types  = types.types;
          },
          error => {
            console.log(error);
          });

      }else{
        let securityGroup:SecurityGroupRequest = {
          //authorizeConfiguration?: Array<SecurityGroupRequestAuthorizeConfiguration>;
          groupDescription: this.f.securityGroupDescription.value,
          groupName: this.f.securityGroupName.value,
          vpcId: this.f.vpcId.value,
          authorizeConfiguration: []
        }
        this.securitygroupService.securitygroupLoadOrCreateSecurityGroup(securityGroup).subscribe(
          securityGroup => {
            this.groupId = securityGroup.groupId
            //console.log(securityGroup.groupId)
          //  this.types  = types.types;
          },
          error => {
            console.log(error);
          });

      }

  }

  loadOrCreateKeypair() {
    this.keypairSearchInfo = true;
    if(this.f.keypairInput.value){
      let keypairRequest: KeyPairRequest ={
        keypair: this.f.keypairInput.value
      }
      this.keypairService.keypairLoadOrCreateKeyPair(keypairRequest).subscribe(
        keypair => {
          this.keypair = this.f.keypairInput.value;
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
