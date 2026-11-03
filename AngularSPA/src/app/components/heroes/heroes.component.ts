import {Component, OnInit} from '@angular/core';
import {HeroesService, Heroe} from '../../services/heroes.service';
import {CommonModule} from '@angular/common';
import {Router} from '@angular/router';
import {HeroeTarjetaComponent} from '../heroe-tarjeta/heroe-tarjeta.component';

@Component({
  selector: 'app-heroes',
  imports: [CommonModule, HeroeTarjetaComponent],
  templateUrl: './heroes.component.html',
  styleUrl: './heroes.component.css',
})
export class HeroesComponent implements OnInit {
  heroes:Heroe[] = [];

  constructor(private _heroesService: HeroesService, private router:Router) {}
  ngOnInit(): void {
    this.heroes = this._heroesService.getHeroes();
  }
  verHeroe(idx:Number) {
    this.router.navigate(['/heroe', idx]);
  }
}
