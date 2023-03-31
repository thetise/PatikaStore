package bookSet;

import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Bin Dokuz Yüz Seksen Dört", 150, "George Orwell", 2015);
        Book book2 = new Book("Kedi Beşiği", 715, "Kurt Vonnegut", 1960);
        Book book3 = new Book("Ender'in Oyunu", 651, "Orson Scott Card", 2000);
        Book book4 = new Book("Cesur Yeni Dünya",  481, "Aldous Huxley", 1980);
        Book book5 = new Book("Algernon'a Çiçekler", 275, "Daniel Keys", 2023);

        TreeSet<Book> bookSortedbyName = new TreeSet<>(new orderByNameComparator());
        bookSortedbyName.add(book1);
        bookSortedbyName.add(book2);
        bookSortedbyName.add(book3);
        bookSortedbyName.add(book4);
        bookSortedbyName.add(book5);

        System.out.println("---------------Books Sorted By Name---------------");
        for(Book nameSet: bookSortedbyName){
            System.out.println(nameSet.getName());
        }


        TreeSet<Book> bookSortedbyPage = new TreeSet<>(new orderByPageComparator().reversed());
        bookSortedbyPage.add(book1);
        bookSortedbyPage.add(book2);
        bookSortedbyPage.add(book3);
        bookSortedbyPage.add(book4);
        bookSortedbyPage.add(book5);

        System.out.println("---------------Books Sorted By Page---------------");
        for(Book nameSet: bookSortedbyPage){
            System.out.println(nameSet.getName() + " " + nameSet.getPage());
        }
    }
}
