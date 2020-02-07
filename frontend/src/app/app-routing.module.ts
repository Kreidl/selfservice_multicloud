import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AwsvmComponent } from './awsvm/awsvm.component';

const routes: Routes = [
  { path: 'awsvmcreate', component: AwsvmComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
