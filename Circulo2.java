package Circulo2;



public class Circulo2 {
	    private double radio;

	    // Constructor: Solo necesitamos el radio para definir todo el círculo
	    public Circulo2(double radio) {
	        this.radio = radio;
	    }

	    // --- GETTERS (Obtener) ---
	    public double obtenerRadio() {
	        return radio;
	    }

	    public double obtenerDiametro() {
	        return radio * 2;
	    }

	    public double obtenerPerimetro() {
	        return 2 * Math.PI * radio;
	    }

	    public double obtenerArea() {
	        return Math.PI * Math.pow(radio, 2);
	    }

	    // --- SETTERS (Cambiar) ---
	    public void cambiarRadio(double nuevoRadio) {
	        this.radio = nuevoRadio;
	    	System.out.println("Se cambio el valor del radio a : " +  nuevoRadio);
	    }

	    // Si cambias el diámetro, en realidad estás cambiando el radio
	    public void cambiarDiametro(double nuevoDiametro) {
	        this.radio = nuevoDiametro / 2;
	    	System.out.println("Se cambio el valor del Diametro a : " +  nuevoDiametro);
	    }

	    // Si cambias el perímetro, despejamos el radio: r = P / (2 * PI)
	    public void cambiarPerimetro(double nuevoPerimetro) {
	        this.radio = nuevoPerimetro / (2 * Math.PI);
	    	System.out.println("Se cambio el valor del Perimetro a : " +  nuevoPerimetro);
	    }

	    // Si cambias el área, despejamos el radio: r = raíz(Área / PI)
	    public void cambiarArea(double nuevaArea) {
	        this.radio = Math.sqrt(nuevaArea / Math.PI);
	    	System.out.println("Se cambio el valor del area a : " +  nuevaArea);
	    }
	


public static void main(String[] args) {
	Circulo2 circulito = new Circulo2(5);
	
	System.out.println("obtener valor del Radio: " +  circulito.obtenerRadio());
	
	System.out.println("obtener valor del Diametro: " +  circulito.obtenerDiametro());
	
	System.out.println("obtener valor del Perimetro: " +  circulito.obtenerPerimetro());

	System.out.println("obtener valor del Area: " +  circulito.obtenerArea());
	
	System.out.println("-----------------------------------------------------" );
	
circulito.cambiarRadio(6);
circulito.cambiarDiametro(2);
circulito.cambiarPerimetro(0);
circulito.cambiarArea(0);


}
}
