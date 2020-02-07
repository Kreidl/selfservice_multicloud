import { Component, OnInit } from '@angular/core';
import { AWSVMService } from '../../index';

@Component({
  selector: 'app-awsvm',
  templateUrl: './awsvm.component.html',
  styleUrls: ['./awsvm.component.css'],
  providers: [AWSVMService]
})
export class AwsvmComponent implements OnInit {

  constructor(private awsvmservice: AWSVMService) { }

  ngOnInit() {
  }

  loadImages() {

  }



}
