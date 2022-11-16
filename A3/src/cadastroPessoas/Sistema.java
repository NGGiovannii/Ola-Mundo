package cadastroPessoas;
import java.util.Scanner;

/**
 *
 * @author edjan
 */
public class Sistema {

        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                Professor prof = new Professor(null, null, null, 0);

                System.out.println("-------Bem-vindo-------");
                System.out.println("Insira os dados que serão pedidos pelo sistema");
                System.out.println("Digite o nome do professor");
                prof.nome = input.nextLine();
                System.out.println("Digite o cpf do professor");
                prof.cpf = input.nextLine();
                System.out.println("Digite a idade do professor");
                prof.idade = input.nextLine();
                System.out.println("Digite o salário do professor");
                prof.salario = input.nextFloat();
                System.out.println("-----------------------");
                input.nextLine();

                Aluno al = new Aluno(null, null, null, null);
                System.out.println("Digite o nome do aluno");
                al.nome = input.nextLine();
                System.out.println("Digite o cpf do aluno");
                al.cpf = input.nextLine();
                System.out.println("Digite a idade do aluno");
                al.idade = input.nextLine();
                System.out.println("Digite o plano do aluno");
                al.plano = input.nextLine();
                System.out.println("-----------------------");

                Funcionario fun = new Funcionario(null, null,
                                null, 0);
                System.out.println("Digite o nome do funcionário");
                fun.nome = input.nextLine();
                System.out.println("Digite o cpf do funcionário");
                fun.cpf = input.nextLine();
                System.out.println("Digite a idade do funcionário");
                fun.idade = input.nextLine();
                System.out.println("Digite o salário do funcionário");
                fun.salario = input.nextFloat();
                System.out.println("-----------------------");
                input.close();
                // mostrando os dados
                System.out.println("-----------------------");
                System.out.println("As informações digitadas foram as seguintes:");
                System.out.println("Informações do professor:");
                System.out.println("Nome: " + prof.nome);
                System.out.println("Matrícula: " + prof.cpf);
                System.out.println("idade: " + prof.idade);
                System.out.println("Salário: " + prof.salario);
                System.out.println("-----------------------");
                System.out.println("Informações do aluno:");
                System.out.println("Nome: " + al.nome);
                System.out.println("Matrícula: " + al.cpf);
                System.out.println("idade: " + al.idade);
                System.out.println("Plano: " + al.plano);
                System.out.println("----------------------");
                System.out.println("Informações do funcionário");
                System.out.println("Nome: " + fun.nome);
                System.out.println("Matrícula: " + fun.cpf);
                System.out.println("idade: " + fun.idade);
                System.out.println("Salário: " + fun.salario);
                System.out.println("----------------------");
        }

}
