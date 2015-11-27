/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Cliente;
import Model.DaoCerveja;
import Model.DaoCliente;
import Model.DaoEstabelecimento;
import Model.Estabelecimento;
import Model.PrecoCerv;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletCadCli extends HttpServlet {

	private static final long serialVersionUID = 7633293501883840556L;
       
        	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	                     throws ServletException, IOException{

		HttpSession session = request.getSession(); //obtem a sessao do usuario, caso exista

		Estabelecimento estab = null;
		String form_nome = request.getParameter("nome"); // Pega o Login vindo do formulario
                String form_sobrenome = request.getParameter("sobrenome"); // Pega o Login vindo do formulario
		String form_endereco = request.getParameter("endereco"); //Pega a senha vinda do formulario
                String form_username = request.getParameter("username"); // Pega o Login vindo do formulario
                String form_senha = request.getParameter("senha"); // Pega o Login vindo do formulario
                int form_rank = Integer.parseInt( request.getParameter("ranking")); // Pega o Login vindo do formulario
                String form_cpf = request.getParameter("cpf"); // Pega o Login vindo do formulario
                String form_data_nasc = request.getParameter("data_nasc"); // Pega o Login vindo do formulario
                String form_cel = request.getParameter("cel"); // Pega o Login vindo do formulario
		
                try {
			DaoCliente dao = new DaoCliente(); //cria uma instancia do DAO usuario
			dao.setCliente(form_username,form_senha,form_nome,form_sobrenome,form_cpf,form_cel,form_endereco,form_data_nasc,form_rank);
		}
		catch ( Exception e ){

		}
                
                request.getRequestDispatcher( "Principal.html").forward(request, response);

		//se nao encontrou usuario no banco, redireciona para a pagina de erro!
///		if ( user == null ) {
//			session.invalidate();
//			request.getRequestDispatcher( "invalidLogin.jsp").forward(request, response);
//		}
//		else{
//			//se o dao retornar um usuario, coloca o mesmo na sessao
//			//session.setAttribute("user", user);
//			request.getRequestDispatcher( "userLogged.jsp").forward(request, response);
//		}
//
	}

}
    
