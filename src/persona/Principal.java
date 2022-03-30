package persona;

public class Principal {
	
	private static Trabajador trabajador= new Trabajador();
	private static Alumno alumno= new Alumno();
	private static Profesor profesor= new Profesor();
	
	public static void main(String[] args) {
		alumno.setNombre("juan");
		alumno.setEdad(20);
		
		profesor.setNombre("luis");
		profesor.setEdad(39);
		

		trabajador.setNombre("manuel");
		trabajador.setEdad(28);
		
		System.out.println("nombre:" + alumno.getNombre());
		System.out.println("edad:"+ alumno.getEdad());
		alumno.enseña(); 
		
		
		//sysou
		
		

	
		
		
		
	}

}
