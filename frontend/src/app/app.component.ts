import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthenticationService } from './api/index';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [AuthenticationService]
})
export class AppComponent {
  title = 'frontend';

  constructor(private authenticationService: AuthenticationService,
              private router: Router) { }
              /*
    isLoggedIn(): boolean {
      return this.authenticationService.isLoggedIn();
    }

    logout() {
      this.authenticationService.logout();
      this.router.navigate(['']);
    }

    getUserId(): string {
      return this.authenticationService.getUserId();
    }*/
}
