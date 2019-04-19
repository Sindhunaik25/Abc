import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { TrendingpostsComponent } from './trendingposts/trendingposts.component';

const routes: Routes = [
  {path:"trending", component:TrendingpostsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routing=[TrendingpostsComponent]