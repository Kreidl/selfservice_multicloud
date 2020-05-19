import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AwsvmComponent } from './awsvm/awsvm.component';
import { AwshomeComponent } from './awshome/awshome.component';
import { LoginComponent } from './login/login.component';


const routes: Routes = [
  { path: 'awsvmcreate', component: AwsvmComponent },
  { path: 'awshome', component: AwshomeComponent },
  { path: 'login', component: LoginComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
