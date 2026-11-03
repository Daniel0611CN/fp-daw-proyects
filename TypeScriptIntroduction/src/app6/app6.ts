/*
let prom1 = new Promise<void>(function (resolve, reject) {

    setTimeout(() => {
        console.log("Promesa Terminada");

        // Termina bien
        // resolve();

        // Termina mal
        reject()
    }, 1500);
})

console.log("Paso 1");

prom1.then(function() {
    console.log("Ejecutarme cuando se termine bien!");
},
    function(error) {
        console.log("Ejecutar si todo sale mal");
    }
)

console.log("Paso 2");
 */