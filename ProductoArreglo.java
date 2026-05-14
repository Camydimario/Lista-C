package ArreglosA;

public class Producto {

String nombre;
double precio;
Producto(String nombre, double precio) {
	    this.nombre = nombre;
	   this.precio = precio;
 }

public static void main(String[] args) {
	Producto[] productos = {
		    new Producto("leche", 150.0),
		    new Producto("pan", 80.0),
		    new Producto("queso", 420.0),
		    new Producto("yogur", 95.0)
		};

double precioCarrito=0;
	//for each
for(Producto cadaProducto : productos) {
	precioCarrito += cadaProducto.precio;
System.out.println(cadaProducto);
		}
System.out.println("Precio del carrito " + precioCarrito);

//precio mas caro con un for 
Producto masCaro = productos[0];
for (int i =0; i < productos.length; i ++) {
	if(productos[i].precio > masCaro.precio) {
		masCaro = productos[i];
		System.out.println("Producto mas caro es: " + masCaro);	
}
// remplazar le precio del pan por 90
	
	
	
	
}

}
