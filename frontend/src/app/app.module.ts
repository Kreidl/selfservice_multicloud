import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { ReactiveFormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ApiRequestInterceptor } from './api/apirequestinterceptor';
import { BASE_PATH as AWS_BASE_PATH } from './api/aws/index';
import { environment } from '../environments/environment';
import { AwsvmComponent } from './awsvm/awsvm.component';
import { AwshomeComponent } from './awshome/awshome.component';

@NgModule({
  declarations: [
    AppComponent,
    AwsvmComponent,
    AwshomeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [
    { provide: AWS_BASE_PATH, useValue: environment.AWS_BASE_PATH },
    { provide: HTTP_INTERCEPTORS, useClass: ApiRequestInterceptor, multi: true }
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
