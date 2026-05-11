package Ticket;

public class Ticket {

    /**
     * post: el Ticket se inicializa con importe 0.
     */
	double importe = 0;
	int cantidad=0;
    double precioUnitario=0;
	int item=0;
	int subtotal= 0;
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
    		importe++;
    		subtotal++;
    		
    		}
    	}

    /**
     * pre : está abierto y no se ha aplicado un descuento previamente.
     * post: aplica un descuento sobre el total del importe.
     */
    public void aplicarDescuento(double porcentaje) { 
    	this.descuento = importe * (porcentaje /100);
    	precioFinal = importe - descuento;
    }

    /**
     * post: devuelve el importe acumulado hasta el momento,
     *       sin cerrar el Ticket.
     */
    public double calcularSubtotal() {
    	return subtotal;
    }
	
    /**
     * post: cierra el Ticket y devuelve el importe total.
     */
    public double calcularTotal() {
    	return importe + subtotal;
    }

    /**
     * post: devuelve la cantidad total de productos.
     */
    public int contarProductos() {
    	return cantidad;
    }
    
public static void main (String []args) {
	Ticket tickesito = new Ticket();
	
	tickesito.agregarItem(3, 40.69);

	tickesito.aplicarDescuento(25);
	
	tickesito.calcularTotal();
	
	tickesito.calcularTotal();
	
	tickesito.contarProductos();
	
	
	
	
	
	
	
}

	
	
	
	
}
