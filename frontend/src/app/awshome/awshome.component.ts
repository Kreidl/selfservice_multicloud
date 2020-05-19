import { Component, OnInit } from '@angular/core';
import { AWSVmService, AWSSecuritygroupService, AWSKeypairService} from '../api/index';

@Component({
  selector: 'app-awshome',
  templateUrl: './awshome.component.html',
  styleUrls: ['./awshome.component.css'],
  providers: [AWSVmService, AWSSecuritygroupService, AWSKeypairService]
})
export class AwshomeComponent implements OnInit {

  vms: any[];
  keypairs: any[];
  groups: any[];

  constructor(private vmService: AWSVmService,
              private securitygroupService: AWSSecuritygroupService,
              private keypairService: AWSKeypairService) { }

  ngOnInit() {
    this.loadAllVMs();
    this.loadAllSecurityGroups();
    this.loadAllKeypairs();
  }


  loadAllVMs(){
    this.vmService.awsVmLoadAllVM().subscribe(
      instances => {
        this.vms = instances.instances;
        //console.log(this.vms);
      },
      error => {
        console.log(error);
      });
  }

  loadAllSecurityGroups(){
    this.securitygroupService.awsSecuritygroupLoadAllSecurityGroups().subscribe(
      groups => {
        this.groups = groups.groups;
      },
      error => {
        console.log(error);
      });
  }

  loadAllKeypairs(){
    this.keypairService.awsKeypairGetAllKeypairs().subscribe(
      keypairs => {
        this.keypairs = keypairs.keypairs;
      },
      error => {
        console.log(error);
      });
  }

  start(instanceId){
    //vmStartVM instanceId
    this.vmService.awsVmStartVM(instanceId).subscribe(
      instances => {
        this.loadAllVMs();
        //console.log(this.vms);
      },
      error => {
        console.log(error);
      });
  }

  stop(instanceId){
    //vmStopVM
    this.vmService.awsVmStopVM(instanceId).subscribe(
      instances => {
        this.loadAllVMs();
        //console.log(this.vms);
      },
      error => {
        console.log(error);
      });
  }

  reloadkeyPair(){
    this.loadAllKeypairs();
  }

  reloadSecurityGroup(){
    this.loadAllSecurityGroups();
  }

  reloadVM(){
    this.loadAllVMs();
  }

}
