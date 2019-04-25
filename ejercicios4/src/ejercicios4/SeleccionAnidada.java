package ejercicios4;

import java.util.Scanner;

import paquete_dos.*;
import paquete_dos .* 
;;public class SeleccionAnidada {

	public static void main(String[ ]args) {
		Scanner entrada = new Scanner( System.in);
		//ingreso de datos y declaracion de variables
		int calificacion;
		System.out.println("ingrese la calificacion ");
		calificacion = entrada.nextInt();
	
		//condiciones
		if (calificacion >= 90 ) {
			System.out.printf("%s %d\n", Operacion2.mensaje1, calificacion );
		}else {
			if (calificacion <90 && calificacion >= 80 ) {
				System.out.printf("%s %d\n", Operacion2.mensaje2, calificacion );
			}else {
				if (calificacion >= 50 && calificacion <80) {
					System.out.printf("%s %d\n", Operacion2.mensaje3, calificacion );
				}else {
					if (calificacion < 50) {
						System.out.printf("%s %d\n", Operacion2.mensaje4, calificacion );

					}
				}
			}
			
				
		}
		
		
	
	}
}
