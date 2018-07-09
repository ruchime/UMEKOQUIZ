/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package servlet;

//import dao.ScoreDAO;
//import model.GetMutterListLogic;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/*import model.Account;
import model.Login;

import model.Mutter;
import model.PostMutterLogic;
import model.RegisterScoreLogic;
import model.Score;
import model.User;*/


/**
 *
 * @author g16947ur
 */
@WebServlet("/Main")
public class Main extends HttpServlet {

    //private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        /*
        //つぶやきリストを取得して、リクエストスコープに追加
        GetMutterListLogic getMutterListLogic =
                new GetMutterListLogic();
        List<Mutter> mutterList = getMutterListLogic.execute();
        request.setAttribute("mutterList",mutterList);
         */
        
        //ログインしているか確認するため
        //セッションスコープからユーザー情報を取得
        HttpSession session = request.getSession();
        Account loginAccount = (Account) session.getAttribute("loginAccount");
/*
        if (loginAccount == null) {//ログインしていない場合
            //リダイレクト
            response.sendRedirect("/Pareprogramming1/LoginServlet");
        } else {//ログイン済みの場合
        */
            //フォワード
            RequestDispatcher dispatcher
                    = request.getRequestDispatcher("/main.jsp");
            dispatcher.forward(request, response);
        //}

    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        //スコアを表す
        int score = 0;

        //リクエストパラメータの取得
        request.setCharacterEncoding("UTF-8");
        String answer1 = request.getParameter("quizz1");
        String answer2 = request.getParameter("quizz2");
        String answer3 = request.getParameter("quizz3");
        String answer4 = request.getParameter("quizz4");
        
        String answer5 = request.getParameter("quizz5");
        String answer6 = request.getParameter("quizz6");
        String answer7 = request.getParameter("quizz7");
        String answer8 = request.getParameter("quizz8");
        String answer9 = request.getParameter("quizz9");
        String answer10 = request.getParameter("quizz10");
        //String answer1 = request.getParameter("quizz1");
        

        
      //リクエストパラメータをチェック
        if (answer1.equals("0")) {//正解なら1点
            score++;
        } else {          //不正解なら何もしない
        }
        if (answer2.equals("0")) {//正解なら1点
            score++;
        } else{        //不正解なら何もしない
        }
        if (answer3.equals("1")) {//正解なら1点
            score++;
        } else {          //不正解なら何もしない
        }
        if (answer4.equals("1")) {//正解なら1点
            score++;
        } else {          //不正解なら何もしない
        }
        if (answer5.equals("0")) {//正解なら1点
            score++;
        } else {          //不正解なら何もしない
        }
        if (answer6.equals("0")) {//正解なら1点
            score++;
        } else {          //不正解なら何もしない
        }
        if (answer7.equals("1")) {//正解なら1点
            score++;
        } else {          //不正解なら何もしない
        }
        if (answer8.equals("1")) {//正解なら1点
            score++;
        } else {          //不正解なら何もしない
        }
        if (answer9.equals("0")) {//正解なら1点
            score++;
        } else {          //不正解なら何もしない
        }
        if (answer10.equals("0")) {//正解なら1点
            score++;
        } else {          //不正解なら何もしない
        }

        //スコアをString型に変換
        String score1 = String.valueOf(score);

        //登録するユーザーの情報を設定=アカウント情報をuserListに追加
        HttpSession session = request.getSession();
        Login loginUser = (Login)session.getAttribute("loginUser");
        
        //String userId = loginUser.getUserId();
        String userId = "あなた";
        
        
        //String userId = "12";
        HttpSession session2 = request.getSession();
        session2.setAttribute("score1", score1);
        
        //ScoreDAO scoreDAO = new ScoreDAO();
        
        //登録処理の呼び出し
        Score registerScore = new Score(userId, score1);
        //RegisterScoreLogic registerScoreLogic = new RegisterScoreLogic();
        //registerScoreLogic.execute(registerScore);

        
        /*   //GetRegisterDcoreListLogicを作成する必要あり
            //accountListを取得して、リクエストスコープに保存する
            GetRegisterScoreListLogic getRegisterScoreListLogic = new GetRegisterScoreListLogic();
            List<Score> scoreList = getRegisterScoreListLogic.execute();
            request.setAttribute("scoreList", scoreList);
         */
        //セッションスコープに登録ユーザーを保存
        /*HttpSession session = request.getSession();
        session.setAttribute("registerAccount", registerAccount);
         */

        //メイン画面にフォワード
        RequestDispatcher dispatcher
                = request.getRequestDispatcher("/checkAnswer.jsp");
        dispatcher.forward(request, response);
    }

}
