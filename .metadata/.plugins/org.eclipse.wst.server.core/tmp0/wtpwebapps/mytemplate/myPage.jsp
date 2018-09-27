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

<title>商品購入画面</title>
</head>
<body>
	<div id="header">
		<div id="pr">
		</div>
	</div>
	<div id="main">
		<div id="top">
			<p>MyPage</p>
		</div>
		<div>
		<s:if test="session.message==''">
				<h3>ご購入情報は以下になります。</h3>
			<table>
				<tr>
					<td>
						<span>商品名</span>
					</td>
					<td>
						<s:property value="session.buyItem_name"/>
					</td>
				</tr>
				<tr>
					<td>
						<span>値段</span>
					</td>
					<td>
						<s:property value="session.total_price"/>
						<span>円</span>
						</td>
				</tr>
				<tr>
					<td>
						<span>購入個数</span>
					</td>
					<td>
						<s:property value="session.total_count"/>
						<span>個</span>

					</td>
				</tr>
				<tr>
					<td>
						<span>支払い方法</span>
					</td>
					<td>
						<s:property value="session.total_payment"/>
					</td>
				</tr>
			</table>
			<s:form action="MyPageAction">
				<input type="hidden" name="deleteFlg" value="1">
				<s:submit value="削除" method="delete"/>
			</s:form>
			</s:if>
			<s:if test="session.message != null">
				<h3><s:property value="session.message"/></h3>
			</s:if>
			<div>
				<br>
				<span>前の画面に戻る場合は</span>
				<a href='<s:url action="HomeAction"/>'>ログアウト</a>
				<span>をお願いします。</span>
			</div>
		</div>
	</div>
	<div id="footer">
		<div id="pr">
		</div>
	</div>
</body>
</html>