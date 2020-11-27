package model;

public class Product {
    private int ProductID;
    private String ProductName;
    private int Price;
    private String ScreenSize;
    private String Weight;
    private String Origin;
    private String Image;
    private String Thumbnail;
    private String Description;

    public Product() {
    }

    public Product(int productID, String productName, int price, String screenSize, String weight, String origin, String image, String thumbnail, String description) {
        ProductID = productID;
        ProductName = productName;
        Price = price;
        ScreenSize = screenSize;
        Weight = weight;
        Origin = origin;
        Image = image;
        Thumbnail = thumbnail;
        Description = description;
    }

    public int getProductID() {
        return ProductID;
    }

    public void setProductID(int productID) {
        ProductID = productID;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }

    public String getScreenSize() {
        return ScreenSize;
    }

    public void setScreenSize(String screenSize) {
        ScreenSize = screenSize;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public String getOrigin() {
        return Origin;
    }

    public void setOrigin(String origin) {
        Origin = origin;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String image) {
        Image = image;
    }

    public String getThumbnail() {
        return Thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        Thumbnail = thumbnail;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }
}