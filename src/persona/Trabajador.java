package persona;

public class Trabajador extends Persona {
	private String Trabajador;

	public String getTrabajador() {
		return Trabajador;
	}

	public void setTrabajador(String trabajador) {
		Trabajador = trabajador;
	}

	@Override
	public void enseña() {
		System.out.println("el trabajador enseña a sus trabajadores");
		

	}
}
