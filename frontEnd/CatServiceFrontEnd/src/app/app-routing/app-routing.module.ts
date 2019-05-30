import { NgModule } from '@angular/core';
//import { CommonModule } from '@angular/common';
import {RouterModule, Routes} from "@angular/router";
import {ProduitsComponent} from "../produits/produits.component";

const routes: Routes = [
  {
    path: 'produits',
    component: ProduitsComponent
  },
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes)
  ],
  exports: [
    RouterModule
  ],
  declarations: []
})
export class AppRoutingModule { }
