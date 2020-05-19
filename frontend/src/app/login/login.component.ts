import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { AuthenticationService, LoginRequest } from '../api/index';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css'],
  providers: [AuthenticationService]
})
export class LoginComponent implements OnInit {

  loginForm: FormGroup;

  constructor(private authenticationService: AuthenticationService,
              private router: Router,
              private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.loginForm = this.formBuilder.group({
      userId: ['', Validators.required],
      password: ['', Validators.required]
    });
  }

  onSubmit() {
    let login:LoginRequest = {
      userId: this.f.userId.value,
      password: this.f.password.value
    };
    console.log(login);
    this.authenticationService.authenticationAuthenticateLogin(login).subscribe(
      success => {
        console.log(success);
        this.router.navigate(['/']);
      },
      error => {
        console.log(error);
      }
    );
  }

  get f() { return this.loginForm.controls; }

}
