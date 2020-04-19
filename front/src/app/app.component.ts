import {Component} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {PlayerModel} from "./player.model";


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {


  players: PlayerModel [] = [];


  constructor(private http: HttpClient) {

    this.http.get<PlayerModel []>("/api/v1/players").subscribe(resp => {
      this.players = resp;
    })
  }
}
