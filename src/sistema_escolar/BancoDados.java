package sistema_escolar;

public interface BancoDados {
	
	public abstract void inserirPessoa(Pessoa pessoa);

    public abstract Pessoa procurarPessoa(String cpf);
    
    public abstract void removerPessoa(String cpf);

}
