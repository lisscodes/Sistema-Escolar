package arquivo;

import sistema_escolar.ArquivoPessoas;

import sistema_escolar.Pessoa;

public class ArquivoArrayPessoas implements ArquivoPessoas {

    private Pessoa[] pessoa;

    public ArquivoArrayPessoas (int tamanho) {
        pessoa = new Pessoa[tamanho];
    }

    @Override
    public void inserirPessoa(Pessoa pessoa) {

        for (int i = 0; i < this.pessoa.length; i++) {
            if (this.pessoa[i] == null) {
                this.pessoa[i] = pessoa;
                return;
            }
        }
    }

    @Override
    public Pessoa procurarPessoa(String cpf) {

        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i].getCpf().equals(cpf)) {
                return pessoa[i];
            }
        }
        return null;
    }

    public void verPessoa() {
        for (int i = 0; i < pessoa.length; i++) {
            if (pessoa[i] != null) {
                System.out.println("negocios.Aluno " + (i + 1) + ": " + pessoa[i].getNome());
            }
        }
    }

}
