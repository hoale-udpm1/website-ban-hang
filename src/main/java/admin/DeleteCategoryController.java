package admin;

import DAO.CategoryDAO;
import DB.Connectionn;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;

@WebServlet("/DeleteCategoryController")
public class DeleteCategoryController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public DeleteCategoryController(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn= Connectionn.CreateConnection();

        int id=Integer.parseInt(request.getParameter("id"));
        boolean rs= CategoryDAO.DeleteCategory(id, conn);
        if(rs)
        {
            RequestDispatcher rd=request.getRequestDispatcher("/CategoryForward");
            rd.forward(request, response);
        }
        else {

        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doPost(request, response);
    }
}
