import { Component, Input } from '@angular/core';
import { NgForOf } from '@angular/common';
import { NoimagePipe } from '../../../pipes/noimage.pipe';
import { Router } from '@angular/router';

@Component({
  selector: 'app-tarjetas',
  imports: [
    NgForOf,
    NoimagePipe,
  ],
  templateUrl: './tarjetas.component.html'
})
export class TarjetasComponent {
  @Input() items: any[] = [];

  constructor(private router: Router) {}

  verArtista(item: any) {
    let artistaId;

    if (item.type === 'artist') {
      artistaId = item.id;
    } else {
      artistaId = item.artists[0].id;
    }

    this.router.navigate(['/artist', artistaId]);
  }
}
