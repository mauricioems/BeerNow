<%-- 
    Document   : CadastroCli
    Created on : 27/11/2015, 15:34:02
    Author     : win7
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>SB Admin 2 - Bootstrap Admin Theme</title>

        <!-- Bootstrap Core CSS -->
        <link href="bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        
        <!-- MetisMenu CSS -->
        <link href="bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet" type="text/css"/>
        
        <!-- Custom CSS -->
        <link href="dist/css/sb-admin-2.css" rel="stylesheet" type="text/css"/>
        
        <!-- Custom Fonts -->
        <link href="bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
        
        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
            <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
        <![endif]-->
   
 <style type="text/css">
    
        .divTudo {
            margin-top:200px;
            text-align:center;
            width: 450px;
            background-color: rgba(255, 255, 255, 0.5);
            border: 1px solid #DADADA;
            -webkit-box-shadow: 0 0 13px 5px rgba(0, 0, 0, .2);
            -moz-box-shadow:  0 0 13px 5px rgba(0, 0, 0, .2);
            box-shadow:  0 0 13px 5px rgba(0, 0, 0, .2);
            margin-bottom: 30px;
            border: 1px solid #999;
            border: 1px solid rgba(0,0,0,.2);
            border-radius: 6px;
        }
    </style>
</head>

<body style="background-image: url('Imagens/BeerNowBackground.jpg')">
    

        <div class="container">
        <div class="row">
            <div class="col-md-4 col-md-offset-4">
                <div class="login-panel panel panel-default">
                    <div class="panel-heading">
                        <h3 class="panel-title">Cadastro</h3>
                    </div>
                    <div class="panel-body">
                        <form method="post" action="ServletCadCli">
                            <fieldset>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Nome" name="nome" type="text" autofocus>
                                </div>
                                
                                <div class="form-group">
                                    <input class="form-control" placeholder="Sobrenome" name="sobrenome" type="text" autofocus>
                                </div>
                                
                                <div class="form-group">
                                    <input class="form-control" placeholder="Username" name="username" type="text" autofocus>
                                </div>
                                
                                <div class="form-group">
                                    <input class="form-control" placeholder="Senha" name="password" type="password" value="">
                                </div>
                                
                                <div class="form-group">
                                    <input class="form-control" placeholder="CPF" name="cpf" type="text" autofocus>
                                </div>
                                
                                <div class="form-group">
                                    <input class="form-control" placeholder="Celular" name="celular" type="text" autofocus>
                                </div>
                                <div class="form-group">
                                    <input class="form-control" placeholder="Ranking" name="ranking" type="text" autofocus>
                                </div>
                                
                                <div class="form-group">
                                    <input class="form-control" placeholder="Endereco" name="endereco" type="text" autofocus>
                                </div>
                                
                                <div class="form-group">
                                    <input class="form-control" placeholder="Data de nascimento" name="datanascimento" type="text" autofocus>
                                </div>
                                
                                <!-- Change this to a button or input when using this as a form -->
                              <input class="btn btn-default" type="submit" value="Cadastrar"><br/> 
                            </fieldset>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
        <!-- /.container-fluid -->
  

  
   
   <!-- jQuery -->
        <script src="bower_components/jquery/dist/jquery.min.js" type="text/javascript"></script>
        
        <!-- Bootstrap Core JavaScript -->
        <script src="bower_components/bootstrap/dist/js/bootstrap.min.js" type="text/javascript"></script>
        
        <!-- Metis Menu Plugin JavaScript -->
        <script src="bower_components/metisMenu/dist/metisMenu.min.js" type="text/javascript"></script>
        
        <!-- Custom Theme JavaScript -->
        <script src="dist/js/sb-admin-2.js" type="text/javascript"></script>
        

</body>

</html>
