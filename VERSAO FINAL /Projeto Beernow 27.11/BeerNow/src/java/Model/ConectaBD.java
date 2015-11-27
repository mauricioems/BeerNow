package Model;

/**
 *
 * @author Mauricio
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectaBD {
    
    public Connection CriaConexBD() throws SQLException
    {
        boolean status = false;
        Connection conn = null;

        
        //Cria a conexao do BD
        String url = "jdbc:mysql://localhost:3306/";
        String dbName = "beernow";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "beernow";
        String password = "beernow";
        try {
            Class.forName(driver).newInstance();
            conn = DriverManager
                    .getConnection(url + dbName, userName, password);
            
            return conn;
            
            

         //Verifica erro
        } catch (Exception e) {
            System.out.println(e);
            conn.close();
            return null;
        } 
      
        
    }
}
