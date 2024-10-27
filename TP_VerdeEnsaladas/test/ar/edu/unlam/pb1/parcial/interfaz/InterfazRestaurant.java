package ar.edu.unlam.pb1.parcial.interfaz;

import ar.edu.unlam.pb1.parcial.dominio.*;

public class InterfazRestaurant {
	
	public static void main(String args[]) {
	
		final int CANTIDAD_MAXIMA_DE_INGREDIENTES = 50;
		final int CANTIDAD_MAXIMA_DE_ENSALADAS = 10;
		final int CANTIDAD_MAXIMA_DE_PEDIDOS_POR_DIA = 100;
		
		Ingrediente ingredientesDisponibles[] = new Ingrediente[CANTIDAD_MAXIMA_DE_INGREDIENTES];
		Ensalada ensaladaPreEstablecidas[] = new Ensalada[CANTIDAD_MAXIMA_DE_ENSALADAS];
		Pedido pedidos[] = new Pedido[CANTIDAD_MAXIMA_DE_PEDIDOS_POR_DIA];
		
		System.out.println("Bienvenido al Verde");
		
		/*
		 * En esta sección del código se debe generar la interacción con el usuario. Se pueden incorporar tantos 
		 * métodos como considere necesario. Mínimamente se debe invocar a los siguientes métodos:
		 * 
		 * 	incorporarNuevoIngrediente
		 * 	crearUnNuevaEnsalada
		 * 	crearUnNuevoPedido
		 */

	}
		
	private static void incorporarNuevoIngrediente() {

		/* Se crean nuevos ingredientes los cuales pueden ser utilizados en los platos */
	}
	
	private static void crearUnNuevaEnsalada() {
		/* Se visualiza el listado de ingredientes disponibles y a partir de ahí se crean nuevos platos, los cuales 
		 * pueden ser solicitados por los clientes 
		 */
	}
	
	private static void crearUnNuevoPedido() {
		/*
		 * Se muestra el listado de ensaladas, y el cliente elige la ensalada deseada.
		 * Una vez elegida la ensalada el cliente puede incorporar nuevos ingredientes.
		 * Al finalizar informa el valor que debe abonar.
		 */
	}
}


