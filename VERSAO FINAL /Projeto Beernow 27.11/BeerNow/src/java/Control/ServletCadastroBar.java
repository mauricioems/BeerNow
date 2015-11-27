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
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletCadastroBar extends HttpServlet {

	private static final long serialVersionUID = 7633293501883840556L;
       
        	protected void doPost(HttpServletRequest request, HttpServletResponse response)
	                     throws ServletException, IOException{

		HttpSession session = request.getSession(); //obtem a sessao do usuario, caso exista

		Estabelecimento estab = null;
		String form_nome = request.getParameter("nome"); // Pega o Login vindo do formulario
		String form_endereco = request.getParameter("endereco"); //Pega a senha vinda do formulario
                String form_tipo = request.getParameter("tipo"); // Pega o Login vindo do formulario
                String form_desc = request.getParameter("descricao"); // Pega o Login vindo do formulario
                int form_rank = Integer.parseInt( request.getParameter("ranking")); // Pega o Login vindo do formulario
                String form_cerv = request.getParameter("cervejas"); // Pega o Login vindo do formulario
		
                try {
			DaoEstabelecimento dao = new DaoEstabelecimento(); //cria uma instancia do DAO usuario
			dao.setEstabelecimento(form_nome,form_endereco, form_tipo,form_desc,form_cerv, form_rank);
		}
		catch ( Exception e ){

		}

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
        
 