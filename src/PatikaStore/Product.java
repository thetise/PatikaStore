package PatikaStore;

public class Product {
    private int productID;
    private double productPrice;
    private int productDiscountRate;
    private int productAmountOfStock;
    private String productName;
    private Brand productBrand;
    private int productStorage;
    private double productScreenSize;
    private int productRAM;
    private static int nextID =1;

    public Product(double productPrice, int productDiscountRate, int productAmountOfStock,
                   String productName, Brand productBrand, int productStorage, double productScreenSize, int productRAM){
        this.productID = nextID;
        nextID++;
        this.productPrice = productPrice;
        this.productDiscountRate = productDiscountRate;
        this.productAmountOfStock = productAmountOfStock;
        this.productName = productName;
        this.productBrand = productBrand;
        this.productStorage = productStorage;
        this.productScreenSize = productScreenSize;
        this.productRAM = productRAM;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductDiscountRate() {
        return productDiscountRate;
    }

    public void setProductDiscountRate(int productDiscountRate) {
        this.productDiscountRate = productDiscountRate;
    }

    public int getProductAmountOfStock() {
        return productAmountOfStock;
    }

    public void setProductAmountOfStock(int productAmountOfStock) {
        this.productAmountOfStock = productAmountOfStock;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Brand getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(Brand productBrand) {
        this.productBrand = productBrand;
    }

    public int getProductStorage() {
        return productStorage;
    }

    public void setProductStorage(int productStorage) {
        this.productStorage = productStorage;
    }

    public double getProductScreenSize() {
        return productScreenSize;
    }

    public void setProductScreenSize(double productScreenSize) {
        this.productScreenSize = productScreenSize;
    }

    public int getProductRAM() {
        return productRAM;
    }

    public void setProductRAM(int productRAM) {
        this.productRAM = productRAM;
    }

    public static int getNextID() {
        return nextID;
    }

    public static void setNextID(int nextID) {
        Product.nextID = nextID;
    }
}
