import {Component, OnInit} from '@angular/core';
import {RouterModule, RouterLink, Router} from '@angular/router';
import {HeroesService} from '../../../services/heroes.service';

@Component({
  selector: 'app-navbar',
  imports: [RouterModule, RouterLink],
  providers: [HeroesService],
  templateUrl: './navbar.component.html'
})
export class NavbarComponent implements OnInit {
  constructor(private router:Router) {}
  ngOnInit() {}
  buscarHeroe(termino:string) {
    this.router.navigate(['/buscador', termino]);
  }
}
