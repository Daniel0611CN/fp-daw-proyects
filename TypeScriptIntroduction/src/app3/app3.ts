/*
// En este caso, objeto es un parámetro con un valor por defecto;
// Sin embargo, momento es un parámetro opcional;
function activar(quien:string, objeto:string = "batiseñal", momento?:string) {
    // Los parámetros obligatorios deben ir al principio;
    let mensaje:string;

    if (momento) {
        mensaje = `${quien} activo la ${objeto} en la ${momento}`;
    } else {
        mensaje = `${quien} activo la ${objeto}`;
    }

    console.log(mensaje);
}

activar("Gordon");
*/