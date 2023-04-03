package PatikaStore;

import java.util.HashMap;
import java.util.Scanner;

public class ProductPanel {
    Scanner input = new Scanner(System.in);
    public void run(HashMap<Integer, Product> ourProdcutList){
        boolean status = true;
        while(status){
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz.");
            System.out.println("1 - Ürün ekleme.");
            System.out.println("2 - Ürün silme.");
            System.out.println("3 - Ürün listele.");
            System.out.println("4 - Filtreleme ile ürün listele.");
            System.out.println("0 - Çıkış yap.");
            int choose = input.nextInt();
            switch(choose){
                case 1:
                    addProduct(ourProdcutList);
                    break;
                case 2:
                    deleteProduct(ourProdcutList);
                    break;
                case 3:
                    listProduct(ourProdcutList);
                    break;
                case 4:
                    searchByFilter(ourProdcutList);
                    break;
                case 0:
                    status = false;
                default:
                    System.out.println("Lütfen geçerli bir işlem rakamını tuşlayınız.");
            }
        }
    }

    public void addProduct(HashMap<Integer, Product> ourProductList){
        System.out.print("Lütfen ürünün adını giriniz: "); input.nextLine();
        String productName = input.nextLine();

        Brand ourBrand = null;
        boolean status = true;

        while(status){
            System.out.print("Lütfen (sistemde kayıtlı ürünlerden) ürünün markasını giriniz: ");
            String brandOfProduct = input.nextLine();
            for(Brand brand: Brand.ourBrands){
                if(brand.getBrandName().equals(brandOfProduct)){
                    ourBrand = brand;
                    status = false;
                }
            }
        }

        System.out.print("Lütfen ürünün ekran boyutunu giriniz: ");
        double screenSize=input.nextDouble();

        System.out.print("Lütfen ürünün hafıza kapasitesinin giriniz: ");
        int memory=input.nextInt();

        System.out.print("Lütfen ürünün ram miktarını giriniz: ");
        int ram=input.nextInt();

        System.out.print("Lütfen ürünün fiyatını giriniz: ");
        double price=input.nextInt();

        System.out.print("Lütfen ürünün stok adedini giriniz: ");
        int quality=input.nextInt();

        System.out.print("Lütfen ürünün indirim oranını giriniz ");
        int discountRate=input.nextInt();

        Product newProduct = new Product(price, discountRate, quality, productName, ourBrand, memory, screenSize, ram);
        ourProductList.put(newProduct.getProductID(), newProduct);
    }

    public void deleteProduct(HashMap<Integer, Product> ourProductList){
        System.out.print("Silmek istediğiniz ürünün id numarasını giriniz: ");
        int id = input.nextInt();

        if(ourProductList.containsKey(id)){
            System.out.println(id + " ID numaralı ürün silinmiştir.");
            ourProductList.remove(id);
        }
        else{
            System.out.println("Bu id değerine sahip ürün yoktur.");
        }
    }

    public void listProduct(HashMap<Integer, Product> ourProductList){
        String format = "| %-8s | %-30s | %-22s | %-12s | %-25s | %-16s | %-22s | %-16s | %-22s |\n";
        System.out.format("+----------+--------------------------------+------------------------+--------------+---------------------------+------------------+------------------------+------------------+------------------------+\n");
        System.out.format("| ID       | Ürün Adı                       | Marka                  | Ekran Boyutu | Depolama Kapasitesi       | RAM Kapasitesi   | Fiyat                  | Adet             | İndirim Oranı          |\n");
        System.out.format("+----------+--------------------------------+------------------------+--------------+---------------------------+------------------+------------------------+------------------+------------------------+\n");

        for(Product product: ourProductList.values()){
            System.out.format(format, product.getProductID(), product.getProductName(), product.getProductBrand().getBrandName(),
                    product.getProductScreenSize(), product.getProductStorage(), product.getProductRAM(),
                    product.getProductPrice(), product.getProductAmountOfStock(), product.getProductDiscountRate());
            System.out.format("+----------+--------------------------------+------------------------+--------------+---------------------------+------------------+------------------------+-------------------------------------------+\n");
        }
    }

    public void searchByFilter(HashMap<Integer, Product> ourProductList){
        System.out.print("Filtrele: "); input.nextLine();
        String filter = input.nextLine();

        if(filter.matches("\\d+")){
            int ourFilter = Integer.parseInt(filter);
            if(ourProductList.containsKey(ourFilter)){
                Product product = ourProductList.get(ourFilter);
                String format = "| %-8s | %-30s | %-22s | %-12s | %-25s | %-16s | %-22s | %-16s | %-22s |\n";
                System.out.format("+----------+--------------------------------+------------------------+--------------+---------------------------+------------------+------------------------+------------------+------------------------+\n");
                System.out.format("| ID       | Ürün Adı                       | Marka                  | Ekran Boyutu | Depolama Kapasitesi       | RAM Kapasitesi   | Fiyat                  | Adet             | İndirim Oranı          |\n");
                System.out.format("+----------+--------------------------------+------------------------+--------------+---------------------------+------------------+------------------------+------------------+------------------------+\n");
                System.out.format(format, product.getProductID(), product.getProductName(), product.getProductBrand().getBrandName(),
                        product.getProductScreenSize(), product.getProductStorage(), product.getProductRAM(),
                        product.getProductPrice(), product.getProductAmountOfStock(), product.getProductDiscountRate());
                System.out.format("+----------+--------------------------------+------------------------+--------------+---------------------------+------------------+------------------------+-------------------------------------------+\n");
            }
            else{
                System.out.println("Bu id numarasına sahip ürün bulunamadı.");
            }
        }
        else if(filter.matches("\\D+")){
            if(ourProductList.values().stream().anyMatch(p->p.getProductBrand().getBrandName().equals(filter))){
                for(Product product: ourProductList.values()){
                    if(product.getProductBrand().getBrandName().equals(filter)){
                        String format = "| %-8s | %-30s | %-22s | %-12s | %-25s | %-16s | %-22s | %-16s | %-22s |\n";
                        System.out.format("+----------+--------------------------------+------------------------+--------------+---------------------------+------------------+------------------------+------------------+------------------------+\n");
                        System.out.format("| ID       | Ürün Adı                       | Marka                  | Ekran Boyutu | Depolama Kapasitesi       | RAM Kapasitesi   | Fiyat                  | Adet             | İndirim Oranı          |\n");
                        System.out.format("+----------+--------------------------------+------------------------+--------------+---------------------------+------------------+------------------------+------------------+------------------------+\n");
                        System.out.format(format, product.getProductID(), product.getProductName(), product.getProductBrand().getBrandName(),
                                product.getProductScreenSize(), product.getProductStorage(), product.getProductRAM(),
                                product.getProductPrice(), product.getProductAmountOfStock(), product.getProductDiscountRate());
                        System.out.format("+----------+--------------------------------+------------------------+--------------+---------------------------+------------------+------------------------+-------------------------------------------+\n");
                    }
                }
            }
            else{
                System.out.println("Belirtilen marka ile eşleşen bir ürün bulunamadı.");
            }
        }
        else{
            System.out.println("Filtreleme id veya marka ismine göre yapılıyor, lütfen bu değerlerden birini giriniz.");
        }
    }
}