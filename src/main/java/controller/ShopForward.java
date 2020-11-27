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
import java.util.List;

@WebServlet("/ShopForward")
public class ShopForward extends HttpServlet {
    private static final long serialVersionUID = 1L;
    public ShopForward(){
        super();
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Connection conn= Connectionn.CreateConnection();
        String cate=request.getParameter("category");
        List<Product> lstpro=null;
        String page=request.getParameter("page");
        if(page==null)
        {
            lstpro= ProductDAO.getProductByCategory(conn, cate,1);
            request.setAttribute("listaccount", lstpro);
            request.setAttribute("listcount", ProductDAO.getCountProduct(conn,cate));
            request.setAttribute("cate", cate);
            request.setAttribute("currentpage", 1);

            RequestDispatcher rd=request.getRequestDispatcher("Views/frontend/shop.jsp");
            rd.forward(request, response);
        }
        else {
            lstpro=ProductDAO.getProductByCategory(conn, cate,Integer.parseInt(page));
            request.setAttribute("listaccount", lstpro);
            request.setAttribute("listcount", ProductDAO.getCountProduct(conn,cate));
            request.setAttribute("cate", cate);
            request.setAttribute("currentpage", Integer.parseInt(page));

            RequestDispatcher rd=request.getRequestDispatcher("Views/frontend/shop.jsp");
            rd.forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
