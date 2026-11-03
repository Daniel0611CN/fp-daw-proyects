import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'contrasena'
})
export class ContrasenaPipe implements PipeTransform {

  transform(value:string, activar:boolean): unknown {
    if (activar) {
      return value;
    } else {
      let size = value.length;
      value = "";
      for (let i = 0; i < size; i++) {
        value += "*";
      }
      return value;
    }
  }

}
