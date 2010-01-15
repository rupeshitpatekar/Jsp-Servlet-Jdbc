<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">
<head>
	<title>Login Form with Email Password Link</title>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<link rel="stylesheet" type="text/css" media="screen" href="screen.css" />
	<script type="text/javascript" src="jquery.js"></script>
	<script type="text/javascript" src="jquery.validate.js"></script>

	<script type="text/javascript">
	
	$(document).ready(function() {
        $("#Login").click(function (){
        	        $.ajax({
                        url: "http://localhost:8090/MyWebapp/loginfo?email='"+$("#email").val()+"'&password='"+$("#password").val()+"'",
                        success:function(xmlHttp) {
                                $("#page").html(xmlHttp);          
                        }
                      });
        });                          
       
});
	</script>
	<script type="text/javascript">
	$(function() {
		// highlight 
		var elements = $("input[type!='submit'], textarea, select");
		elements.focus(function(){
			$(this).parents('li').addClass('highlight');
		});
		elements.blur(function(){
			$(this).parents('li').removeClass('highlight');
		});
		
		
		$("#login").validate()
	});
	</script>

	
</head>
<body>
	<div id="page">

		<div id="header">
			<h1>Login</h1>
		</div>

		<div id="content">
			<p id="status"></p>
			<form  method=get id="login" >
				<fieldset>
					<legend>User details</legend>
					<ul>
						<li>
							<label for="email"><span class="required">Email address</span></label>
							<input id="email" name="email" class="text required email" type="text" />
							<label for="email" class="error">This must be a valid email address</label>
						</li>
						
						<li>
							<label for="password"><span class="required">Password</span></label>
							<input name="password" type="password" class="text required" id="password" minlength="4" maxlength="20" />
						</li>
					</ul>
				</fieldset>
				
				<fieldset class="submit">
					<input type="button" class="button" id=Login value="Login" />
					<br><br><br>
					<div align="center"><a href="Welcome.jsp">Sign Up</a></div>
				</fieldset>
				
				<div class="clear"></div>
			</form>
			
			</div>
	</div>
	
</body>
</html>
