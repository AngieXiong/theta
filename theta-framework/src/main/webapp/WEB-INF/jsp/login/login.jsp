<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- 引用css -->
<link rel="stylesheet" type="text/css" href="plugins/bootstrap-3.3.7/css/bootstrap.min.css"/>
<link rel="stylesheet" type="text/css" href="plugins/bootstrap-3.3.7/css/bootstrap-theme.min.css"/>
<link rel="stylesheet" type="text/css" href="css/login/login.css"/>

<!-- 引用js-->
<script type="text/javascript" src="plugins/jquery1.11/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="plugins/bootstrap-3.3.7/js/bootstrap.min.js"></script>

<title>user login</title>
</head>
<body class="content-center">
<div class="navbar navbar-inverse navbar-fixed-top">
</div>
<div class="jumbotron masthead">
    <div class="container mid-content">
    	<div class="content-center">
    		<img style="width:50px;height:50px;" src="images/logotypes/loginLogo.png" alt=""/>
    	</div>
        <div class="auth-form-body mt-3">
        	<div class="content-left">
            	<label for="">Sign in to Theta</label>
        	</div>
            <input class="form-control input-block" id="login_field_account" name="login" tabindex="1" type="text" placeholder="input your account here..."/>
            <div class="content-left">
            	<label for="password">Password</label>
            	<a href="" class="label-link">Forgot password?</a>
            </div>
            <input class="form-control input-block" id="login_field_passwd" name="login" tabindex="1" type="text" placeholder="input your password here..."/>
           
            <input class="btn btn-primary btn-block" name="commit" tabindex="3" value="Sign in" type="submit">
        </div>
        <p class="create-account-callout mt-3 mid-font-family">
            New to Theta?
            <a href="" >Create an account</a>.
          </p>
    </div>
</div>
</body>
</html>