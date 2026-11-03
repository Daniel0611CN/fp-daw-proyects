package EXAMEN.examenColecciones_Hector;

import EXAMEN.examenColecciones_Hector.elementosTienda.CarritoCompra;
import EXAMEN.examenColecciones_Hector.elementosTienda.Producto;

public class UsoTienda {
    
public static void main(String[] args) {
        
    
        // Creamos la tienda
        Tienda tienda = new Tienda();
            
        // Creamos los descuentos y los añadimos a la tienda
        //DescuentoPorCategoria descuentoElectronica = new DescuentoPorCategoria();
        tienda.getDescuentoPorCategoria().insertar("Electronica", 5);
        tienda.getDescuentoPorCategoria().insertar("Hogar", 10);
        tienda.getDescuentoPorCategoria().insertar("Hogar", 5);

        
        System.out.println("---- DESCUENTOS FIJADOS ----");
        System.out.println(tienda.getDescuentoPorCategoria().mostrarDescuentos());
        System.out.println();
        // Creamos los productos y los añadimos a la tienda
        Producto p1 = new Producto("Televisor Samsung", "Televisor de 50 pulgadas", 500.0, "Electronica");
        tienda.insertarProductoAlmacen(p1);
        
        Producto p2 = new Producto( "Zapatillas Nike", "Zapatillas deportivas para hombre", 80.0, "Deportes");
        tienda.insertarProductoAlmacen(p2);
        
        Producto pRepetido = new Producto( "Zapatillas Nike", "Zapatillas deportivas para hombre", 80.0, "Deportes");
        tienda.insertarProductoAlmacen(pRepetido);

        Producto p3 = new Producto( "Sofá cama", "Sofá cama de dos plazas", 300.0, "Hogar");
        tienda.insertarProductoAlmacen(p3);
        
        Producto p4 = new Producto( "Cámara Canon", "Cámara réflex digital", 600.0, "Electronica");
        tienda.insertarProductoAlmacen(p4);
        
        Producto p5 = new Producto( "Mesa de comedor", "Mesa de comedor extensible para 6 personas", 200.0, "Hogar");
        tienda.insertarProductoAlmacen(p5);
        
        Producto p6 = new Producto("Pantalones vaqueros", "Pantalones vaqueros para mujer", 50.0, "Moda");
        tienda.insertarProductoAlmacen(p6);
        
        Producto p7 = new Producto("Camiseta Adidas", "Camiseta de deporte para hombre", 30.0, "Deportes");
        tienda.insertarProductoAlmacen(p7);
        
        Producto p8 = new Producto( "Frigorífico Bosch", "Frigorífico de dos puertas", 800.0, "Hogar");
        tienda.insertarProductoAlmacen(p8);
        
        Producto p9 = new Producto("Smartphone Xiaomi", "Smartphone con pantalla de 6 pulgadas", 300.0, "Electronica");
        tienda.insertarProductoAlmacen(p9);
        
        Producto p10 = new Producto("Abrigo de lana", "Abrigo de lana para mujer", 100.0, "Moda");
        tienda.insertarProductoAlmacen(p10);
        

        //Mostramos los productos
        System.out.println("---- Productos por Nombre ---");
        System.out.println(tienda.mostrarProductosAlmacenPorNombre());

        System.out.println("---- Productos por Id ---");
        System.out.println(tienda.mostrarProductosAlmacenPorId());

        // Añadimos algunos productos al carrito de la compra
        CarritoCompra carrito = tienda.getCarritoDeCompra();
        
        carrito.insertar(p1);
        carrito.insertar(p7);
        carrito.insertar(p3);
        carrito.insertar(p7);
        carrito.insertar(p1);
        carrito.insertar(p8);

        System.out.println("---- Productos en el carrito de compra por Nombre---");
        System.out.println(carrito.mostrarPorNombre());

         System.out.println("---- Eliminamos productos del carrito de compra ---");
        carrito.eliminar(1);
        carrito.eliminar(5);
        carrito.eliminar(8);

        System.out.println("---- Productos en el carrito de compra por código---");
        System.out.println(carrito.mostrarPorCodigo());
       
        System.out.println("---- TOTAL ------");
        System.out.println("Total: "+ tienda.obtenerCuentaTotal() + " €");

    }
    
    /*
    ---- DESCUENTOS FIJADOS ----
    Electronica - 5.0% 
    Hogar - 10.0% 
    
    
    Producto con nombre Zapatillas Nike repetido
    ---- Productos por Nombre ---
    Producto{id=11, nombre='Abrigo de lana', descripcion='Abrigo de lana para mujer', precio=100.0, categoria='Moda'}
    Producto{id=8, nombre='Camiseta Adidas', descripcion='Camiseta de deporte para hombre', precio=30.0, categoria='Deportes'}
    Producto{id=5, nombre='Cámara Canon', descripcion='Cámara réflex digital', precio=600.0, categoria='Electrónica'}
    Producto{id=9, nombre='Frigorífico Bosch', descripcion='Frigorífico de dos puertas', precio=800.0, categoria='Hogar'}
    Producto{id=6, nombre='Mesa de comedor', descripcion='Mesa de comedor extensible para 6 personas', precio=200.0, categoria='Hogar'}
    Producto{id=7, nombre='Pantalones vaqueros', descripcion='Pantalones vaqueros para mujer', precio=50.0, categoria='Moda'}
    Producto{id=10, nombre='Smartphone Xiaomi', descripcion='Smartphone con pantalla de 6 pulgadas', precio=300.0, categoria='Electrónica'}
    Producto{id=4, nombre='Sofá cama', descripcion='Sofá cama de dos plazas', precio=300.0, categoria='Hogar'}
    Producto{id=1, nombre='Televisor Samsung', descripcion='Televisor de 50 pulgadas', precio=500.0, categoria='Electrónica'}
    Producto{id=2, nombre='Zapatillas Nike', descripcion='Zapatillas deportivas para hombre', precio=80.0, categoria='Deportes'}
    
    ---- Productos por Id ---
    Producto{id=1, nombre='Televisor Samsung', descripcion='Televisor de 50 pulgadas', precio=500.0, categoria='Electrónica'}
    Producto{id=2, nombre='Zapatillas Nike', descripcion='Zapatillas deportivas para hombre', precio=80.0, categoria='Deportes'}
    Producto{id=4, nombre='Sofá cama', descripcion='Sofá cama de dos plazas', precio=300.0, categoria='Hogar'}
    Producto{id=5, nombre='Cámara Canon', descripcion='Cámara réflex digital', precio=600.0, categoria='Electrónica'}
    Producto{id=6, nombre='Mesa de comedor', descripcion='Mesa de comedor extensible para 6 personas', precio=200.0, categoria='Hogar'}
    Producto{id=7, nombre='Pantalones vaqueros', descripcion='Pantalones vaqueros para mujer', precio=50.0, categoria='Moda'}
    Producto{id=8, nombre='Camiseta Adidas', descripcion='Camiseta de deporte para hombre', precio=30.0, categoria='Deportes'}
    Producto{id=9, nombre='Frigorífico Bosch', descripcion='Frigorífico de dos puertas', precio=800.0, categoria='Hogar'}
    Producto{id=10, nombre='Smartphone Xiaomi', descripcion='Smartphone con pantalla de 6 pulgadas', precio=300.0, categoria='Electrónica'}
    Producto{id=11, nombre='Abrigo de lana', descripcion='Abrigo de lana para mujer', precio=100.0, categoria='Moda'}
    
    ---- Productos en el carrito de compra por Nombre---
    Producto{id=8, nombre='Camiseta Adidas', descripcion='Camiseta de deporte para hombre', precio=30.0, categoria='Deportes'}
    Producto{id=8, nombre='Camiseta Adidas', descripcion='Camiseta de deporte para hombre', precio=30.0, categoria='Deportes'}
    Producto{id=9, nombre='Frigorífico Bosch', descripcion='Frigorífico de dos puertas', precio=800.0, categoria='Hogar'}
    Producto{id=4, nombre='Sofá cama', descripcion='Sofá cama de dos plazas', precio=300.0, categoria='Hogar'}
    Producto{id=1, nombre='Televisor Samsung', descripcion='Televisor de 50 pulgadas', precio=500.0, categoria='Electrónica'}
    Producto{id=1, nombre='Televisor Samsung', descripcion='Televisor de 50 pulgadas', precio=500.0, categoria='Electrónica'}
    
    ---- Eliminamos productos del carrito de compra ---
    ---- Productos en el carrito de compra por código---
    Producto{id=1, nombre='Televisor Samsung', descripcion='Televisor de 50 pulgadas', precio=500.0, categoria='Electrónica'}
    Producto{id=4, nombre='Sofá cama', descripcion='Sofá cama de dos plazas', precio=300.0, categoria='Hogar'}
    Producto{id=8, nombre='Camiseta Adidas', descripcion='Camiseta de deporte para hombre', precio=30.0, categoria='Deportes'}
    Producto{id=9, nombre='Frigorífico Bosch', descripcion='Frigorífico de dos puertas', precio=800.0, categoria='Hogar'}
    
    ---- TOTAL ------
    //Total sin descuento: 1630.0
    Total: 1467.0 €
    
    */

}
