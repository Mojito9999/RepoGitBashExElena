import java.util.*;

public class PrincipalApp {
	public static void main(String[] args) {
		int numero = 0;
		int numeroM = 0;
		int numeroJ = 0;

		Integer[] edades = { 12, 18, 5, 66, 29, 8, 20, 65 };

		Contar jubilados = new Contar(edades);
		contarMenores(numero);
		contarMayores(numero);
		contarJubilados(numero);
		//contarMenores(numero);

		System.out.println("Menores de edad: " + numero + " Mayores de edad : " + numeroM + " Jubilados: " + numeroJ);
	}

	private static int contarMenores(int numero) {
		// TODO Auto-generated method stub
		Integer[] edades = { 12, 18, 5, 66, 29, 8, 20, 65 };
		for (int i = 0; i < edades.length; i++) {
			if (edades.length < 18) {
				numero = numero + i;
			}
		}
		return numero;
	}// fin main


	private static int contarMayores(int numeroM) {
		// TODO Auto-generated method stub
		Integer[] edades = { 12, 18, 5, 66, 29, 8, 20, 65 };
		for (int i = 0; i < edades.length; i++) {
			if (edades.length < 18) {
				numeroM = numeroM + i;
			}
		}
		return numeroM;
	}// fin main
	

	private static int contarJubilados(int numeroJ) {
		// TODO Auto-generated method stub
		Integer[] edades = { 12, 18, 5, 66, 29, 8, 20, 65 };
		for (int i = 0; i < edades.length; i++) {
			if (edades.length < 18) {
				numeroJ = numeroJ + i;
			}
		}
		return numeroJ;
	}// fin main
}
