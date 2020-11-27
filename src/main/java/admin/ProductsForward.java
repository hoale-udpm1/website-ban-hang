package admin;

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
import java.util.List;

@WebServlet("/ProductForward")
public class ProductsForward extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public ProductsForward(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn= Connectionn.CreateConnection();
        List<Product> allProduct = ProductDAO.getAllProduct(conn);
        request.setAttribute("allproduct",allProduct);
        RequestDispatcher rd=request.getRequestDispatcher("Views/admin/products.jsp");
        rd.forward(request, response);
    }
}
