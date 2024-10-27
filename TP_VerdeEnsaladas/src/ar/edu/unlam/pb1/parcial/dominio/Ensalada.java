package ar.edu.unlam.pb1.parcial.dominio;


public class Ensalada {

	private String nombreDeLaEnsalada;
	private Ingrediente ingredientes[] ;
	
	public boolean agregarIngrediente(Ingrediente nuevo) {
		/*
		 * Incorpora un nuevo ingrediente a la ensalada
		 */
		return false;
	}
	
	public boolean esAptoCeliaco() {
		/*
		 * Devuelve true si ningún ingrediente es de origen TACC.
		 */
		return false;
	}
	
	public boolean esAptoVegetariano() {
		/*
		 * Devuelve true si ningún ingrediente es de origen ANIMAL
		 */
		return false;
	}
	
	public boolean esAptoVegano() {
		/*
		 * Devuelve true si ningún ingrediente es de origen ANIMAL ni LECHE ni HUEVO
		 */
		return false;
	}

	public String toString() {
		/*
		 * Devuelve un String con el nombre de la ensalada y el detalle de los ingredientes que la componen
		 */
		
		return "";
	}

}
