package herencia;

public class Persona {
	static int numInstancias = 0;	// variable static para que sea �nica para todos los objetos de la clase persona
	
	Persona(){
		numInstancias ++;			// sumo en el constructor para que se acumule cada vez que se instancia una Persona
	}
}
