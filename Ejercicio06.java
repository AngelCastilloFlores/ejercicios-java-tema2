import java.util.Scanner;

//Escribe un programa que calcule el total de una factura a partir de la base
//imponible (precio sin IVA). La base imponible estará almacenada en una
//variable.
public class Ejercicio06 {

	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
		
		float articulo1;
		float articulo2;
		float articulo3;
		
		
		System.out.println("Introduzca el precio de su Articulo nº1: ");
		articulo1=Float.parseFloat(teclado.nextLine());
		
		System.out.println("Introduzca el precio de su Articulo nº2: ");
		articulo2=Float.parseFloat(teclado.nextLine());
		
		System.out.println("Introduzca el precio de su Articulo nº3: ");
		articulo3=Float.parseFloat(teclado.nextLine());
		
		float operacion = (articulo1 + articulo2 + articulo3);
		
		System.out.println("El total de su factura sin IVA, es de: " + operacion);
		
		
		

	}

}
