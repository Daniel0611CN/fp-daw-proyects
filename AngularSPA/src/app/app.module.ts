import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {FormsModule} from '@angular/forms';

// Rutas
import {APP_ROUTING} from './app.routes';

// Servicios
import {HeroesService} from './services/heroes.service';

// Componentes
import {NavbarComponent} from './components/shared/navbar/navbar.component';
import {HomeComponent} from './components/home/home.component';
import {AboutComponent} from './components/about/about.component';
import {HeroesComponent} from './components/heroes/heroes.component';
import {HeroeComponent} from './components/heroe/heroe.component';
import {HeroeTarjetaComponent} from './components/heroe-tarjeta/heroe-tarjeta.component';

@NgModule({
  imports: [BrowserModule, FormsModule, NavbarComponent, HomeComponent, AboutComponent,
    HeroesComponent, HeroeComponent, HeroeTarjetaComponent, APP_ROUTING],
  providers: [HeroesService],
})
export class AppModule { }
