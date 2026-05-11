package Ticket;

public class Ticket {

    /**
     * post: el Ticket se inicializa con importe 0.
     */
	double importe = 0;
	int cantidad=0;
    double precioUnitario=0;
	int productoTotales=0;
	double subtotal= 0;
	double descuento= 0;
double precioFinal=0;
	boolean abierto = true;
    
	
	
	
	public Ticket() {
    	int importe = 0;
    	this.importe = importe;
    	
    }

    /**
     * pre : cantidad y precio son mayores a cero. El ticket está abierto.
     * post: suma al Ticket un item a partir de la cantidad de
     *       de productos y su precio unitario.
     */
    public void agregarItem(int cantidad, double precioUnitario) {
    	if(cantidad > 0 && precioUnitario > 0) {
    		this.importe = cantidad * precioUnitario;
    	    subtotal = cantidad * precioUnitario;
    		productoTotales += cantidad;
    		importe++;
    		System.out.println("Se inicia la compra de " + cantidad + " productos al precio de $" + precioUnitario);
    		}
    	}

    /**
     * pre : está abierto y no se ha aplicado un descuento previamente.
     * post: aplica un descuento sobre el total del importe.
     */
    public void aplicarDescuento(double porcentaje) { 
    	this.descuento = importe * (porcentaje /100);
    	precioFinal = importe - descuento;
    	System.out.println("Se aplica el descuento del " + porcentaje + " %." + " El precio es de $" + descuento  + ". Queda un total de $" + precioFinal);
    	subtotal++;
    }

    /**
     * post: devuelve el importe acumulado hasta el momento,
     *       sin cerrar el Ticket.
     */
    public double calcularSubtotal() {
    	return subtotal;
    	//Es la suma del precio por producto nomas sin descuentos aplicados
    }
	
    /**
     * post: cierra el Ticket y devuelve el importe total.
     */
    public double calcularTotal() {
    	return precioFinal + subtotal;
    	//Es la suma del precio por producto coon descuentos aplicados
    }

    /**
     * post: devuelve la cantidad total de productos.
     */
    public int contarProductos() {
    	return productoTotales;
    }
    
public static void main (String []args) {
	Ticket tickesito = new Ticket();
	System.out.println("-----Compra N°1-----" );
	tickesito.agregarItem(3, 40.50);

	tickesito.aplicarDescuento(25);
	
	System.out.println("El Subtotal es de : $" + tickesito.calcularSubtotal());
	System.out.println("El Total es de: $" + tickesito.calcularTotal());
	System.out.println("La Cantitad de Productos total es : " + tickesito.contarProductos());
	
	System.out.println("-----Compra N°2-----" );
	tickesito.agregarItem(5, 70.00);

	tickesito.aplicarDescuento(15);
	
	System.out.println("El Subtotal es de : $" + tickesito.calcularSubtotal());
	System.out.println("El Total es de: $" + tickesito.calcularTotal());
	System.out.println("La Cantitad de Productos total es : " + tickesito.contarProductos());
	
	
	System.out.println("-----Compra N°3-----" );
	tickesito.agregarItem(1, 31.0);

	tickesito.aplicarDescuento(30);
	
	System.out.println("El Subtotal es de : $" + tickesito.calcularSubtotal());
	System.out.println("El Total es de: $" + tickesito.calcularTotal());
	System.out.println("La Cantitad de Productos total es : " + tickesito.contarProductos());
	

}

}
	
	

