<%--
    Document   : login
    Created on : 30-jan-2015, 18:27:49
    Author     : sonja
--%>

<%@page import="model.Login"%>
<%@page import="controller.LoginServlet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!-- custom style for this template -->
        <link href="login.css" rel="stylesheet">
        <!-- Bootstrap CDN -->
        <!-- Latest compiled and minified CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
        <!-- Optional theme -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
        <link rel="stylesheet" href="css/login.css" type="text/css"/>

        <!-- Latest compiled and minified JavaScript -->
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
        
    </head>
    <body>
        <div class="container">
            <form class="form-login">
                <h2 class="form-login-heading">Please Login</h2>
                <label class="sr-only" for="inputUser">Username</label>
                <input class="form-control" id="inputUsername" autofocus="" required="required" type="username" placeholder="Username">
                <label class="sr-only" for="inputPassword">Password</label>
                <input class="form-control" id="inputPassword"  required="required" type="password" placeholder="Password">
                <div class="checkbox">
                    <label>
                        <input type="checkbox" value="remember-me">
                        Remember me
                    </label>
                </div>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>
            </form>
        </div>
        <!-- /container -->
        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <!-- <script src "../../assets/js/ie10-viewport-bug-workaround.js"></script> -->
                        
    </body>
</html>

