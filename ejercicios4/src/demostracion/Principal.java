package demostracion;
import java.util.Scanner ;
public class Principal {
	public static void main(String[ ]args) {
	Scanner entrada = new Scanner (System.in);
	double tarifa = 3;
	double mensajes ;
	double tarifaNueva;
	double mensajesExtra; 
	double tarifaFinal ;
	System.out.println("Ingrese el numero de mensajes enviados");
	mensajes = entrada.nextDouble();
	
	if (mensajes <=40) { //primera condicion
		tarifaNueva = tarifa ;
		tarifaFinal = (tarifaNueva*0.12)	+ tarifaNueva;
		System.out.printf("el valor final mensual a pagar es : %s !",tarifaFinal);//presentacion de resultados
	}else {
		if (mensajes > 40 && mensajes <= 200 ){
			mensajesExtra = mensajes - 40;
			tarifaNueva = (mensajesExtra*0.05) + tarifa ;
			tarifaFinal = (tarifaNueva*0.12)	+ tarifaNueva;
			System.out.printf("el valor final mensual a pagar es : %s !",tarifaFinal);//presentacion de resultados
		}else {
			if (mensajes > 200 ){
				mensajesExtra = mensajes - 200;
				tarifaNueva = (mensajesExtra*0.1) + tarifa ;	
				tarifaFinal = (tarifaNueva*0.12)	+ tarifaNueva;
				System.out.printf("el valor final mensual a pagar es : %s !",tarifaFinal);//presentacion de resultados
			}
		}
	}
	
	
	
	
	
	
	
	}
}