/***************
 Autor: Getzemani Alejandro Gonzalez Cruz 
  
  
  
 
 */

package principal;

public class Principal {

	public static void main(String args[]) {
		// primitivos
		int numero;
		numero = 20;
		System.out.print("*************************************************************************\n" );
		System.out.print("*\t nombre      \ttipo                      \trango             \tejemplo\n");

		System.out.print("*\t int      \tNumero entero     \t-2147483 a 2147483        \t"+ numero);             

		float numero2;
		numero2 = 21;
		System.out.print("\n*\tfloat       \tflotante        \t3.4028 a 1.4023          \t" + numero2);

		short n3;
		n3 = 22;
		System.out.print("\n*\tshort      \tentero          \t-32768 a 32767             \t" + n3);

		long n4;
		n4 = 23;
		System.out.print("\n*\tlong     \tentero            \t-9223372 a 9223372         \t" + n4);

		double n5;
		n5 = 25;
		System.out.print("\n*\tdouble    \tflotante         \tu-1.797669 a 1.797669        \t" + n5);
		
		boolean verdad=true;
		
		boolean opc=verdad; 
		System.out.print("\n*\tboolean   \true false        \tN.A                           \t" + opc);
		

		char n6;
		n6 ='h'; 
		System.out.print("\n*\tchar     \tcaracter          \tu0000 a uffff                  \t" + n6);

	}

}
