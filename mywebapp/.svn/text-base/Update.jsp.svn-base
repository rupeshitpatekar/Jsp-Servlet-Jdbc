<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div id="page">
<h1>User Information</h1>
<form action=update method=get>
<table>
<tr>
<td>
First Name is:
<input type=text name=fname value=<%=request.getAttribute("fname")%>>
</td>
</tr><br>
<tr>
<td>
Last Name is:
<input type=text name=lname value=<%=request.getAttribute("lname")%>>
</td>
</tr>
<br>
<tr>
<td>
User Name is:
<input type=text name=uname value=<%=request.getAttribute("username")%>>
</td>
</tr>
<br>
<tr>
<td>
Password is:
<input type=text name=pwd value=<%=request.getAttribute("userpwd")%>>
</td>
</tr>
<br>
<BR><input type=submit value=Edit>
</td></tr></table></form>
<form action=delete method=get id=update>
<input type=hidden name=username value=<%=request.getAttribute("username")%>>
<input type=button id=Delete value=Delete>
</form>
</body>
</html>








