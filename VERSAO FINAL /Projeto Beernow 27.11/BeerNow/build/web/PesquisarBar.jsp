<%@ page language="java" 

%>

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
        <link href="bower_components/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">

        <!-- MetisMenu CSS -->
        <link href="bower_components/metisMenu/dist/metisMenu.min.css" rel="stylesheet">

        <!-- Custom CSS -->
        <link href="dist/css/sb-admin-2.css" rel="stylesheet">

        <!-- Custom Fonts -->
        <link href="bower_components/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">


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


        <div class="container-fluid">
            <!-- Page Heading -->
            <div class="row">
                <div class="col-lg-12">
                </div>
            </div>
            <!-- /.row -->
            <div class="row">
                <div class="col-lg-6">
                    <div class="divTudo">

                        <div class="panel-body">
                            <form method="get" action="ServletbuscaCerv">
                                <fieldset>

                                    <div class="form-group">
                                        <input class="form-control" placeholder="Nome da Cerveja:" name="namecerv" type="text" autofocus>
                                    </div>

                                    <div class="checkbox">

                                    </div>
                                    <!-- Change this to a button or input when using this as a form -->
                                    <input class="btn btn-default" type="submit" value="Pesquisar"><br/> 
                                </fieldset>
                            </form>
                        </div>





                    </div>
                </div>
            </div>
            <!-- /.row -->
        </div>
        <!-- /.container-fluid -->




        <!-- jQuery -->
        <script src="bower_components/jquery/dist/jquery.min.js"></script>

        <!-- Bootstrap Core JavaScript -->
        <script src="bower_components/bootstrap/dist/js/bootstrap.min.js"></script>

        <!-- Metis Menu Plugin JavaScript -->
        <script src="bower_components/metisMenu/dist/metisMenu.min.js"></script>

        <!-- Custom Theme JavaScript -->
        <script src="dist/js/sb-admin-2.js"></script>

    </body>

</html>