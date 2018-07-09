<%-- 
    Document   : main
    Created on : 2017/11/17, 19:02:44
    Author     : g16947ur
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>UMEKOQUIZ</title>
    </head>
    <body background="pro7.png">
    <center>
        <h1><b><i><font face="HG丸ｺﾞｼｯｸM-PRO" color="#000099">津田梅子クイズ</font></i></b></h1>
        <p>
            <%--${sessionScope.loginUser.name}--%>ログイン中
            <body link="#000099" vlink="gray" alink="red"><a href="/LogoutServlet">ログアウト</a>
        </p>
        
        <p><b>＜Q１＞津田梅子は西暦何年生まれ？</b></p>
            <form action="/Main" method="post">
                1864年<input type="radio" name="quizz1" value="0" checked="checked">
                1874年<input type="radio" name="quizz1" value="1">
                <%--<input type="submit" value="答えあわせ">--%>

                <p><b>＜Q２＞梅子がアメリカ留学へ初めて行ったのは満何歳の時？</b></p>
                <%--<form action="/Main" method="post">--%>
                6歳<input type="radio" name="quizz2" value="0" checked="checked">
                7歳<input type="radio" name="quizz2" value="1">
                <%--<input type="submit" value="答えあわせ">--%>

                <p><b>＜Q３＞梅子は何年に女子英学塾（現・津田塾大学）を創設したか？</b></p>
                <%--<form action="/Main" method="post">--%>
                1899年<input type="radio" name="quizz3" value="0" checked="checked">
                1900年<input type="radio" name="quizz3" value="1"><br>
                
                <p><b>＜Q４＞最初の女子英学塾（現・津田塾大学）の塾生の人数は？</b></p>
                <%--<form action="/Main" method="post">--%>
                8人<input type="radio" name="quizz4" value="0" checked="checked">
                10人<input type="radio" name="quizz4" value="1"><br>
                
                <p><b>＜Q５＞梅子は留学のブリンマー大学で何を専攻していたか？</b></p>
                <%--<form action="/Main" method="post">--%>
                生物学<input type="radio" name="quizz5" value="0" checked="checked">
                物理学<input type="radio" name="quizz5" value="1"><br>
                
                <p><b>＜Q６＞梅子がブリンマー大学で出会った生涯の友人となる女性の名前は？</b></p>
                <%--<form action="/AD173747/Main" method="post">--%>
                アナ・C・ハーツホン<input type="radio" name="quizz6" value="0" checked="checked">
                エルサ・C・ハーツホン<input type="radio" name="quizz6" value="1"><br>
                
                <p><b>＜Q７＞梅子が6歳で渡米した際に、お世話になった夫妻の名前は？</b></p>
                <%--<form action="/AD173747/Main" method="post">--%>
                ランタン夫妻<input type="radio" name="quizz7" value="0" checked="checked">
                ランマン夫妻<input type="radio" name="quizz7" value="1"><br>
                
                <p><b>＜Q８＞梅子さんの父親の名前は？</b></p>
                <%--<form action="/AD173747/Main" method="post">--%>
                津田仙人<input type="radio" name="quizz8" value="0" checked="checked">
                津田仙<input type="radio" name="quizz8" value="1"><br>
                
                <p><b>＜Q９＞実は、梅子は結婚したことがある？？</b></p>
                <%--<form action="/AD173747/Main" method="post">--%>
                ない<input type="radio" name="quizz9" value="0" checked="checked">
                ある<input type="radio" name="quizz9" value="1"><br>
                
                <p><b>＜Q１０＞梅子が住み込みで家庭教師をしていた人物の名前は？</b></p>
                <%--<form action="/AD173747/Main" method="post">--%>
                伊藤博文<input type="radio" name="quizz10" value="0" checked="checked">
                板垣退助<input type="radio" name="quizz10" value="1"><br>
                <br>
               <input type="submit" value="答えあわせ">
            </form>
    </center>
    </body>
</html>