package cadastroPessoas;

public class Professor extends Pessoas{
    public float salario;
    public Professor (String nome, String cpf, String idade,  float salario){
        
        super (nome, cpf, idade);
        this.salario = salario;
    }
}
