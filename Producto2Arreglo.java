//yo 
package ArreglosA;



public class Producto2 {

	String nombre;
	double precio;
	
	Producto2(String nombre, double precio) {
		    this.nombre = nombre;
		   this.precio = precio;
	 }

	public static void main(String[] args) {
		Producto2[] productos = {
			    new Producto2("leche", 150.0),
			    new Producto2("pan", 80.0),
			    new Producto2("queso", 420.0),
			    new Producto2("yogur", 95.0)
			};
		
	//double precioTotal=0;
    for(int i = 0; i <  productos.length; i ++) {
	   System.out.println("nombre del producto: " + productos[i].nombre+ " -->"+ " precio: $ " + productos[i].precio);
    }
    double precioTotal=0;
    for(int i = 0; i <  productos.length; i ++) {
    precioTotal += productos[i].precio;
	       System.out.println("El precio total es de: $" + precioTotal);
	
}
    Producto2 productoMasCaro = productos[0];
for(int i = 0; i <  productos.length; i ++) {
	if(productos[i].precio> productoMasCaro.precio) {
		productoMasCaro = productos[i];
		System.out.println("el producto mas caro es: " + productoMasCaro);
	}
}
  System.out.println("-----Se cambia el valor del pan-----");
        productos[1] = new Producto2("pan", 90.0);
        for(int i = 0; i <  productos.length; i ++) {
     	   System.out.println("nombre del producto: " + productos[i].nombre+ " -->"+ " precio: $ " + productos[i].precio);
      
}}
}
