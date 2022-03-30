package herencia;

public class Principal {

	private static Numericos bits= new Numericos();
	private static 	Numericos corto= new Numericos();
	private static 	Numericos entero= new Numericos();
	private static Numericos largo= new Numericos();


	
	public static void main(String[] args) {
		
		bits.setNombre("Byte");
		bits.setLongitud ("0-127");
		bits.setDescripcion("es el entero mas pequeño");
		bits.setPrimitivo("sis");
		bits.setBits((byte)10);
		System.out.println(bits.getNombre() +"  " + bits.getLongitud());
	
		
		
		
		// TODO Auto-generated method stub

	}

}
