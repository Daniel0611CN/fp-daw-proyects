import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { map } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class SpotifyService {
  url = "https://api.spotify.com/v1/";
  token = "BQDVzdhDWLIerBptC4KAF4ZC7FaHCJRxe_AEj8_nERKAAU30KG8pDy1Xk7nM8qyoPp3_PJ2iyutWlXFva-33XVoY-SfQnCqDKFAzlQWW8WmmsNo9EzdaJHokCAF_LeQvJHGCLi4lug0";

  constructor(private http: HttpClient) {
    console.log('Spotify Service Initialized.');
  }

  getQuery(query: string) {
    const link = this.url + `${ query }`;
    const headers = new HttpHeaders({
      'Authorization': `Bearer ` + this.token
    });

    return this.http.get(link, { headers });
  }

  getNewReleases() {
    return this.getQuery('browse/new-releases')
      .pipe(map((info: any) => info['albums'].items));
  }

  getArtistas(termino: string) {
    return this.getQuery(`search?q=${ termino }&type=artist`)
      .pipe(map((info: any) => info['artists'].items));
  }

  getArtista(id: string) {
    return this.getQuery(`artists/${ id }`);
  }

  getTopTracks(id: string) {
    return this.getQuery(`artists/${ id }/top-tracks?country=us`)
      .pipe(map((info: any) => info['tracks']));
  }

}
