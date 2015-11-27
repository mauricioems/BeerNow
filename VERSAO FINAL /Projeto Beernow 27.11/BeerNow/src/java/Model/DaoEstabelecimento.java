

package Model;

/**
 *
 * @author Mauricio
 */


import com.mysql.jdbc.Blob;
import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DaoEstabelecimento {
    
   
    public Estabelecimento getEstabelecimento(String Nome) {        
        Connection conn = null;
        CallableStatement stmt = null ;
        ResultSet rs = null;

        try {
            ConectaBD Conexao = new ConectaBD();
            
            conn = Conexao.CriaConexBD();
            
            
            //Cria a Query
            stmt = (CallableStatement) conn.prepareCall("{call Busca_estabelecimento(?)}");
                     

    stmt.setString(1, Nome);
     
    stmt.execute();
    
    rs = stmt.getResultSet();
            
            //cria o usuario do login
            if ( rs.next() ){
				Estabelecimento estab = new Estabelecimento();
				estab.setId(rs.getInt("Id_estabelecimento") );
                                estab.setEndereco(rs.getString("Endereco") );
                                estab.setDescricao(rs.getString("Descricao") );
				estab.setTipo(rs.getString("Tipo"));
				estab.setRanking(rs.getInt("Ranking_estab") );
                                estab.setCervejas(rs.getString("Cervejas") );
                                
				
				return estab;
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
    
    public void setEstabelecimento(String Nome,String Endereco, String Tipo,String Descricao, String Cervejas, int Ranking) {        
        boolean status = false;
        Connection conn = null;
        CallableStatement stmt = null ;
        ResultSet rs = null;

        try {
            ConectaBD Conexao = new ConectaBD();
            
            conn = Conexao.CriaConexBD();
            
            
            //Cria a Query
            stmt = (CallableStatement) conn.prepareCall("{call Insere_estabelecimento(?, ?, ?, ?, ?,?)}");
                     

    stmt.setString(1, Nome);
    stmt.setString(2, Endereco);
    stmt.setString(3, Tipo);
    stmt.setString(4, Descricao);
    stmt.setInt(5, Ranking);
    stmt.setString(6, Cervejas);
    
    
    stmt.execute();
    
    rs = stmt.getResultSet();
            
            //cria o usuario do login
            if ( rs.next() ){
				status=true;
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
    }
    
    public void UpdateEstabelecimento(Estabelecimento estab) {        
        boolean status = false;
     Connection conn = null;
        CallableStatement stmt = null ;
        ResultSet rs = null;

        try {
            ConectaBD Conexao = new ConectaBD();
            
            conn = Conexao.CriaConexBD();
            
            
            //Cria a Query
            stmt = (CallableStatement) conn.prepareCall("{call Altera_cerveja(?, ?, ?, ?, ?, ?)}");
                     

    
    stmt.setString(1, estab.getNome());
    stmt.setString(2, estab.getEndereco());
    stmt.setString(3, estab.getTipo());
    stmt.setString(4, estab.getDescricao());
    stmt.setInt(5, estab.getRanking());
    stmt.setString(6, estab.getCervejas());
    
    
    
    stmt.execute();
    
    rs = stmt.getResultSet();
            
            //cria o usuario do login
            if ( rs.next() ){
				status=true;
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
    }

}