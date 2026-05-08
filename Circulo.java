package Circulo;

public class Circulo {
	double radio= 0;
	double diametro =0;
	double perimetro= 0.0;
	double area= 0.0;

public Circulo (double radio, double diametro, double perimetro, double area) {
	this.radio=radio;
	this.diametro=diametro;
	this.perimetro = perimetro;
	this.area= area;
	
}
	
public double obtenerRadio() {
	return radio;
}
	
	
public double obtenerDiametro() {
	return diametro;
}
public double obtenerPerimetro() {
	return perimetro;
}
public double obtenerArea() {
	return area;
}

public void cambiarRadio(double nuevoRadio) {
	this.radio= nuevoRadio;
	System.out.println("Se cambio el valor del radio a : " +  nuevoRadio);
}

public void cambiarDiametro(double nuevoDiametro) {
	this.diametro=nuevoDiametro;
	System.out.println("Se cambio el valor del diametro a : " +  nuevoDiametro);
}
	

public void cambiarPerimetro(double nuevoPerimetro) {
	this.perimetro= nuevoPerimetro;
	System.out.println("Se cambio el valor del perimetro a : " +  nuevoPerimetro);
}
public void cambiarArea(double nuevoArea) {
	this.area= nuevoArea;
	System.out.println("Se cambio el valor del area a : " +  nuevoArea);
}

public static void main(String[] args) {
	Circulo circulito = new Circulo(5, 10 , 31.42, 78.54);
	
	System.out.println("obtener valor del Radio: " +  circulito.obtenerRadio());
	
	System.out.println("obtener valor del Diametro: " +  circulito.obtenerDiametro());
	
	System.out.println("obtener valor del Perimetro: " +  circulito.obtenerPerimetro());

	System.out.println("obtener valor del Area: " +  circulito.obtenerArea());
	
	System.out.println("-----------------------------------------------------" );
	
	circulito.cambiarRadio(12);
	circulito.cambiarDiametro(24);
	circulito.cambiarPerimetro(75.40);
	circulito.cambiarArea(452.39);
	
}









}
