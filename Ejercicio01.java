//Escribe un programa en el que se declaren las variables enteras x e y. Asignales
//los valores 144 y 999 respectivamente. A continuaci�n, muestra por pantalla
//el valor de cada variable, la suma, la resta, la divisi�n y la multiplicaci�n.

public class Ejercicio01 {

	public static void main(String[] args) {
	  int x = 144;
	  int y = 999;
	  int suma;
	  int resta;
	  int division;
	  int multiplicacion;
	  
	  suma = x + y;
	  resta = y - x;
	  division = x / y;
	  multiplicacion = x * y;
	  
	  System.out.println("Suma de x + y = " + suma);
	  System.out.println("Resta de x - y = " + resta);
	  System.out.println("Divisi�n de x / 2 = " + division);
	  System.out.println("Multiplicaci�n de x * 2 = " + multiplicacion);
	  
	}

}
