package outputUsuario;

public class Mensajes {
	
	public static void bienvenida(String nombre) {
		System.out.println(
				"***********************************************\n"+
				"   BIENVENIDO A " + nombre + "                 \n"+
				"                             by Marc Hern�ndez \n"+
				"***********************************************"
				);
	}//fin bienvenida
	
	public static void despedida() {
		System.out.println(
				"***********************************************\n"+
				"   Espero que te haya gustado. Hasta pronto!   \n"+
				"***********************************************"
				);
	}//fin despedida
	
	public static void noValida() {
		System.out.println("La opci�n seleccionada no es valida.\nEscoge otra opcion entre las propuestas.");
	}//fin noValida.
	
} //fin de la class Mensajes
