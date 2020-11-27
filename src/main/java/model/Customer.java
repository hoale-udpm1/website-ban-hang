package model;

public class Customer {
    private int CustomerID;
    private String UserName;
    private String Password;
    private String CustomerName;

    public Customer() {
    }

    public Customer(int customerID, String userName, String password, String customerName) {
        CustomerID = customerID;
        UserName = userName;
        Password = password;
        CustomerName = customerName;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }
}