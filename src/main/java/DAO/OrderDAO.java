package DAO;

import model.Order;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {
    public static boolean InsertOrder(Connection conn, Order ord){
        PreparedStatement ptmt = null;
        String sql = "insert into orderbilling(FullName,Phone,Email,Address,Zipcode,CustomerID,Total,PaymentMethod" + "value(?,?,?,?,?,?,?,?)";
        try {
            ptmt = conn.prepareStatement(sql);
            ptmt.setString(1,ord.getFullName());
            ptmt.setString(2,ord.getPhone());
            ptmt.setString(3,ord.getEmail());
            ptmt.setString(4,ord.getAddress());
            ptmt.setString(5,ord.getZipCode());
            ptmt.setInt(6,ord.getCustomerID());
            ptmt.setInt(7,ord.getTotal());
            ptmt.setString(8, ord.getPaymentMethod());

            int ra = ptmt.executeUpdate();
            if (ra == 0) {
                return false;
            }
            return true;
        }
        catch (SQLException e){
            return false;
        }
    }

    public static List<Order> getAllOrder(Connection conn){
        {
            List<Order> lstorder = new ArrayList<Order>();
            PreparedStatement ptmt = null;
            String sql = "select * from orderbilling";
                    try {
                        ptmt = conn.prepareStatement(sql);

                        ResultSet rs = ptmt.executeQuery();
                        while (rs.next())
                        {
                            Order pro = new Order();
                            pro.setOrderID(rs.getInt("OrderID"));
                            pro.setFullName(rs.getString("FullName"));
                            pro.setPhone(rs.getString("Phone"));
                            pro.setEmail(rs.getString("Email"));
                            pro.setAddress(rs.getString("Address"));
                            pro.setZipCode(rs.getString("ZipCode"));
                            pro.setCustomerID(rs.getInt("CustomerID"));
                            pro.setTotal(rs.getInt("Total"));
                            pro.setPaymentMethod(rs.getString("PaymentMethod"));
                            lstorder.add(pro);
                        }
                        ptmt.close();
                    }
                    catch (SQLException e){
                        e.printStackTrace();
                    }
                    return lstorder;
        }
    }
}
