package herencia;

public class Main {
	public static void main(String[] args) {
		Cliente Alice = new Cliente();
		Cliente Bob = new Cliente();
		Empleado Charlie = new Empleado();
		Empleado Duncan = new Empleado();
		
		System.out.println(Persona.numInstancias);	// No hace falta instanciar un objeto de la clase Persona porque la variable numInstancias es static
	}
}