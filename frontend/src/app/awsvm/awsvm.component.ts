import { Component, OnInit } from '@angular/core';
import { InstancetypeService } from '../api/aws/index'

@Component({
  selector: 'app-awsvm',
  templateUrl: './awsvm.component.html',
  styleUrls: ['./awsvm.component.css'],
  providers: [InstancetypeService]
})
export class AwsvmComponent implements OnInit {

  constructor(private instanceTypeService: InstancetypeService) { }

  ngOnInit() {
    console.log("test");
    this.loadImages();
  }

  loadImages() {
    this.instanceTypeService.instancetypeLoadInstanceType().subscribe(
      types => {
        console.log(types);
      },
      error => {
        console.log(error);
      });
  }



}
