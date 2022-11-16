package cadastroPessoas;

public class Funcionario extends Pessoas {
    public float salario;
    public Funcionario(String nome, String cpf, String idade, float salario){
        super(nome,cpf,idade);
        this.salario = salario;
    }
}
