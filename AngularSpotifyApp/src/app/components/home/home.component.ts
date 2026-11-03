import { Component, OnInit } from '@angular/core';
import { SpotifyService } from '../../services/spotify.service';
import { CommonModule } from '@angular/common';
import { TarjetasComponent } from '../shared/tarjetas/tarjetas.component';
import { LoadingComponent } from '../shared/loading/loading.component';

@Component({
  selector: 'app-home',
  imports: [
    CommonModule,
    TarjetasComponent,
    LoadingComponent
  ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent implements OnInit {
  // paises: any[] = []
  nuevasCanciones: any[] = [];
  loading: boolean;
  error: boolean;
  mensajeError: string = "";

  constructor(/* private http: HttpClient */ private spotify: SpotifyService) {

    this.loading = true;
    this.error = false;

    this.spotify.getNewReleases()
      .subscribe((info: any)  => {
        this.nuevasCanciones = info;
        this.loading = false;
      }, (errorServicio) => {
        this.loading = false;
        this.error = true;
        this.mensajeError = errorServicio.error.error.message;
      })

    /* this.http.get('https://restcountries.com/v3.1/lang/spanish').subscribe((resp: any) => { this.paises = resp; }) */
  }
  ngOnInit() {}
}
