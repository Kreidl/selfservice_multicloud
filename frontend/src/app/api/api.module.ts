import { NgModule, ModuleWithProviders, SkipSelf, Optional } from '@angular/core';
import { Configuration } from './configuration';
import { HttpClient } from '@angular/common/http';


import { AWSImageService } from './api/aWSImage.service';
import { AWSInstancetypeService } from './api/aWSInstancetype.service';
import { AWSKeypairService } from './api/aWSKeypair.service';
import { AWSSecuritygroupService } from './api/aWSSecuritygroup.service';
import { AWSVmService } from './api/aWSVm.service';
import { AWSVpcService } from './api/aWSVpc.service';
import { AZUREImageService } from './api/aZUREImage.service';
import { AZUREInstancetypesService } from './api/aZUREInstancetypes.service';
import { AZURENetworkService } from './api/aZURENetwork.service';
import { AZUREResourcegroupService } from './api/aZUREResourcegroup.service';
import { AZUREVmService } from './api/aZUREVm.service';
import { AuthenticationService } from './api/authentication.service';

@NgModule({
  imports:      [],
  declarations: [],
  exports:      [],
  providers: []
})
export class ApiModule {
    public static forRoot(configurationFactory: () => Configuration): ModuleWithProviders {
        return {
            ngModule: ApiModule,
            providers: [ { provide: Configuration, useFactory: configurationFactory } ]
        };
    }

    constructor( @Optional() @SkipSelf() parentModule: ApiModule,
                 @Optional() http: HttpClient) {
        if (parentModule) {
            throw new Error('ApiModule is already loaded. Import in your base AppModule only.');
        }
        if (!http) {
            throw new Error('You need to import the HttpClientModule in your AppModule! \n' +
            'See also https://github.com/angular/angular/issues/20575');
        }
    }
}
