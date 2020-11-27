package model;

public class Order {
private int OrderID;
    private String FullName;
    private String Phone;
    private String Email;
    private String Address;
    private String ZipCode;
    private int CustomerID;
    private int Total;
    private String PaymentMethod;

    public Order() {
    }

    public Order(int orderID, String fullName, String phone, String email, String address, String zipCode, int customerID, int total, String paymentMethod) {
        OrderID = orderID;
        FullName = fullName;
        Phone = phone;
        Email = email;
        Address = address;
        ZipCode = zipCode;
        CustomerID = customerID;
        Total = total;
        PaymentMethod = paymentMethod;
    }

    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int orderID) {
        OrderID = orderID;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }


    public String getZipCode() {
        return ZipCode;
    }

    public void setZipCode(String zipCode) {
        ZipCode = zipCode;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int total) {
        Total = total;
    }

    public String getPaymentMethod() {
        return PaymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        PaymentMethod = paymentMethod;
    }
}
