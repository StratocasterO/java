package pruebas;

import java.util.Scanner;

public class Main {
	
	// Definido un Scanner para leer valores por consola
	private static Scanner lector;

	// Este método es el punto de inicio de toda aplicación JSE --> atajo: "main" ctrl+space
	public static void main(String[] args) { 	
		
		// Equivalente al console.log() --> atajo: "sysout" ctrl+space
		System.out.println("Hello World");		
		
		// Sustituir dos variables:
		int a=5;								
		int b=7;
		int c;
		
		System.out.println("a=" + a);			
		System.out.println("b=" + b);
		
		c=a;
		a=b;
		b=c;
	
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		
		// Operadores aritméticos:
		System.out.println(7+2);				
		System.out.println(7-2);
		System.out.println(7*2);
		System.out.println(7f/2);
		System.out.println(7%2);
		
		// Operadores booleanos:
		System.out.println(7>2);				
		System.out.println(7<2);
		System.out.println(7>=2);
		System.out.println(7<=2);
		System.out.println(7==2);
		System.out.println(7!=2);
		
		// Leer valores por la consola:
		lector = new Scanner(System.in);									
		System.out.println("Introduzca un texto, por favor: ");
		String variable = lector.next();
		System.out.println("Lectura utilizando la clase Scanner: " + variable);
		
		// Condicional:
		if(a>b){System.out.println("a es mayor que b");}							
		else{System.out.println("b es mayor que a");}
		
		// Condicional con operador ternario:
		String resultado = (a>b)?"a es mayor que b (ternario)":"b es mayor que a (ternario)";				
		System.out.println(resultado);
		
		String cadena1 = new String("Hola");
		String cadena2 = new String("Hola");
		String cadena3 = "Adios";
		String cadena4 = "Adios";
		
		// Comparar cadenas:
		if (cadena1.equals(cadena2)){System.out.println("Son iguales usando el equals");}							// Compara el contenido de las direcciones de memoria
		if (cadena1==cadena2){System.out.println("Son iguales usando el ==");}										// No funciona porque las direcciones de memoria son diferentes
		if (cadena3==cadena4){System.out.println("Son iguales usando el = cuando la cadena es creada en un pool");}	// Compara lo que hay en las dos direcciones de memoria
		
		
		// Calculadora con switch:
		System.out.println("Introduce el primer número");
		float num1 = lector.nextFloat();
		System.out.println("Introduce el segundo número");
		float num2 = lector.nextFloat();
		System.out.println("Introduce la operación (suma, resta, multiplica o divide)");
		String op = lector.next();
		float res = 0;
		
		switch(op){
			case "suma":
				res = num1 + num2;
				break;
			case "resta":
				res = num1 - num2;
				break;
			case "multiplica":
				res = num1 * num2;
				break;
			case "divide":
				res = num1 / num2;
				break;
		}
		
		System.out.println("El resultado es " + res);
	}

}