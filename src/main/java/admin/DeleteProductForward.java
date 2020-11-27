package admin;

import DAO.ProductDAO;
import DB.Connectionn;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

@WebServlet("/DeleteProductForward")
public class DeleteProductForward extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public DeleteProductForward(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn= Connectionn.CreateConnection();

        int id=Integer.parseInt(request.getParameter("id"));
        boolean rs= ProductDAO.DeleteProduct(id, conn);
        if(rs)
        {
            RequestDispatcher rd=request.getRequestDispatcher("/ProductsForward");
            rd.forward(request, response);
        }
        else {

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
