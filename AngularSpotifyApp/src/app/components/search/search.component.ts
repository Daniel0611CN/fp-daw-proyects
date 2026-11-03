import { Component } from '@angular/core';
import { SpotifyService } from '../../services/spotify.service';
import { TarjetasComponent } from '../shared/tarjetas/tarjetas.component';
import { LoadingComponent } from '../shared/loading/loading.component';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-search',
  imports: [
    TarjetasComponent,
    LoadingComponent,
    CommonModule
  ],
  templateUrl: './search.component.html',
  styleUrl: './search.component.css'
})
export class SearchComponent {
  artistas: any[] = [];
  loading: boolean = false;

  constructor(private spotify: SpotifyService) {}

  buscar(termino:string) {
    this.loading = true;
    this.spotify.getArtistas(termino)
      .subscribe((info: any) => {
        this.artistas = info;
        this.loading = false;
      });
  }
}
