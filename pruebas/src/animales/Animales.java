package animales;

public class Animales {
	
	static String sonidoMasLargo = "";
	
	String sonido;
	
	Animales(String sonido){
		this.sonido = sonido;	// fija la variable sonido de la clase Animales al mismo valor que al de la clase Perro, Gato o Vaca instanciadas
		compararSonido();		// llama a la función compararSonido cada vez que se instancia una clase Animales (o hijos)
	}
	
	private void compararSonido() {
		if (sonido.length() > sonidoMasLargo.length()){
			sonidoMasLargo = sonido;
		}
	}
}