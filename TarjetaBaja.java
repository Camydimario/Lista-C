package TarjetaBaja;

public class TarjetaBaja {

	private double saldoInicial=0;
	int pagoColectivo=0;
	int pagoSubte=0;
	int viajes=0;
	int viajeSubte=0;
	int viajeColectivo=0;
	
	

    /**
     * post: saldo de la Tarjeta en saldoInicial.
     */
    public TarjetaBaja(double saldoInicial) {
    
    		this.saldoInicial= saldoInicial;
    	}
    

    /**
     * post: devuelve el saldo actual de la Tarjeta
     */
    public double obtenerSaldo() { 
  
    	return saldoInicial;
    } 

    /**
     * post: agrega el monto al saldo de la Tarjeta.
     */
    public void cargar(double monto) { 
    	this.saldoInicial=monto;
    	System.out.println("Se carga el saldo con : $" + monto);
    	}
    

    /**
     * pre : saldo suficiente.
     * post: utiliza 21.50 del saldo para un viaje en colectivo.
      la pregunta es, me alcanza el saldo para pagar? si es si, bueno a mi saldo le resto ese valor.
     */
    public void pagarViajeEnColectivo() { 
    	double pagoColectivo = 21.50;
    	if(saldoInicial>pagoColectivo) {
    		this.saldoInicial= saldoInicial-pagoColectivo;
    		viajeColectivo++;
    		viajes++;
    	
    		
    	} else {
    		System.out.println("saldo insuficiente");
    	}
    }

    /**
     * pre : saldo suficiente.
     * post: utiliza 19.50 del saldo para un viaje en subte. 
     la pregunta es, me alcanza el saldo para pagar? si es si, bueno a mi saldo le resto ese valor.
     */
    public void pagarViajeEnSubte() {
    	double pagoSubte= 19.50;
    	if(saldoInicial>pagoSubte) {
    		this.saldoInicial= saldoInicial-pagoSubte;
    		viajeSubte++;
    		viajes++;
    		
    	}
    	else {
    		System.out.println("saldo insuficiente");
    	}
    }

    /**
     * post: devuelve la cantidad de viajes realizados.
     */
    public int contarViajes() {
    	return viajes++;
    }

    /**
     * post: devuelve la cantidad de viajes en colectivo.
     */
    public int contarViajesEnColectivo() {
    	return viajeColectivo;
    }

    /**
     * post: devuelve la cantidad de viajes en subte.
     */
    public int contarViajesEnSubte() {
    	return viajeSubte;
    }
    
    
    public static void main (String []args) {
    	TarjetaBaja tarjetita = new TarjetaBaja(1);
    	
    	tarjetita.obtenerSaldo();
    	System.out.println("El saldo actual es de : $" +tarjetita.obtenerSaldo());
    	
    	//se carga la targeta con 100$
    	tarjetita.cargar(100);
    	System.out.println("El saldo actual es de : $" +tarjetita.obtenerSaldo());
    	
      	//se paga un viaje en colectivo de 21.50$
    	System.out.println("Se paga el viaje en colectivo");
    	tarjetita.pagarViajeEnColectivo();
    	System.out.println("El saldo actual es de : $" +tarjetita.obtenerSaldo());
    	
     	//se paga un viaje en subte de 19.50$
    	System.out.println("Se paga el viaje en  subte");
    	tarjetita.pagarViajeEnSubte();
    	System.out.println("El saldo actual es de : $" +tarjetita.obtenerSaldo());
    	
    	//se paga un viaje en subte de 19.50$
    	System.out.println("Se paga el viaje en  subte");
    	tarjetita.pagarViajeEnSubte();
    	System.out.println("El saldo actual es de : $" +tarjetita.obtenerSaldo());
    	
    	//se paga un viaje en colectivo de 21.50$
    	System.out.println("Se paga el viaje en colectivo");
    	tarjetita.pagarViajeEnColectivo();
    	System.out.println("El saldo actual es de : $" +tarjetita.obtenerSaldo());
    	
    	
    	//se paga un viaje en colectivo de 21.50$
    	System.out.println("Se paga el viaje en colectivo");
    	tarjetita.pagarViajeEnColectivo();
    	System.out.println("El saldo actual es de : $" +tarjetita.obtenerSaldo());
    	
    	//se paga un viaje en subte de 19.50$
    	System.out.println("Se paga el viaje en  subte");
    	tarjetita.pagarViajeEnSubte();
    	System.out.println("El saldo actual es de : $" +tarjetita.obtenerSaldo());
    	
    	
    	
    	System.out.println("------------------Conteo---------------------");
    	
      	System.out.println("La cantidad de viajes realizados es : " + tarjetita.contarViajes());
      	
      	System.out.println("La cantidad de viajes en colectivo es : " + tarjetita.contarViajesEnColectivo());
    	
     	System.out.println("La cantidad de viajes en subte es : " + tarjetita.contarViajesEnSubte());
   
     	
     	
     	System.out.println("------------------Caso 2 ---------------------");
    	//se carga la targeta con 500$
    	tarjetita.cargar(500);
    	System.out.println("El saldo actual es de : $" +tarjetita.obtenerSaldo());
    	
      	//se paga un viaje en colectivo de 21.50$
    	System.out.println("Se paga el viaje en colectivo");
    	tarjetita.pagarViajeEnColectivo();
    	System.out.println("El saldo actual es de : $" +tarjetita.obtenerSaldo());
    	
     	//se paga un viaje en subte de 19.50$
    	System.out.println("Se paga el viaje en  subte");
    	tarjetita.pagarViajeEnSubte();
    	System.out.println("El saldo actual es de : $" +tarjetita.obtenerSaldo());
    	
    	//se paga un viaje en subte de 19.50$
    	System.out.println("Se paga el viaje en  subte");
    	tarjetita.pagarViajeEnSubte();
    	System.out.println("El saldo actual es de : $" +tarjetita.obtenerSaldo());
    	
    	//se paga un viaje en colectivo de 21.50$
    	System.out.println("Se paga el viaje en colectivo");
    	tarjetita.pagarViajeEnColectivo();
    	System.out.println("El saldo actual es de : $" +tarjetita.obtenerSaldo());
    	
    	
    	//se paga un viaje en colectivo de 21.50$
    	System.out.println("Se paga el viaje en colectivo");
    	tarjetita.pagarViajeEnColectivo();
    	System.out.println("El saldo actual es de : $" +tarjetita.obtenerSaldo());
    	
    	//se paga un viaje en subte de 19.50$
    	System.out.println("Se paga el viaje en  subte");
    	tarjetita.pagarViajeEnSubte();
    	System.out.println("El saldo actual es de : $" +tarjetita.obtenerSaldo());
    
       System.out.println("------------------Conteo---------------------");
    	
      	System.out.println("La cantidad de viajes realizados es : " + tarjetita.contarViajes());
      	
      	System.out.println("La cantidad de viajes en colectivo es : " + tarjetita.contarViajesEnColectivo());
    	
     	System.out.println("La cantidad de viajes en subte es : " + tarjetita.contarViajesEnSubte());
   
     	
    
    
    
    }
    
    
    
}
