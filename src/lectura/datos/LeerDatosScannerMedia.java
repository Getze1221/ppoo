package lectura.datos;

import java.util.Scanner;

public class LeerDatosScannerMedia {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		System.out.print("introduce tres numeros (pueden contener decimales) separados por espacios");
		double x1 = s.nextDouble();
		double x2 = s.nextDouble();
		double x3 = s.nextDouble();
		
		double media = (x1 + x2 + x3)/3;
		
		System.out.print("la media es" + media);
		
		
	}

}
