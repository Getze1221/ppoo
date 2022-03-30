package persona;

public class Alumno extends Persona {
	private String Matricula;

	public String getMatricula() {
		return Matricula;
	}

	public void setMatricula(String matricula) {
		Matricula = matricula;
	}

	@Override
	public void enseña() {
		System.out.println("Alumno enseña a sus compañeros");

	}

}
