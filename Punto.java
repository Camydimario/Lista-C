package Punto;

public class Punto {
double valorX = 0;	
double valorY=0;

public Punto(double valorX, double valorY) {
	this.valorX= valorX;
	this.valorY=valorY;
	
}
//se le pasa por parametro el valor, y te muestra el valor con el return 
public double obtenerX() {
	return valorX;
	
}

//se le pasa por parametro el valor, y te muestra el valor con el return
public double obtenerY() {
	return valorY;
}

public void cambiarX(double nuevoX) {

    this.valorX= nuevoX;
    System.out.println("Se cambia el valor de X a : " + nuevoX);
}
	
public void cambiarY(double nuevoY) {
	 this.valorY= nuevoY;
	 System.out.println("Se cambia el valor de Y a : " + nuevoY);
}
public boolean estaSobreEjeX() {

	return valorY == 0;
}

public boolean estaSobreEjeY() {
	return valorX == 0;
}

public boolean esElOrigen() {
	if(valorX == 0 && valorY == 0) {
		
	}
	return valorX == 0 && valorY==0;
}

public static void main(String[] args) {
  Punto puntito = new Punto(1,3);
  
  System.out.println("obtener valor X: " +  puntito.obtenerX());
  
 
  System.out.println("obtener valor Y: " +   puntito.obtenerY());
  
  puntito.cambiarX(0);
  puntito.cambiarY(0);
  System.out.println("Esta sobre el eje x ?: " +   puntito.estaSobreEjeX());
  System.out.println("Esta sobre el eje y ?: " +   puntito.estaSobreEjeY());
  System.out.println("Es el origen ?: " +    puntito.esElOrigen());

  

	}
}
