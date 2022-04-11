package sistema_escolar;

public class Curso {

	private String nomeCurso;

	
	
	public Curso(String nomeCurso)
	{
		this.nomeCurso = nomeCurso;
		
	}


	public String getNomeCurso() {
		return nomeCurso;
	}


	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}



	@Override
	public String toString() {
		return "\nCurso: " + nomeCurso;
	}
	
	
}
