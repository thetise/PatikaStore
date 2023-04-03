package PatikaStore;

import java.util.HashMap;

public class Notebooks extends Product{

    public static HashMap<Integer, Product> ourNotebooks = new HashMap<>();

    public Notebooks(double productPrice, int productDiscountRate, int productAmountOfStock, String productName, Brand productBrand, int productStorage, double productScreenSize, int productRAM) {
        super(productPrice, productDiscountRate, productAmountOfStock, productName, productBrand, productStorage, productScreenSize, productRAM);
        ourNotebooks.put(this.getProductID(), this);
    }
}
