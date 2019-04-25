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
//borrar
//else {
	//	if (mensajes > 40 && mensajes <= 200 ){ //segunda condicion
		//	
			//mensajesExtra = mensajes - 40;
			//tarifaNueva = (mensajesExtra*0.05) + tarifa ;
			//tarifaFinal = (tarifaNueva*0.12)	+ tarifaNueva;
			//presentacion de resultados
			//System.out.printf("el valor final mensual a pagar es : %.ff",tarifaFinal);
					
		//}else {
			//if (mensajes > 200 ){ //tercera condicion
				
				//mensajesExtra = mensajes - 200;
				//tarifaNueva = (mensajesExtra*0.1) + tarifa ;	
				//tarifaFinal = (tarifaNueva*0.12)	+ tarifaNueva;
				//presentacion de resultados
				//System.out.printf("el valor final mensual a pagar es : %.ff",tarifaFinal);
				//}
			
			
	}
		
		

	}
	
	