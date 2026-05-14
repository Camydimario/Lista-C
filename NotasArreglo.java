package ArreglosA;


public class Notas {	
	
public static void main(String[] args) {
	int[] notas = {7, 5, 8, 4, 9, 6, 5};

	int sumarNotas = 0;
	

	for (int i =0; i < notas.length; i++) {
		  sumarNotas += notas[i];
		} 
	double promedio =  sumarNotas / notas.length;
		
	boolean aprobo = promedio >=4;
		
System.out.println("Sumas de Notas : " + sumarNotas);
System.out.println("Promedio de Notas : " + promedio);
System.out.println("Esta aprobado? : " + aprobo);

}
