import { Component, OnInit } from '@angular/core';
import { SereyService } from '../serey.service';

@Component({
  selector: 'app-trendingposts',
  templateUrl: './trendingposts.component.html',
  styleUrls: ['./trendingposts.component.css']
})
export class TrendingpostsComponent implements OnInit {
  likes:number
posts:any;
  constructor(private sereyService:SereyService) { }

  ngOnInit() {
    this.sereyService.getAllusers().subscribe((posts)=>{
      this.posts=posts;
      console.log(this.posts)
    })


   



  }
  onLike(likes:number){
    console.log("hello"+likes)
  this.likes=likes++;
  console.log(likes)
}
}
