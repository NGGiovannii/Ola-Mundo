import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class App {
    public Connection getConnection(){
       try{
           return DriverManager.getConnection("jdbc:mysql://localhost:3306/projetojava","root", "");
       } catch(SQLException excecao){
           throw new RuntimeException(excecao);
       }
    }
    
}
