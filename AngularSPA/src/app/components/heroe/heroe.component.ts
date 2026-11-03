import {Component} from '@angular/core';
import {ActivatedRoute, RouterLink} from '@angular/router';
import {HeroesService} from '../../services/heroes.service';
import {CommonModule} from '@angular/common';

@Component({
  selector: 'app-heroe',
  imports: [RouterLink, CommonModule],
  templateUrl: './heroe.component.html',
  styleUrl: './heroe.component.css'
})
export class HeroeComponent {
  heroe:any = {};

  constructor(private activatedRoute: ActivatedRoute,
              private _heroesService: HeroesService) {
      this.activatedRoute.params.subscribe(params => {
      this.heroe = this._heroesService.getHeroe(params['id']);
    });
  }

}
