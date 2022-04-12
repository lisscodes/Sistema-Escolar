package sistema_escolar;

public interface BancoDados {
	
	 public abstract void inserirAlune(Pessoa pessoa);

	 public abstract Pessoa procurarAlune(String cpf);

	 public abstract void removerAlune(String cpf);
	 
	
}
