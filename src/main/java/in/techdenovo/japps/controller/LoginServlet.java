package in.techdenovo.japps.controller;

import in.techdenovo.japps.dao.LoginDao;
import in.techdenovo.japps.model.LogIn;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    LogIn logIn=new LogIn();
    LoginDao loginDao=new LoginDao();


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        logIn.setUserName(req.getParameter("uname"));
        logIn.setPassword(req.getParameter("pwd"));

        if(loginDao.logInCheck(logIn.getUserName(),logIn.getPassword())){
            System.out.println("sucessful");
           resp.sendRedirect("home.jsp");

        }
        else {

            resp.sendRedirect("login.jsp");


        }
    }

}
