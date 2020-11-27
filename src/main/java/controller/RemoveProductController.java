package controller;

import DAO.ProductDAO;
import DB.Connectionn;
import model.Cart;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;

@WebServlet("/RemoveProductController")
public class RemoveProductController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public RemoveProductController(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productID=request.getParameter("id");
        Connection conn= Connectionn.CreateConnection();
        HttpSession session = request.getSession(false);
        Cart car=(Cart)session.getAttribute("cart");

        ProductDAO.removeProductFromCart(car.getCartId(),Integer.parseInt(productID), conn);
        int count=car.getCount();count--;
        car.setCount(count);
        session.removeAttribute("cart");
        session.setAttribute("cart",car);

        RequestDispatcher rd=request.getRequestDispatcher("/CartForward");
        rd.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
