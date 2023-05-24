import java.util.*;

/**
 * 
 * @author alumno Autor del proyecto por defecto
 */
public class Contar {
	private Integer[] edades;

	/**
	 * 
	 * @param edades constructor de la clase Contar
	 */
	public Contar(Integer[] edades) {
		super();
		this.edades = edades;
	}

	/**
	 * 
	 * @return devuelve resultado
	 */
	private Integer[] getEdades() {
		return edades;
	}

	/**
	 * 
	 * @param edades parametro de edad
	 */
	private void setEdades(Integer[] edades) {
		this.edades = edades;
	}

	/**
	 * 
	 * @param numero
	 * @return
	 */

	public int contarMenores(int numero) {

		for (int i = 0; i < edades.length; i++) {
			if (edades.length < 18) {
				numero = numero + i;
			}
		}
		return numero;
	}

	/**
	 * 
	 * @param numeroM
	 * @return
	 */
	public int contarMayores(int numeroM) {

		for (int i = 0; i < edades.length; i++) {
			if (edades.length > 18) {
				numeroM = numeroM + i;
			}
		}
		return numeroM;
	}

	/**
	 * 
	 * @param numeroJ
	 * @return
	 */
	public int contarJubilados(int numeroJ) {

		for (int i = 0; i < edades.length; i++) {
			if (edades.length >= 65) {
				numeroJ = numeroJ + i;
			}
		}
		return numeroJ;
	}

	/**
	 * To string generado
	 */
	@Override
	public String toString() {
		return "Contar [edades=" + Arrays.toString(edades) + "]";
	}

}
