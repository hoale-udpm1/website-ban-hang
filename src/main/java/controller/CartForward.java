package controller;

import DAO.ProductDAO;
import DB.Connectionn;
import model.Cart;
import model.Product;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet("/CartForward")
public class CartForward extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public CartForward(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session.getAttribute("user") != null) {
            Connection conn= Connectionn.CreateConnection();
            Cart car=(Cart)session.getAttribute("cart");
            List<Product> productsInCart = ProductDAO.getProductByCartId(conn, car.getCartId());
            request.setAttribute("productsInCart", productsInCart);

            RequestDispatcher rd=request.getRequestDispatcher("Views/frontend/cart.jsp");
            rd.forward(request, response);
        }
        else {
            RequestDispatcher rd=request.getRequestDispatcher("Views/frontend/login.jsp");
            rd.forward(request, response);
        }
    }
}
