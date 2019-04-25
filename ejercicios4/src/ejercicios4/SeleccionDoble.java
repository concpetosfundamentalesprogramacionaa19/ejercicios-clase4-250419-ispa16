package ejercicios4;

import java.util.Scanner;

import paquete_dos.*;

public class SeleccionDoble {

	public static void main(String[ ]args) {
		Scanner entrada = new Scanner( System.in);
		//ingreso de datos y declaracion de variables
		int calificacion;
		System.out.println("ingrese la calificacion ");
		calificacion = entrada.nextInt();
		String Mimensaje = Operacion.mensaje;
		String Mimensaje2 = Operacion.mensaje2;
		//condicion1
		if (calificacion >= 85) {
			System.out.printf( "%s %d\n", Mimensaje, calificacion);
		//condicion 1.1
		}else {
			System.out.printf("%s %d\n", Mimensaje2, calificacion);
			
		}
		
		
		//ingreso de datos calificacion2
		int calificacion2;
		System.out.println("ingrese la calificacion 2");
		calificacion2 = entrada.nextInt();
		//condicion2
		if (calificacion2 >= 85) {
			System.out.printf( "%s %d\n", Operacion.mensaje, calificacion2);
		//condicion 2.1
		}else {
			System.out.printf("%s %d\n", Operacion.mensaje2, calificacion2);
			
		}
		
	}
}
