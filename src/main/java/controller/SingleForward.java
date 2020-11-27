package controller;

import DAO.ProductDAO;
import DB.Connectionn;
import model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

@WebServlet("/SingleForward")
public class SingleForward extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public SingleForward(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id=Integer.parseInt(request.getParameter("id"));
        Connection conn= Connectionn.CreateConnection();
        Product pro= ProductDAO.getProductById(id, conn);
        request.setAttribute("pro", pro);

        RequestDispatcher rd=request.getRequestDispatcher("Views/frontend/single-product.jsp");
        rd.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
