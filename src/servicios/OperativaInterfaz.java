package servicios;

/**
 * Catálogo de métodos que gestionan la operativa del juego
 * @author rfg - 28/11/23
 */
public interface OperativaInterfaz {
	
	/**
	 * Genera un número aleatorio a partir de la clase Math
	 * @return un número aletorio entre el 1 y el 100
	 * @author rfg - 28/11/23
	 */
	public int generarNumero();
	
	/**
	 * Solicita un intento al usuario y valida el número facilitado
	 * @param numeroAAdivinar - Es el número aleatorio creado anteriormente
	 * @return true si se ha acertado y false si no
	 */
	public boolean validarNumero(int numeroAAdivinar);

}
