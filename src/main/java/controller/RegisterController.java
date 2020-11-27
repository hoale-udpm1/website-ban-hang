package controller;

import DAO.CustomerDAO;
import DB.Connectionn;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public RegisterController(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String username= request.getParameter("username");
        String displayname= request.getParameter("displayname");
        String password= request.getParameter("password");

        Connection conn= Connectionn.CreateConnection();
        boolean rs= CustomerDAO.Register(username, displayname, password, conn);
        if(rs) {
            RequestDispatcher rd=request.getRequestDispatcher("Views/frontend/login.jsp");
            rd.forward(request, response);
        }
        else {
            RequestDispatcher rd=request.getRequestDispatcher("Views/frontend/home.jsp");
            rd.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }
}
