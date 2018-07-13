import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { BooksComponent } from './books/books.component';
import { AdminComponent} from './admin/admin.component';
import { CartComponent } from './cart/cart.component';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { AuthorsComponent } from './authors/authors.component';

const routes: Routes = [
  {path: 'home', component: HomeComponent },
  {path: 'books', component: BooksComponent },
  {path: 'admin', component: AdminComponent },
  {path: 'authors', component: AuthorsComponent},
  {path: 'cart', component: CartComponent },
  {path: 'login', component: LoginComponent},
  {path: 'register', component: RegisterComponent}
];

@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [ RouterModule ],
})
export class AppRoutingModule { }
