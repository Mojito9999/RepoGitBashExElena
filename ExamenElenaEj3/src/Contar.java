import java.util.*;

public class Contar {
	private Integer[] edades;

	public Contar(Integer[] edades) {
		super();
		this.edades = edades;
	}

	private Integer[] getEdades() {
		return edades;
	}

	private void setEdades(Integer[] edades) {
		this.edades = edades;
	}

	@Override
	public String toString() {
		return "Contar [edades=" + Arrays.toString(edades) + "]";
	}

	public int contarMenores(int numero) {

		for (int i = 0; i < edades.length; i++) {
			if (edades.length < 18) {
				numero = numero + i;
			}
		}
		return numero;
	}

	public int contarMayores(int numero) {

		for (int i = 0; i < edades.length; i++) {
			if (edades.length > 18) {
				numero = numero + i;
			}
		}
		return numero;
	}

	public int contarJubilados(int numero) {

		for (int i = 0; i < edades.length; i++) {
			if (edades.length >= 65) {
				numero = numero + i;
			}
		}
		return numero;
	}
}
