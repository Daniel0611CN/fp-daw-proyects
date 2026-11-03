import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-body',
  templateUrl: './body.component.html', // Para Obtener HTML;
  imports: [CommonModule]
})
export class BodyComponent {
  mostrar:boolean = true;

  frase: any = {
    mensaje: 'Un gran poder requiere una gran responsabilidad',
    autor: 'Ben Parker'
  }

  personajes: string[]= ['Spiderman', 'Venom', 'Dr. Octopus'];

}
