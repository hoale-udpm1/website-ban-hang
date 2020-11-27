package admin;

import DAO.CategoryDAO;
import DB.Connectionn;
import model.Category;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.util.List;

@WebServlet("/CategoryForward")
public class CategoryForward extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public CategoryForward(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn= Connectionn.CreateConnection();
        List<Category> allcategory = CategoryDAO.getAllCategory(conn);
        request.setAttribute("allcategory",allcategory);
        RequestDispatcher rd=request.getRequestDispatcher("Views/admin/category.jsp");
        rd.forward(request, response);
    }
}
