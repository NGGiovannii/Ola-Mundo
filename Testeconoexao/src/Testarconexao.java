import java.sql.Connection;
import java.sql.SQLException;

public class Testarconexao {
    public static void main(String[]args) throws SQLException{
        Connection connection = new App().getConnection();
        System.out.println("Deu certo! =)");
        connection.close();
    }
    
}