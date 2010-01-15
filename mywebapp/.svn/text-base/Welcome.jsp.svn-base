<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="content-type" content="text/html; charset=UTF-8">
<title>Welcome</title>
<script src="jquery.js"></script>
<script src="jquery.validate.js"></script>

<script type="text/javascript">
$(document).ready(function() {

$("#Create").validate();

$("#fname").css("border","2px solid magenta");
$("#lname").css("border","2px solid magenta");
$("#uname").css("border","2px solid magenta");
$("#pwd").css("border","2px solid magenta");

$("#go").click(function () {
      $("pa").hide(2000, function () {
        // use callee so don't have to name the function
        $(this).prev().hide("slow", arguments.callee); 
      });
    });
$("#sh").click(function () {
      $("pa").show(2000);
    });
});
  
</script>

</head>

<body bgcolor="ivory">
<iframe src="javascript:''" id="__gwt_historyFrame" tabIndex='-1'
	style="position: absolute; width: 0; height: 0; border: 0"></iframe>
<form id="Create" action="http://localhost:8090/MyWebapp/insert"
	method="GET"><pa><font color='red'>Created By
Rupeshit Patekar </font> <font color='green'><br>
Developer in Wissen</font></pa> <br>
<br>
<font color='red'> Enter your First Name: </font><input type=text
	id=fname name=firstname class="required" size=30> <br>
<br>
<br>
<font color='red'> Enter your Last Name:</font><input type=text id=lname
	name=lastname class="required" size=30> <br>
<br>
<br>
<font color='red'> Enter User Name:</font><input type=text id=uname
	name=username class="email" size=30> <br>
<br>
<br>
<font color='red'> Enter Password:</font><input type=password id=pwd
	name=pwd class="required" size=30> <br>
<br>
<br>
<font color='red'> Confirm Password:</font><input type=password id=cpwd
	name=cpwd equalTo=#pwd size=30> <br>
<br>
<br>

<input type=button id=go name=hide value="Hide"> <input
	type=button id=sh name=show value="Show"> <input type=submit
	id=sub name=submit value="Submit"></form>
</body>
</html>