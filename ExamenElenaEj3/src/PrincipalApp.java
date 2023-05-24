import java.util.*;

public class PrincipalApp {
	public static void main(String[] args) {
		int numero = 0;
		Integer[] edades = { 1, 2, 3, 4, 5, 6, 7, 8 };
		
		Contar jubilados = new Contar(edades);
		contarMenores(numero);

		System.out.println("Menores de edad: " + contarMenores(numero) + "Mayores de edad : " + contarMayores
				+ "Jubilados: " + contarJubilados);
	}// fin main

	
}
