<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LOGIN</title>
<link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
<br>
<s:property value="#session.loginDTOList.get(0).username"/>さん、ようこそ！

<table>
	<tbody>
	<tr>
		<th>USERNAME</th>
		<th>PASSWORD</th>
	</tr>
	<tr>
	<s:iterator value="#session.loginDTOList">
		<td><s:property value="username"/></td>
		<td><s:property value="password"/></td>
	</s:iterator>
	</tr>
	</tbody>
</table>
</body>
</html>