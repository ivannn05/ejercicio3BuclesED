package controladores;

import servicios.OperativaImplementacion;
import servicios.OperativaInterfaz;

public class Inicio {

	public static void main(String[] args) {
		
		OperativaInterfaz oi = new OperativaImplementacion();		
		int numeroAAdivinar = oi.generarNumero();
		System.out.println("numero: " + numeroAAdivinar);
	//control 10 intentos
		Boolean control = false;
		int i;
		for(i=1; i<=10; i++) {
			control = oi.validarNumero(numeroAAdivinar);
			if(control) {
				break;
			}
		}
		if(i>10) {
			System.out.println("HAS PERDIDO");
		}

	}

}
