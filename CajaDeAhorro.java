package CajaDeAhorro;

public class CajaDeAhorro {
	 /**
     * post: la instancia queda asignada al titular indicado
     *   	    y con saldo igual a 0.
     */
	double saldo = 0;
	String titularDeLaCuenta = "";
	
    public CajaDeAhorro(String titularDeLaCuenta) { 
    	this.titularDeLaCuenta = titularDeLaCuenta;
    	
    	
    }
    
    /**
     * post: devuelve el nombre del titular de la Caja de Ahorro.
     */
    public String obtenerTitular() {
    	return titularDeLaCuenta;
    }

    /**
     * post: devuelve el saldo de la Caja de Ahorro.
     */
    public double consultarSaldo() {
    	return saldo;
    }

    /**
     * pre : monto es un valor mayor a 0.
     * post: aumenta el saldo de la Caja de Ahorro según el monto
     *       depositado.  
     */
    public void depositar(double monto) { 
    	if(monto > 0 ) {
    		this.saldo += monto;
    		System.out.print("De la Caja De Ahorro se depositan un total de $" + monto);
    	}
    }
 
    /**
     * @monto: la cantidad de dinero a extraer de la cuenta.
     * pre : monto es mayor a 0 y menor o igual que el saldo de la
     *       Caja de Ahorro.
     * post: disminuye el saldo de la Caja de Ahorro según el monto
     *       extraído.
     */
    public void extraer(double monto) { 
    	
    	if(monto > 0 && monto <= saldo) {
    		this.saldo = saldo - monto;
    		System.out.print("De la Caja De Ahorro se extrae un total de $" + monto);
    		
    	}
    }
    
    public static void main (String []args) {
    	
    	CajaDeAhorro cajita = new CajaDeAhorro("Juan");
    	
    	
    	System.out.print("El titula de la Caja De Ahorro es :" + cajita.obtenerTitular());

    	
    	System.out.print("El saldo de la Caja De Ahorro es de $" + cajita.consultarSaldo());
      
    	cajita.depositar(100);
    
        cajita.extraer(20);
        
        System.out.print("El saldo de la Caja De Ahorro es de $" + cajita.consultarSaldo());
    
}}
