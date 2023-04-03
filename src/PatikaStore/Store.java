package PatikaStore;

import java.util.Scanner;

public class Store {
    Scanner input = new Scanner(System.in);
    ProductPanel productpanel = new ProductPanel();

    public void run(){
        boolean status = true;
        while(status){
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonları İşlemleri");
            System.out.println("3 - Markaları Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz: ");
            int choose = input.nextInt();

            switch(choose){
                case 1:
                    productpanel.run(Notebooks.ourNotebooks);
                    break;
                case 2:
                    productpanel.run(MobilePhones.ourMobilePhones);
                    break;
                case 3:
                    listToBrand();
                    break;
                case 0:
                    System.out.println("Görüşmek Üzere <3");
                    status = false;
            }
        }
    }
    public void listToBrand(){
        for(Brand brand: Brand.ourBrands){
            System.out.println(brand.getBrandName());
        }
    }
}
