<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Script-Type" content="text/javascript">
<meta http-equiv="imagetoolbar" content="no">
<meta name="description" content=""/>
<meta name="keywords" content=""/>

<link rel="stylesheet" type="text/css" href="./css/style.css">

<title>ユーザー登録完了画面</title>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>UserCreateComplete</p>
		</div>
		<div>
			<h3>ユーザーの登録が完了いたしました。</h3>
			<div>
				<a href='<s:url action="HomeAction"/>'>ログインへ</a>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>