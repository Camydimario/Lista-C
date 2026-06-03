package aguaParalasovejas;;
// es la clase corral del problema de agua para las ovejas. incluye el uso de la clase PuntoCorral.java subido a gitgub
public class Corral {
	private int norte;
	private int sur;
	private int este;
	private int oeste;

	public Corral (Puntos p1, Puntos p2, Puntos p3, Puntos p4) {
	this.norte = Math.max(Math.max(p1.getX(), p2.getX()), Math.max(p3.getX(), p4.getX()));
	this.sur= Math.min(Math.min(p1.getX(), p2.getX()), Math.min(p3.getX(), p4.getX()));
	
	this.este= Math.max(Math.max(p1.getY(), p2.getY()), Math.max(p3.getY(), p4.getY()));
	this.oeste = Math.min(Math.min(p1.getY(), p2.getY()), Math.min(p3.getY(), p4.getY()));
	
	
	}
	
	

public int cuantasBebidasAdentro(Puntos[] bebidas){
	int contarbebidas=0;
	for(int i= 0; i < bebidas.length;i++) {
		if(bebidas[i].getX() >= this.sur&& bebidas [i].getX() <= this.norte &&
			bebidas[i].getY() >= this.oeste && bebidas [i].getY() <= this.este ) {
			contarbebidas++;
			
		}
	}
	
	
	return contarbebidas;	
}

public static void main(String[] args) {
	Corral corralito = new Corral(new Puntos(4, -4), new Puntos(4, 7), new Puntos(-3, 7), new Puntos(-3, -4));
	Puntos[] bebidas = { new Puntos(-3, -2), new Puntos(5, 5), new Puntos(2, 3), new Puntos(-4, 10), new Puntos(0, -7) };
   
	System.out.println("Cuantas bebidas hay andentro? : " + corralito.cuantasBebidasAdentro(bebidas));
	//hacer mas test y subir
	
}	
	
