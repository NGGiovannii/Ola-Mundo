package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import conexaoBD.ConnectionFactory;
import cadastroPessoas.*;

public class UsuarioDAO {
    private Connection connection;
    int id;
    String nome;
    String cpf;
    String idade;
    String salario;
    public Object usuarios;

    public UsuarioDAO() {
        this.connection = new ConnectionFactory().getConnection();
    }

    public void adiciona(Sistema usuario) {
        // Caso o usuário seja Professor ou Funcionário o código não colocará "Plano"
        // como um dos valores

        // debug
        System.out.println("Convidado selecionado");

        String sql = "INSERT INTO usuario (pessoa, nome, cpf, idade, salario, plano) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getPessoa());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getCpf());
            stmt.setString(4, usuario.getIdade());
            stmt.setString(5, usuario.getSalario());
            stmt.setString(6, usuario.getPlano());
            stmt.execute();
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
