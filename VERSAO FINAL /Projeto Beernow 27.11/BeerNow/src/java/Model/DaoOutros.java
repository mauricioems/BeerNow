package Model;

/**
 *
 * @author Mauricio
 */


import Model.ConectaBD;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DaoOutros {
    
    public List<Estabelecimento> getTop10Estabelecimentos() {        
        Connection conn = null;
        CallableStatement stmt = null ;
        ResultSet rs = null;
       List<Estabelecimento> lestab = new ArrayList<Estabelecimento>();
        
        try {
            ConectaBD Conexao = new ConectaBD();
            
            conn = Conexao.CriaConexBD();
            
            
            //Cria a Query
            stmt = (CallableStatement) conn.prepareCall("call Top10_estabelecimento");
     
    stmt.execute();
    
    rs= stmt.getResultSet();
            
            //cria o usuario do login
            while ( rs.next()==true ){
				Estabelecimento estab = new Estabelecimento();
				estab.setNome(rs.getString("Nome")); 
                                estab.setRanking(rs.getInt("Ranking_estab")); 
                              
				lestab.add(estab);
				
            }
            
            return lestab;           
         
            
         //Verifica erro
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

       public List<Cliente> getTop10Usuarios() {        
        Connection conn = null;
       CallableStatement stmt = null ;
        ResultSet rs = null;
         List<Cliente> lcli = new ArrayList<Cliente>();
        int cont1 =0;

        
        try {
            ConectaBD Conexao = new ConectaBD();
            
            conn = Conexao.CriaConexBD();
            
            
            //Cria a Query
            stmt = (CallableStatement) conn.prepareCall("call Top10_usuario");
     
    stmt.execute();
    
    rs= stmt.getResultSet();
            
            //cria o usuario do login
            while ( rs.next()==true ){
				Cliente cli = new Cliente();
				cli.setUsername(rs.getString("Username")); 
                                cli.setRanking(rs.getInt("Ranking_user")); 
                              
				lcli.add(cli);
				
            }
            
            return lcli;           
         //Verifica erro
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }
   
        public void setPreco(float Preco) {        
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
        String top10[][]=new String[10][2];
        int cont1 =0;

        
        try {
            ConectaBD Conexao = new ConectaBD();
            
            conn = Conexao.CriaConexBD();
            
            
            //Cria a Query
            pst = conn
                    .prepareStatement("select * from cliente where Id_cliente=?");
            
            

            rs = pst.executeQuery();
            
            //cria o usuario do login
            while (rs.next()){
                top10[cont1][0]=rs.getString("Username");
                top10[cont1][1]= Float.toString(rs.getFloat("Ranking_user"));
                cont1++;
            }
                                
			
           
         //Verifica erro
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (pst != null) {
                try {
                    pst.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
       
    }
}