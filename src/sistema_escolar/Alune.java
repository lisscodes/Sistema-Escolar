package sistema_escolar;

public class Alune extends Pessoa {
	
	private Curso curso;
	
	public Alune (String nome, int idade, String cpf, Curso curso) {
		super (nome, idade, cpf);
		this.curso = curso;
		
	}
	
	
	@Override
	public String toString() {
		return "Alune"+
				super.toString()+
				"Código do curso: " + curso.getMatricula()+
				"Nome do curso: "+ curso.getNomeCurso();
		
	}


	public Curso getCurso() {
		return curso;
	}


	public void setCurso(Curso curso) {
		this.curso = curso;
	}
}
