import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(
    name = "HelloAppEngine",
    urlPatterns = {"/hello"}
)
public class HelloAppEngine extends HttpServlet {

  @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) 
      throws IOException, ServletException {
      
    response.setContentType("text/plain");
    response.setCharacterEncoding("UTF-8");

    //response.getWriter().print("Hello App Engine!\r\n");
   

        //設定された先にフォワード
        RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
        dispatcher.forward(request, response);
    	//return forward("login.jsp");
        
  }
  protected void doPost(HttpServletRequest request,
          HttpServletResponse response)
          throws ServletException, IOException {

      //リクエストパラメータの取得
      request.setCharacterEncoding("UTF-8");
      String userId = request.getParameter("userId");
      String pass = request.getParameter("pass");

      //Userインスタンス（ユーザー情報）の生成
      User user = new User(userId, pass);

      //ログイン処理
      /*Login login = new Login(userId, pass);
      LoginLogic bo = new LoginLogic();
      boolean result = bo.execute(login);*/
      boolean result = true;

      //ログイン処理の成否によって処理を分岐
      if (result) {//ログイン成功時

          //ユーザーIDをセッションスコープに保存
          //HttpSession session = request.getSession();
      	HttpSession session = request.getSession();
          session.setAttribute("userId", userId);
          //フォワードして結果を出力
          RequestDispatcher dispatcher
                  = request.getRequestDispatcher("/loginOK.jsp");
          dispatcher.forward(request, response);
          

      } else {//ログイン失敗時
          //リダイレクト
          response.sendRedirect("/hello");
      }
  }//メソッドの終わり
}