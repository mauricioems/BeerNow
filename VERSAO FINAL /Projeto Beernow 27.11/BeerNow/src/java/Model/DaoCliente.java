

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
import java.util.Date;

public class DaoCliente {
    
    public Cliente getUsername(String Username) {        
                Connection conn = null;
        CallableStatement stmt = null ;
        ResultSet rs = null;

        try {
            ConectaBD Conexao = new ConectaBD();
            
            conn = Conexao.CriaConexBD();
            
            
            //Cria a Query
            stmt = (CallableStatement) conn.prepareCall("{call Busca_cliente(?)}");
                     

    stmt.setString(1, Username);
     
    stmt.execute();
    
    rs = stmt.getResultSet();
            
            //cria o usuario do login
            if ( rs.next() ){
				Cliente user = new Cliente();
				user.setId(rs.getInt("Id_cliente") );
				user.setUsername(rs.getString("Username"));
				user.setPassword(rs.getString("Password"));
				user.setNome( rs.getString("Nome") );
				user.setSobrenome(rs.getString("Sobrenome") );
                                user.setCpf(rs.getString("Cpf") );
                                user.setEndereco(rs.getString("Endereco") );
                                user.setCelular(rs.getString("Celular") );
                                user.setDatanascimento(rs.getDate("Data_nasc") );
                                user.setRanking(rs.getInt("Ranking_user") );
                                
				return user;
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

    
    public Cliente getClienteLogin(String name, String pass) {        
        Connection conn = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            ConectaBD Conexao = new ConectaBD();
            
            conn = Conexao.CriaConexBD();
            
            
            //Cria a Query
            pst = conn
                    .prepareStatement("select * from cliente where Username=? and Password=?");
            pst.setString(1, name);
            pst.setString(2, pass);

            rs = pst.executeQuery();
            
            //cria o usuario do login
            if ( rs.next() ){
				Cliente user = new Cliente();
				user.setId(rs.getInt("Id_cliente") );
				user.setUsername(name);
				user.setPassword(pass);
				user.setNome( rs.getString("Nome") );
				user.setSobrenome(rs.getString("Sobrenome") );
                                user.setCpf(rs.getString("Cpf") );
                                user.setEndereco(rs.getString("Endereco") );
                                user.setCelular(rs.getString("Celular") );
                                user.setDatanascimento(rs.getDate("Data_nasc") );
                                user.setRanking(rs.getInt("Ranking_user") );
                                
				return user;
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
        return null;
    }
    
    public void setCliente(String username, String password,String nome, String sobrenome,String cpf, String cel, String endereco,Date datanascimento,int Ranking) {        
        boolean status = false;
        Connection conn = null;
        CallableStatement stmt = null ;
        ResultSet rs = null;

        try {
            ConectaBD Conexao = new ConectaBD();
            
            conn = Conexao.CriaConexBD();
            
            
            //Cria a Query
            stmt = (CallableStatement) conn.prepareCall("{call Insere_liente(?, ?, ?, ?, ?, ?, ?, ?,?)}");
                     

    stmt.setString(1, username);
    stmt.setString(2, password);
    stmt.setString(3, nome);
    stmt.setString(4, sobrenome);
    stmt.setString(5, cpf);
    stmt.setString(6, endereco);
    stmt.setString(7, cel);
    stmt.setDate(8, (java.sql.Date) datanascimento);
    stmt.setInt(9,Ranking);
    
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
    
    public void updateCliente(Cliente cli) {        
        boolean status = false;
     Connection conn = null;
        CallableStatement stmt = null ;
        ResultSet rs = null;

        try {
            ConectaBD Conexao = new ConectaBD();
            
            conn = Conexao.CriaConexBD();
            
            
            //Cria a Query
            stmt = (CallableStatement) conn.prepareCall("{call Altera_cliente(?, ?, ?, ?, ?, ?, ?, ?, ?)}");
                     

    
    stmt.setString(1, cli.getUsername());
    stmt.setString(2, cli.getPassword());
    stmt.setString(3, cli.getNome());
    stmt.setString(4, cli.getSobrenome());
    stmt.setString(5, cli.getCpf());
    stmt.setString(6, cli.getCelular());
    stmt.setString(7, cli.getEndereco());
    stmt.setDate(8, (java.sql.Date) cli.getDatanascimento());
    stmt.setInt(9, cli.getRanking());
    
    
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

    public void setCliente(String form_username, String form_senha, String form_nome, String form_sobrenome, String form_cpf, String form_cel, String form_endereco, String form_data_nasc, int form_rank) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}