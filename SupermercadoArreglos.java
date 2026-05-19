package PracticasArreglos;

import java.lang.reflect.Array;

public class Supermercado {
	
	private String producto;
	private int cantidad;
	private double precio;
	public Supermercado (String producto, int cantidad, double precio) {
	this.producto= producto;
	this.cantidad=cantidad;
	this.precio=precio;
	}

	public static void main (String []args) {

	Supermercado[] inventario = {
		
		new Supermercado("arroz", 5, 25.0 ),
		new Supermercado ("fideos", 4, 35.3),
		new Supermercado ("salsa", 10, 12),
		new Supermercado("aceite", 2, 15.50),
		
		
	};
	
	// mostrar los productos
	
	for(int i=0; i < inventario.length; i ++) {
		System.out.println("Productos: " + inventario[i].producto);
	}
	
	//sumar precios totales
	int sumarPrecios=0;
	for(int i =0; i < inventario.length; i ++) {
		sumarPrecios += inventario[i].precio;
	}
		System.out.println("El precio Total es de :" + sumarPrecios);
	
		
	//sacar producto mas caro
	
	Supermercado masCaro= inventario[0];
	for(int i =0; i < inventario.length; i ++) {
		if(inventario[i].precio> masCaro.precio) {
			masCaro= inventario[i];
			System.out.println("el producto mas caro es:" + masCaro);
		}
	}
	//cambiar el precio del arroz, por 35 pesos
	System.out.println("se cambio el precio del pan");
	inventario[0]= new Supermercado ("arroz", 5, 35.0);
	for(int i =0; i < inventario.length; i ++) {	
		System.out.println("Productos: " + inventario[i].producto + "precios" + inventario[i].precio);
	}
	
	
		//mostrar el producto mas barato
		Supermercado masBarato= inventario[0];
		int productosConElMismoPrecio=0;
		for(int i =0; i < inventario.length; i ++) {
		 if(inventario[i].precio > masBarato.precio) {
			 masBarato = inventario[i];
		 }
		 else if (inventario[i] == masBarato) {
			 productosConElMismoPrecio++;
		 }
		 
		}
		System.out.println("El producto mas barato es :" + masBarato +"hay "+ productosConElMismoPrecio + "" + "producto con el mismo precio" );

		//contar la cantidad de productos
		int totalDeCantidades=0;
		for(int i =0; i < inventario.length; i ++) {
			totalDeCantidades += inventario[i].cantidad;
				
			}
		System.out.println("la cantidad de porductos es de: " + totalDeCantidades);
		}
		
		
		
		
	
	@Override
	public String toString() {
		return  producto + "," + precio ;
	}



}
