

package Model;

/**
 *
 * @author Mauricio
 */


import com.mysql.jdbc.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class DaoCerveja {
    
   
    public List<PrecoCerv>getCervejaNome(String Nome) {        
        Connection conn = null;
        CallableStatement stmt = null ;
        ResultSet rs = null;
        List<PrecoCerv> lpcerv = new ArrayList<PrecoCerv>();
        
        try {
            ConectaBD Conexao = new ConectaBD();
            
            conn = Conexao.CriaConexBD();
            
            
            //Cria a Query
            stmt = (CallableStatement) conn.prepareCall("{call Busca_cerveja(?)}");
                     

    stmt.setString(1, Nome);
     
    stmt.execute();
    
    rs= stmt.getResultSet();
            
            //cria o usuario do login
            while ( rs.next() == true){
				PrecoCerv pcerv = new PrecoCerv();
				pcerv.setNomeCerv(rs.getString("c.Nome")); 
                                pcerv.setNomeEstab(rs.getString("e.Nome")); 
                                pcerv.setPreco(rs.getString("pc.preco")); 
                                pcerv.setTipo(rs.getString("c.Tipo")); 
				lpcerv.add(pcerv);
				
            }
            
            return lpcerv;
            
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
    
    public void setCerveja(String Nome, String Tipo,String Descricao) {        
        boolean status = false;
        Connection conn = null;
        CallableStatement stmt = null ;
        ResultSet rs = null;

        try {
            ConectaBD Conexao = new ConectaBD();
            
            conn = Conexao.CriaConexBD();
            
            
            //Cria a Query
            stmt = (CallableStatement) conn.prepareCall("{call Insere_cerveja(?, ?, ?)}");
                     

    stmt.setString(1, Nome);
    stmt.setString(2, Tipo);
    stmt.setString(3, Descricao);
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
    
    public void UpdateCerveja(Cerveja cerv) {        
        boolean status = false;
     Connection conn = null;
        CallableStatement stmt = null ;
        ResultSet rs = null;

        try {
            ConectaBD Conexao = new ConectaBD();
            
            conn = Conexao.CriaConexBD();
            
            
            //Cria a Query
            stmt = (CallableStatement) conn.prepareCall("{call Altera_cerveja(?, ?, ?)}");
                     

    
    stmt.setString(1, cerv.getNome());
    stmt.setString(2, cerv.getTipo());
    stmt.setString(3, cerv.getDescricao());
    
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