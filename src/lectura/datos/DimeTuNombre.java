/**
* Lectura de datos desde teclado
*
* autor Getzemani Alejandro Gonzalez CRuz
*/

package lectura.datos;

import java.util.Scanner;

public class DimeTuNombre {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("por favor, dime como te llamas:");
		String nombre = s.nextLine();

		System.out.print("hola" + nombre + ", ¡encantado de conocerte!");

	}
}
