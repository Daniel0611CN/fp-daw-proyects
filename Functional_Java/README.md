<div align="center">
    <h1>Functional Java</h1>
    <p>La clase PruebaInterfaces, usa un Supplier. Un supplier, es un lambda que se usa en BigData, para usar con tipos primitivos de datos, ya que su espacio en memoria es menor que el de los Objetos en Java.</p>
    <p></p>
    <p>En el ejemplo, usamos un supplier de Integer, en el que no se le pasa nada al lambda inicial, y le indicamos que devuelva un random de enteros. Finalmente imprimimos este, a través del método get, que obtiene el valor del resultado del lambda.</p>
    <p></p>
    <p>Después del supplier, encontramos un Function, al que le pasa un valor String, y devolverá un valor Integer. Es por ello, que le pasamos una variable S, que se va a amoldar a la estructura, por lo que será String, y devuelve su longitud, que es un valor Integer. Es por ello que como está amoldado a la estructura de la función, no dará error. Finalmente, debemos utilizar el método apply, que devolverá el valor Integer de la función</p>
    <p></p>
    <p>Después usamos además el UnaryOperator, y el Predicate</p>
</div>