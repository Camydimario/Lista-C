package ArreglosB;
import java.util.Arrays;

public class InformeFinanciero {
	public static void main(String[] args) {
	
	int[] ganancias = {120, -45, 300, -10, 85, -200, 60, 40, -5};

	//imprimi el conjunto normal 
	System.out.println("Conjunto normal dado :" + Arrays.toString(ganancias));
	
	//array reorganizado
	int negativos=0;
	for(int i = 0; i < ganancias.length; i ++) {
		if (ganancias[i] < 0) {
			int temporal = ganancias[i];
			ganancias[i] = ganancias[negativos];
			ganancias[negativos]= temporal;
			negativos++;
			
		}
		//16. explicacion la variable temporarl toma el negativo osea tengo -5 en ganancias lo tomo y lo guardo ahi.
		// 17.agarro el positivo y lo pongo atras, donde estaba el negativo.
		//18. agarra minegativo y lo pone adelante (en temporal)
		
		
		// osea
		
	}
	System.out.println(java.util.Arrays.toString(ganancias));
	}


	
	
	
}
