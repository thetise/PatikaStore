package PatikaStore;

import java.util.*;

public class Brand {
    private int brandID;
    private String brandName;
    private static int nextID = 1;
    public static List<Brand> ourBrands = new ArrayList<>();

    public Brand(String brandName){
        this.brandName = brandName;
        this.brandID = nextID;
        if(nextID > 9 ){
            ourBrands.add(this);
            nextID++;
            ourBrands.sort(Comparator.comparing(Brand::getBrandName));
        }
    }

    static{
        ourBrands.add(new Brand("Samsung"));
        ourBrands.add(new Brand("Lenovo"));
        ourBrands.add(new Brand("Apple"));
        ourBrands.add(new Brand("Huawei"));
        ourBrands.add(new Brand("Casper"));
        ourBrands.add(new Brand("Asus"));
        ourBrands.add(new Brand("HP"));
        ourBrands.add(new Brand("Xiomi"));
        ourBrands.add(new Brand("Monster"));
        ourBrands.sort(Comparator.comparing(Brand::getBrandName));
    }

    public int getBrandID() {
        return brandID;
    }
    public void setBrandID(int brandID) {
        this.brandID = brandID;
    }

    public String getBrandName() {
        return brandName;
    }
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
