<%-- 
    Document   : loginOK
    Created on : 2018/01/14, 12:46:41
    Author     : uchiokerika
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%-- <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<!DOCTYPE html>
<%--
<html>
    <head>
        <meta charset="UTF-8">
        <title>どこつぶ</title>
    </head>
    <body>
        <h1><i><font face="Comic Sans MS" size="6" color="#ff6666">どこつぶログイン</font></i></h1>
        <p><strong><font color="#ff3300">ログインに成功しました！</font></strong></p>
        <p><b><u>ようこそ<c:out value="${userId}"/>さん</u></b></p>
        <a href="/Pareprogramming1/Main">津田梅子クイズへ</a>
    </body>
</html>
--%>
<html>
    <head>
        <meta charset="UTF-8">
        <title>UMEKOQUIZ</title>
    </head>
    <body background="pro1.png">
        <center>
        <h1><i><font face="Comic Sans MS" size="7" color="#ff9933">梅子クイズログイン</font></i></h1>
        <br>
        <br>
        <br>
        <h2><p><strong><font color="#ff3300">ログインに成功しました！</font></strong></p></h2>
        <%-- <p><b><u>ようこそ<c:out value="${userId.userId()}"/>さん</u></b></p> --%>
        <p><b><u>ようこそ${userId}さん</u></b></p>
        <h2><b><a href="/Main">津田梅子クイズへ</a></b></h2>
    </center>
    </body>
</html>