import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AwsvmComponent } from './awsvm/awsvm.component';
import { AwshomeComponent } from './awshome/awshome.component';
import { AwsdetailvmComponent } from './awsdetailvm/awsdetailvm.component';


const routes: Routes = [
  { path: 'awsvmcreate', component: AwsvmComponent },
  { path: 'awshome', component: AwshomeComponent },
  { path: 'awshome/detail/:instanceId', component: AwsdetailvmComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
