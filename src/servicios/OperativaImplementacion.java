package servicios;

import java.util.Scanner;

/**
 * Implementación de la interfaz operativa
 * @author rfg - 28/11/23
 */
public class OperativaImplementacion implements OperativaInterfaz {
	
	@Override
	public int generarNumero() {
		
		double aleatorio = Math.random()*100;
		int aleatorioEntero = (int)aleatorio;
		if(aleatorioEntero == 0) {
			aleatorioEntero = 1;
		}
				
		return aleatorioEntero;
	}

	@Override
	public boolean validarNumero(int numeroAAdivinar) {
		
		Scanner sc = new Scanner(System.in);
		Boolean control = false;
		System.out.println("Intenta adivinar el numero (enteros): ");
		int numeroUsuario = sc.nextInt();
		
		if(numeroUsuario == numeroAAdivinar) {
			System.out.println("HAS ACERTADO");
			control = true;
		}else if(numeroUsuario < numeroAAdivinar) {			
			System.out.println("El numero a adivinar es mayor");
			control = false;			
		}else {
			System.out.println("El numero a adivinar e menor");
			control = false;			
		}
		
		return control;
	}

}
