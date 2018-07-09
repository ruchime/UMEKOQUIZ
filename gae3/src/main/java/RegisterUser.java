/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
/*import model.Account;
import model.GetRegisterAccountListLogic;
import model.GetRegisterUserListLogic;
import model.PostRegisterUserLogic;
import model.RegisterAccountLogic;
import model.RegisterScoreLogic;
import model.User;*/

/**
 *
 * @author uchiokerika
 */
//@WebServlet("/RegisterUser")
@WebServlet(
	    name = "LoginServlet",
	    urlPatterns = {"/registeruser"}
	)
public class RegisterUser extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	response.setContentType("text/plain");
    	response.setCharacterEncoding("UTF-8");
        response.getWriter().print("今回は登録できません");
    }
}
