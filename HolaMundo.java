package ar.com.cac2023;

/*
 * public es un modificador de visualidad
 * class indica que es una clase
 * HolaMundo es el nombre de la clase
 * */
public class HolaMundo {
	
	/*
	 * public es un modificador de visualidad
	 * static indica que no pertenece a un objeto sino a una clase
	 * void tipo de retorno (no devuelve nada)
	 * main nombre del método 
	 * (String[] args) es una variable array de tipo string 
	 * */

	public static void main(String[] args) {
		System.out.println("Hola Mundo");
		
		//variables y tipos de datos
		//numeros enteros
		byte b = 1;
		short s = 2;
		int i = 10;
		long l = 30;
		
		//numeros flotantes (reales, decimales)
		float alturaDeUnaPersona = 10.5f;
		double d = 10.5242343; //no necesita una letra porque por defecto los decimales son double
		
		// entendamos:
		// byte < short < int < long < float < double 
		
		//ejemplo casting
		d= alturaDeUnaPersona;
		alturaDeUnaPersona = (float)d;
		System.out.println(alturaDeUnaPersona);
		
		
		
		var edad = 15.5f; //es un float
		edad = 25.5f;
		
		int aux = b + s;
		
		//cadena de caracteres > String 
		//String es unn clase porque arranca con mayuscula 
		char letra = 'A'; //el espacio es un char
		
		String palabra = "Aprendiendo a java";
		//puedo tomar los char que componen un String 
		//usando las funciones / metodos que tienen los tipos de String
		char primeraLetras = palabra.charAt(0);
		System.out.println(primeraLetras);
		
		Object algo = 155.f; //el tipo object puede contener cualquier cosa
		
		
		
	}

}
