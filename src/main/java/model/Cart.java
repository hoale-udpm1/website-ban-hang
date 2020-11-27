package model;

public class Cart {
    private int CartId;
    private int Count;
    private int CustomerID;

    public Cart() {
    }

    public Cart(int cartId, int count, int customerID) {
        CartId = cartId;
        Count = count;
        CustomerID = customerID;
    }

    public int getCartId() {
        return CartId;
    }

    public void setCartId(int cartId) {
        CartId = cartId;
    }

    public int getCount() {
        return Count;
    }

    public void setCount(int count) {
        Count = count;
    }

    public int getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(int customerID) {
        CustomerID = customerID;
    }
}
