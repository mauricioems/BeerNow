package Control;

import Model.DaoCerveja;
import Model.PrecoCerv;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ServletbuscaCerv extends HttpServlet {

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
        List<PrecoCerv> lpcerv = new ArrayList<PrecoCerv>();
        
        
        
       String userId = request.getParameter("namecerv");
            DaoCerveja dao = new DaoCerveja(); //cria uma instancia do DAO usuario
            lpcerv = dao.getCervejaNome(userId);
        
        //String forward="ResultadoPesquisa.jsp";
      //  String action = request.getParameter("action");
        int i = 0;
        for(i = 0;i<lpcerv.size();i++)
        {
            adiciona.append("<tr><td>").append(lpcerv.get(i).getNomeCerv()).append("</td>");
            adiciona.append("<td>").append(lpcerv.get(i).getTipo()).append("</td>");             
            adiciona.append("<td>").append(lpcerv.get(i).getNomeEstab()).append("</td>");
            adiciona.append("<td>").append(lpcerv.get(i).getPreco()).append("</td></tr>");
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
"        <link href=\"bower_components/bootstrap/dist/css/bootstrap.min.css\" rel=\"stylesheet\">\n" +
"\n" +
"        <!-- MetisMenu CSS -->\n" +
"        <link href=\"bower_components/metisMenu/dist/metisMenu.min.css\" rel=\"stylesheet\">\n" +
"\n" +
"        <!-- Custom CSS -->\n" +
"        <link href=\"dist/css/sb-admin-2.css\" rel=\"stylesheet\">\n" +
"\n" +
"        <!-- Custom Fonts -->\n" +
"        <link href=\"bower_components/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n" +
"\n" +
"        <script>\n" +
"\n" +
"        </script>\n" +
"        <style type=\"text/css\">\n" +
"\n" +
"            .divTudo {\n" +
"                margin-top:200px;\n" +
"                text-align:center;\n" +
"                width: 450px;\n" +
"                background-color: rgba(255, 255, 255, 0.5);\n" +
"                border: 1px solid #DADADA;\n" +
"                -webkit-box-shadow: 0 0 13px 5px rgba(0, 0, 0, .2);\n" +
"                -moz-box-shadow:  0 0 13px 5px rgba(0, 0, 0, .2);\n" +
"                box-shadow:  0 0 13px 5px rgba(0, 0, 0, .2);\n" +
"                margin-bottom: 30px;\n" +
"                border: 1px solid #999;\n" +
"                border: 1px solid rgba(0,0,0,.2);\n" +
"                border-radius: 6px;\n" +
"\n" +
"            }\n" +
"            table, th, td {\n" +
"                border: 1px solid black;\n" +
"                border-collapse: collapse;\n" +
"            }\n" +
"            th, td {\n" +
"                padding: 5px;\n" +
"                text-align: left;\n" +
"            }\n" +
"\n" +
"        </style>\n" +
"    </head>\n" +
"\n" +
"    <body style=\"background-image: url('Imagens/BeerNowBackground.jpg')\">\n" +
"\n" +
"\n" +
"        <div class=\"container-fluid\" style=\"opacity: 1\">\n" +
"            <!-- Page Heading -->\n" +
"            <div class=\"row\">\n" +
"                <div class=\"col-lg-12\">\n" +
"                </div>\n" +
"            </div>\n" +
"            <!-- /.row -->\n" +
"            <div class=\"row\">\n" +
"                <div class=\"col-lg-6\">\n" +
"                    <div class=\"divTudo\">\n" +
"                        <table border=1>\n" +
"                            <thead>\n" +
"                                <tr>\n" +
"                                    <th>Cerveja</th>\n" +
"                                    <th>Tipo</th>\n" +
"                                    <th>Bar</th>\n" +
"                                    <th>Preco</th>\n" +
"                                </tr>\n" +
"                            </thead>\n" +
"                            <tbody>";
        
        
        mensagem2 = "<br>\n" +
"                        <br>\n" +

"\n" +
"\n" +
"                    </div>\n" +
"                </div>\n" +
"            </div>\n" +
"            <!-- /.row -->\n" +
"        </div>\n" +
"        <!-- /.container-fluid -->\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"        <!-- jQuery -->\n" +
"        <script src=\"bower_components/jquery/dist/jquery.min.js\"></script>\n" +
"\n" +
"        <!-- Bootstrap Core JavaScript -->\n" +
"        <script src=\"bower_components/bootstrap/dist/js/bootstrap.min.js\"></script>\n" +
"\n" +
"        <!-- Metis Menu Plugin JavaScript -->\n" +
"        <script src=\"bower_components/metisMenu/dist/metisMenu.min.js\"></script>\n" +
"\n" +
"        <!-- Custom Theme JavaScript -->\n" +
"        <script src=\"dist/js/sb-admin-2.js\"></script>\n" +
"\n" +
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