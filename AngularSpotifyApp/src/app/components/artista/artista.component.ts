import { Component } from '@angular/core';
import { ActivatedRoute, RouterLink } from '@angular/router';
import { SpotifyService } from '../../services/spotify.service';
import { NoimagePipe } from '../../pipes/noimage.pipe';
import { LoadingComponent } from '../shared/loading/loading.component';
import { CommonModule } from '@angular/common';
import {SafeUrlPipe} from '../../pipes/safeurl.pipe';

@Component({
  selector: 'app-artista',
  imports: [
    NoimagePipe,
    RouterLink,
    LoadingComponent,
    CommonModule,
    SafeUrlPipe,
  ],
  templateUrl: './artista.component.html',
  styleUrl: './artista.component.css'
})
export class ArtistaComponent {
  artista: any = {};
  topTracks: any[] = [];
  loadingArtist: boolean;

  constructor(private router: ActivatedRoute,
              private spotify: SpotifyService) {
    this.loadingArtist = true;
    this.router.params.subscribe(params => {
      this.getArtista(params['id']);
      this.getTopTracks(params['id']);
    })
  }

  getArtista(id: string) {
    this.spotify.getArtista(id)
      .subscribe(artista => {
        this.artista = artista;
        this.loadingArtist = false;
      });
  }

  getTopTracks(id: string) {
    this.spotify.getTopTracks(id)
      .subscribe(topTracks => {
        this.topTracks = topTracks;
      })
  }
}
