package pruebas;

import java.util.Scanner;

public class Metodos {
	
	private static Scanner lector;

	public static void main(String[] args) {
		lector = new Scanner(System.in);
		System.out.println("Introduce el radio: ");
		float radio = lector.nextFloat();
		
	Metodos main = new Metodos();			// instanciamos la clase Main porque no se pueden llamar m�todos desde un m�todo static
		main.calculaPerimetroCirca(radio);
		main.calculaAreaCirca(radio);
	}

	public void calculaPerimetroCirca(float radio) {
		double r = Math.round(2*Math.PI*radio*100)/100.0;
		System.out.println("El Area del triángulo es: " + r);
	}
	
	public void calculaAreaCirca(float radio) {
		double r = Math.round(Math.PI*radio*radio*100)/100.0;
		System.out.println("El Area de la circa es: " + r);
	}


}
