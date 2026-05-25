package PracticasArreglos;
import java.util.Arrays;

public class Temperaturas {

	public Temperaturas() {
		
		
	}
	

//acumulador
/**
 * pre: se realiza una suma
 * l 
 * post: devuelve el total de las temperaturas
 * 
 */

public int suma (int [] temperaturas) {
	
	int suma = 0;
	for(int i =0; i < temperaturas.length; i ++) {
		suma += temperaturas[i];
		
	}
	return suma;
}

// promedio 
/**
 * 
 * post: devuelve el promedio de las temperaturas
 */
public double promedio (int [] temperaturas) {
	double suma = 0;
	for(int i =0; i < temperaturas.length; i ++) {
		suma += temperaturas[i];
	}
	return (double) suma/ temperaturas.length;
}

//porcentaje de las temperaturas

/**
 * post: devuelve el porcentaje de las temperaturas
 */

public double porcentaje ( int [] temperaturas) {
	double sumita=0;
	for(int i =0; i < temperaturas.length; i ++) {
		sumita += temperaturas[i];
		
	}
	return (double)  (sumita/temperaturas.length) *100;
} 


/**
 * post: devuelve el total de temperaturas positivas
 */
public int contarPositivos(int [] temperaturas) {
	int contarPositivas = 0;
	for(int i =0; i < temperaturas.length; i ++) {
		if(temperaturas[i]> 0) {
			contarPositivas++;
		}
	}
	return contarPositivas;
}

//existencia

/**
 * 
 * pre: se pretende saber si existe la tempratura de 15 grados
 * post: devuelve la verificacion de su existencia 
 */

public boolean existencia(int[] temperaturas) {
	int buscado = 15;
	boolean existe =  false;
	for(int i =0; i < temperaturas.length; i ++) {
		if(temperaturas[i]== buscado ) {
			existe=  true;
		}
	}
	
	return existe;
	
}


//posiciones
/**
 * pre: se plantea encontrar a posicion de la temperatuta de cero grados, sino existe, devuelve -1.
 * post: devuelve la poscicion
 */

public int posicion (int [] temperaturas) {
	int posicion = -1;
	int buscado=0;
	for(int i =0; i < temperaturas.length && posicion == -1; i ++) {
	if(temperaturas[i] == buscado) {
		posicion = i;
	}
	}
	return posicion;
}

//filtracion

/**
 * 
 * pre: se plantea contar todos los negativos , ignorando el mas bajo
 * pos: devuevelve el total de temperaturas negativas
 */

public int filtrarnegativos(int [] temperaturas) {

//cual es el mas bajo?
	
int masbajo = temperaturas[0];
for(int i =0; i < temperaturas.length; i ++) {
	if(temperaturas[i]< masbajo) {
		masbajo = temperaturas[i];
	}
	}
System.out.println("El elemento mas bajo es :" + masbajo);

int contarbajos =0;
for(int i =0; i < temperaturas.length; i ++) {
	if(temperaturas[i] != masbajo) {
		contarbajos++;
	}
}
	
return contarbajos;

}

//señalar

/**
 * 
 * post: devuelve el maximo
 */

public double temperaturamaxima(int [] temperaturas) {
	double maximo = temperaturas[0];
	for(int i =1; i < temperaturas.length; i ++) {
		if( temperaturas[i] > maximo) {
			maximo = temperaturas[i];
		}
	}
	return maximo;
}


/**
 * 
 * post: devuelve el minimo 
 */

public double temperaturaminima(int[] temperaturas) {
	double minimo = temperaturas[0];
	for(int i =1; i < temperaturas.length; i ++) {
	if(temperaturas[i] < minimo) {
		minimo = temperaturas[i];
	}
	
}
	return minimo;
}

/**
 * 
 * pre: se plante una array de solamente temperaturas positivas
 * post: devuelve un nuevo array solo positivos
 * 
 */

public int [] solopositivos(int [] temperaturas) {
	int contarposi = 0;
	for(int i =0; i < temperaturas.length; i ++) {
		if( temperaturas[i]>= 0) {
			contarposi++;
		}
	} 
//7
int marcador=0;
int [] positivos = new int [contarposi];
for(int i =0; i < temperaturas.length; i++) {
	if(temperaturas[i] >= 0) {
		positivos[marcador] = temperaturas[i];
		marcador++;
	}
} 

return positivos;


}


/**
 * 
 * pre: se evalua un nuevo array que sea solo negativo, sobre ese mismo se saca el periodo
 * 
 * post: devuelve el periodo del nuevo array negativos
 */

public double promedionegativos(int [] temperaturas) {
	
	int contarnegativos=0;
	for(int i =0; i < temperaturas.length; i ++) {
		if(temperaturas[i] < 0) {
			contarnegativos++;
		}
	}
	
	int [] negativos = new int [contarnegativos];
	int marcador= 0;
	for(int i =0; i < temperaturas.length; i ++) {
		if(temperaturas[i]<0) {
			negativos[marcador]= temperaturas[i];
			marcador++;
		}
	}
	
	double suma =0;
	for(int i =0; i < negativos.length; i ++) {
		suma += negativos[i];
		
	}
	
return (double) suma/negativos.length;
	
}

//remplazar la temperatura de cero por 11

/*
 * 
 * pre: se busca el elemento cero, una vez encontrado se reemplaza por 11
 * post: devuelve el array con a temperatura modificada
 */

public void remplazo(int [] temperaturas) {
	//existe el cero?
	
	boolean existe = false;
	for(int i =0; i < temperaturas.length; i ++) {
		if(temperaturas[i] == 0) {
			existe= true;
			
		}
	}
	
	for(int i =0; i < temperaturas.length && existe; i ++) {
		if(temperaturas[i] == 0) {
			temperaturas[i] = 11;
			
		}
	}
	
	
	
	
	
	//si existe se busca el elemento y lo remplaza
}

public static void main(String[] args) {
	Temperaturas temp =  new Temperaturas();
	int [] temperaturas = {12, 15, 25, 30, 35, -1, 0, -10, 17 , - 3, 10};

	System.out.println("La suma es de: " + temp.suma(temperaturas));
	
	System.out.println("Promedio es de: " + temp.promedio(temperaturas));
	
	System.out.println("El porcentaje es de: " + temp.porcentaje(temperaturas));
	
	System.out.println("El total de los positivos es de: " + temp.contarPositivos(temperaturas));
	
	System.out.println("Existe la temperatura de 15°?: " + temp.existencia(temperaturas));
	
	System.out.println("En que posicion esta el elemento 0°? " + temp.posicion(temperaturas));
	
	System.out.println("El total de negativos menos el mas bajo: " + temp.filtrarnegativos(temperaturas));
	
	System.out.println("La temperatura maxima es de : " + temp.temperaturamaxima(temperaturas));
	
	System.out.println("La temperatura minima es de : " + temp.temperaturaminima(temperaturas));
	
	int [] solopositivos= temp.solopositivos(temperaturas);
	System.out.println("El array de positivos es: " + Arrays.toString(solopositivos));
	
	System.out.println("El promedio de los negativos es de: " + temp.promedionegativos(temperaturas));
	
	temp.remplazo(temperaturas);
	System.out.println("Remplazo del elemento 0° a 11°: " + Arrays.toString(temperaturas));
	
}}


