import { Component, OnInit } from '@angular/core';
import { VmService, SecuritygroupService, KeypairService} from '../api/aws/index';

@Component({
  selector: 'app-awshome',
  templateUrl: './awshome.component.html',
  styleUrls: ['./awshome.component.css'],
  providers: [VmService, SecuritygroupService, KeypairService]
})
export class AwshomeComponent implements OnInit {

  vms: any[];
  keypairs: any[];
  groups: any[];

  constructor(private vmService: VmService,
              private securitygroupService: SecuritygroupService,
              private keypairService: KeypairService) { }

  ngOnInit() {
    this.loadAllVMs();
    this.loadAllSecurityGroups();
    this.loadAllKeypairs();
  }


  loadAllVMs(){
    this.vmService.vmLoadAllVM().subscribe(
      instances => {
        this.vms = instances.instances;
        //console.log(this.vms);
      },
      error => {
        console.log(error);
      });
  }

  loadAllSecurityGroups(){
    this.securitygroupService.securitygroupLoadAllSecurityGroups().subscribe(
      groups => {
        this.groups = groups.groups;
      },
      error => {
        console.log(error);
      });
  }

  loadAllKeypairs(){
    this.keypairService.keypairGetAllKeypairs().subscribe(
      keypairs => {
        this.keypairs = keypairs.keypairs;
      },
      error => {
        console.log(error);
      });
  }

  start(instanceId){
    //vmStartVM instanceId
    this.vmService.vmStartVM(instanceId).subscribe(
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
    this.vmService.vmStopVM(instanceId).subscribe(
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
