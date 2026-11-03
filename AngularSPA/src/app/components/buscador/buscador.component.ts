import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {HeroesService} from '../../services/heroes.service';
import {CommonModule} from '@angular/common';
import {HeroeTarjetaComponent} from '../heroe-tarjeta/heroe-tarjeta.component';

@Component({
  selector: 'app-buscador',
  imports: [CommonModule, HeroeTarjetaComponent],
  templateUrl: './buscador.component.html',
  styleUrl: './buscador.component.css'
})
export class BuscadorComponent implements OnInit {
  heroes:any[] = [];
  termino:string = "";

  constructor(private activatedRoute: ActivatedRoute, private _heroesService: HeroesService) {}
  ngOnInit() {
    this.activatedRoute.params.subscribe(params => {
      this.termino = params['termino'];
      this.heroes = this._heroesService.buscarHeroes(params['termino']);
    });
  }
}
