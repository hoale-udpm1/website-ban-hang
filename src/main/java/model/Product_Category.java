package model;

public class Product_Category {
    private int ProductID;
    private int CategoryID;

    public Product_Category() {
    }

    public Product_Category(int productID, int categoryID) {
        ProductID = productID;
        CategoryID = categoryID;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }
}
