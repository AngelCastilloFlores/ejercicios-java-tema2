import java.util.Scanner;

//Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
//convertir deberá estar almacenada en una variable.
public class Ejercicio04 {

	private static Scanner teclado;

	public static void main(String[] args) {
		  teclado = new Scanner(System.in);

		double operacion;
		double euros;
		
		System.out.println("Introduzca la cantidad de € que quiere convertir a pesetas: ");
		euros=teclado.nextDouble();
		
		operacion = euros * 166.386;
		
		System.out.println("La cantidad de Euros convertida a Pesetas, es de: " + operacion);
		
		
		

	}

}
