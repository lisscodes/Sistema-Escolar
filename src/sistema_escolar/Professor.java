package sistema_escolar;

public class Professor extends Pessoa{
	
	

	private double salario;
	
	public Professor(String nome, int idade, String cpf, double salario) {
		super(nome, idade, cpf);
		this.salario = salario;
		
	}
	
	@Override
	public String toString() {
		return "Professor[" +
				super.toString() +
				"SALÁRIO = R$ " + salario +
				"]";					
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
