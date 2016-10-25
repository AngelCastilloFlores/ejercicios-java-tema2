import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		  Scanner teclado = new Scanner(System.in);

		double operacion;
		double pesetas;
		
		System.out.println("Introduzca la cantidad de Pesetas que quiere convertir a Euros: ");
		pesetas=teclado.nextDouble();
		
		operacion = pesetas * 0.0060;
		
		System.out.println("La cantidad de Pesetas convertida a Euros, es de: " + operacion);
		

	}

}
