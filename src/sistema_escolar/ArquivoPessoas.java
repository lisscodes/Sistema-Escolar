package sistema_escolar;

public interface ArquivoPessoas {
	
	public abstract void inserirPessoa(Pessoa pessoa);

    public abstract Pessoa procurarPessoa(String cpf);

}
