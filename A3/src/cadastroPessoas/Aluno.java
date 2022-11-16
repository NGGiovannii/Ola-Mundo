package cadastroPessoas;

public class Aluno extends Pessoas {
    public String plano;

    public Aluno(String nome, String cpf, String idade, String plano) {
        super(nome, cpf, idade);
        this.plano = plano;
    }
}
