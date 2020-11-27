package admin;

import DAO.OrderDAO;
import DB.Connectionn;
import model.Order;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet("/OrderForward")
public class OrderForward extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public OrderForward(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn= Connectionn.CreateConnection();
        List<Order> allProduct = OrderDAO.getAllOrder(conn);
        request.setAttribute("allproduct",allProduct);
        RequestDispatcher rd=request.getRequestDispatcher("Views/admin/order.jsp");
        rd.forward(request, response);
    }
}
