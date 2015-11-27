package Control;
import Model.DaoOutros;
import Model.Estabelecimento;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRanEstab extends HttpServlet {

	private static final long serialVersionUID = 7633293501883840556L;
       
        
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
        @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String mensagem1;
        String mensagem2;
        String finalpagina;
        StringBuilder adiciona = new StringBuilder();
        List<Estabelecimento> lestab = new ArrayList<Estabelecimento>();
        
        
        
       String userId = request.getParameter("namecerv");
            DaoOutros dao = new DaoOutros(); //cria uma instancia do DAO usuario
            lestab = dao.getTop10Estabelecimentos();
        
        //String forward="ResultadoPesquisa.jsp";
      //  String action = request.getParameter("action");
        int i = 0;
        for(i = 0;i<lestab.size();i++)
        {
            adiciona.append("<tr><td>").append(lestab.get(i).getNome()).append("</td>");
            adiciona.append("<td>").append(lestab.get(i).getRanking()).append("</td></tr>");             
        }
        
        mensagem1 = "<html lang=\"en\">\n" +
"\n" +
"    <head>\n" +
"\n" +
"        <meta charset=\"utf-8\">\n" +
"        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"        <meta name=\"description\" content=\"\">\n" +
"        <meta name=\"author\" content=\"\">\n" +
"\n" +
"        <title>SB Admin 2 - Bootstrap Admin Theme</title>\n" +
"\n" +
"        <!-- Bootstrap Core CSS -->\n" +
"        <link href=\"bower_components/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n" +
"        \n" +
"        <!-- MetisMenu CSS -->\n" +
"        <link href=\"bower_components/metisMenu/dist/metisMenu.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n" +
"        \n" +
"        <!-- Custom CSS -->\n" +
"        <link href=\"dist/css/sb-admin-2.css\" rel=\"stylesheet\" type=\"text/css\"/>\n" +
"        \n" +
"        <!-- Custom Fonts -->\n" +
"        <link href=\"bower_components/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n" +
"        \n" +
"        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n" +
"        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n" +
"        <!--[if lt IE 9]>\n" +
"            <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n" +
"            <script src=\"https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js\"></script>\n" +
"        <![endif]-->\n" +
"\n" +
"    </head>\n" +
"\n" +
"    <body style=\"background-image: url('Imagens/BeerNowBackground.jpg')\">\n" +
"        <br>\n" +
"        <br>\n" +
"        <br>\n" +
"        <br>\n" +
"        <br>\n" +
"        <br>\n" +
"\n" +
"        <div class=\"divTudo\">\n" +
"            <div class=\"container\">\n" +
"                <h2><b> Abaixo, os top 20 estabelecimentos do site: </b></h2>\n" +
"                <br>" + "<table border=1>\n" +
"                            <thead>\n" +
"                                <tr>\n" +
"                                    <th>Nome</th>\n" +
"                                    <th>Ranking</th>\n" +
"                                </tr>\n" +
"                            </thead>\n" +
"                            <tbody>";
        
        
        mensagem2 = "</div>\n" +
"\n" +
"        </div>\n" +
"\n" +
"\n" +
"\n" +
"        <!-- jQuery -->\n" +
"        <script src=\"bower_components/jquery/dist/jquery.min.js\" type=\"text/javascript\"></script>\n" +
"        \n" +
"        <!-- Bootstrap Core JavaScript -->\n" +
"        <script src=\"bower_components/bootstrap/dist/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n" +
"        \n" +
"        <!-- Metis Menu Plugin JavaScript -->\n" +
"        <script src=\"bower_components/metisMenu/dist/metisMenu.min.js\" type=\"text/javascript\"></script>\n" +
"        \n" +
"        <!-- Custom Theme JavaScript -->\n" +
"        <script src=\"dist/js/sb-admin-2.js\" type=\"text/javascript\"></script>\n" +
"        \n" +
"    </body>\n" +
"\n" +
"</html>";
        
        

            
        finalpagina = mensagem1 + adiciona + mensagem2; 
        // Set response content type
      response.setContentType("text/html");

      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println(finalpagina);
        
        
            
            
            

         
            
//            request.setAttribute("cervejas", lpcerv);    
//    
//        String forward="teste.jsp";
//        RequestDispatcher view = request.getRequestDispatcher(forward);
//        view.forward(request, response);
    }

}