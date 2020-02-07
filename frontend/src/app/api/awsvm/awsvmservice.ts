import { Inject, Injectable, Optional } from '@angular/core';
import { HttpClient, HttpHeaders, HttpParams,
         HttpResponse, HttpEvent } from '@angular/common/http';
import { environment } from '../../../environments/environment';
import { Configuration } from '../../../configuration';
//import { CustomHttpUrlEncodingCodec } from '../../encoder';

@Injectable()
export class AWSVMService {


  protected basePath = 'http://api/image';
  public defaultHeaders = new HttpHeaders();
  public configuration = new Configuration();

  constructor(protected httpClient: HttpClient, @Optional() configuration: Configuration) {

      this.basePath = environment.VM_SERVICE_PATH;

      console.log(this.basePath);
  }



}
