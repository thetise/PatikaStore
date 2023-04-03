package PatikaStore;

import java.util.HashMap;

public class MobilePhones extends Product{

    private double batteryPower;
    private String color;

    public static HashMap<Integer, Product> ourMobilePhones = new HashMap<>();

    public MobilePhones(double productPrice, int productDiscountRate, int productAmountOfStock, String productName, Brand productBrand, int productStorage, double productScreenSize, int productRAM, double batteryPower, String color) {
        super(productPrice, productDiscountRate, productAmountOfStock, productName, productBrand, productStorage, productScreenSize, productRAM);
        this.batteryPower = batteryPower;
        this.color = color;

        ourMobilePhones.put(this.getProductID(), this);
    }
}
