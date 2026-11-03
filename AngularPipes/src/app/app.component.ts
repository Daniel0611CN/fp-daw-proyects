import {Component} from '@angular/core';
import {RouterOutlet} from '@angular/router';
import {AsyncPipe, CurrencyPipe, DatePipe, DecimalPipe, JsonPipe, LowerCasePipe, NgForOf, PercentPipe, SlicePipe, UpperCasePipe} from '@angular/common';
import {CapitalizadoPipe} from './pipes/capitalizado.pipe';
import {DomseguroPipe} from './pipes/domseguro.pipe';
import {ContrasenaPipe} from './pipes/contraseña.pipe';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, UpperCasePipe, LowerCasePipe, SlicePipe, NgForOf, DecimalPipe, PercentPipe, CurrencyPipe, JsonPipe, AsyncPipe, DatePipe, CapitalizadoPipe, DomseguroPipe, ContrasenaPipe],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'angularPipes';

  nombre = 'Dani';
  arreglo = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
  PI = Math.PI;
  a = 0.234;
  salario = 1234.5;

  heroe = {
    nombre: "Logan",
    clave: "Wolverine",
    edad: 500,
    direccion: {
      calle: "Primera",
      casa: "19"
    }
  }

  valorDePromesa = new Promise((resolve, reject) => {
    setTimeout(() => resolve('Llego la info!'), 3500);
  });

  fecha = new Date();

  nombre2 = "daNi claVIjo nuÑez";

  video = "mOeSfOJrUIk";

  activar:boolean = true;

}
