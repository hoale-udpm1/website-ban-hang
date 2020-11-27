package model;

public class Category {
    private int CategoryID;
    private String CategoryName;
    public int AdminId;

    public Category() {
    }

    public Category(int categoryID, String categoryName, int adminId) {
        CategoryID = categoryID;
        CategoryName = categoryName;
        AdminId = adminId;
    }

    public int getCategoryID() {
        return CategoryID;
    }

    public void setCategoryID(int categoryID) {
        CategoryID = categoryID;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }

    public int getAdminId() {
        return AdminId;
    }

    public void setAdminId(int adminId) {
        AdminId = adminId;
    }
}
