package ar.com.cac2023;

public class ManejoDeEnteros {

	public static void main(String[] args) {
		//short Tiene un valor mínimo de -32.768 y un valor máximo de 32.767 (inclusive).
		short s = 256;
		
		// byte Tiene un valor mínimo de -128 y un valor máximo de 127 (inclusive). 
		byte b = (byte)s;
		System.out.println("la b vale "+ b);
	
		
		//int tiene un valor mínimo de -2 a la 31 y un valor máximo de 2 a la 31 -1.
		
		float costo = 15.5F;
		int parteEntera = (int)costo;
		System.out.println(parteEntera);
		
	}

}
