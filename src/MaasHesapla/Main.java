package MaasHesapla;

public class Main {
    public static void main(String[] args) {

        Employee e1= new Employee("Kemal",2000,45,1985);
        e1.toStringPrint();
        e1.taxAndBonus();
        e1.toplamMaas();
    }
}
