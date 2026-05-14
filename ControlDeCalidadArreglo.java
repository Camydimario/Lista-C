package ArreglosB;

public class ControlCalidad {

	
	public static void main(String[] args) {
		int[] pesos = {102, 98, 100, 87, 105, 100, 111, 99, 103, 94, 100, 101};
		//La cantidad de piezas defectuosas.

		int defectuosa = 0;
		int noDefectuosas=0; // son las que estan entre 95 y 105
		for(int i = 0; i < pesos.length; i ++) {
			if(pesos[i] < 95 || pesos[i] > 105) {
			   defectuosa ++;
			  
			   
			
		    } else {
		    	noDefectuosas += pesos[i];
		    	noDefectuosas++;
		    }
			
			}
		
		System.out.println("La cantiad de piezas desfectuosas es de: " + defectuosa);
	
		//La cantidad de piezas perfectas.

	int perfectas = 0;
	
	for(int i = 0; i < pesos.length; i ++) {
   if(pesos[i] == 100) {
			perfectas ++;
		}
	}
	System.out.println("La cantiad de piezas perfectas es de: " + perfectas);
	
// peso promedio de las piezas no defectuosas si lo hay	
  double promedio = noDefectuosas/pesos.length;
System.out.println("El promedio de las piezas no defectuosas es de: " + promedio);
	   
//calcular porcentaje de defectos:
double porcentaje= (double)defectuosa / pesos.length * 100;
	 if(porcentaje >20) {
		   System.out.println("ALERTA: error de produccion");
}
   }
	}
