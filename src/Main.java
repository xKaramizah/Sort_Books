/*
Kitap Sıralayıcı

Book isminde bir sınıf tasarlayınız. Bu sınıf Comparable interface'den kalıtım alıp "compareTo" metodunu override ediniz. Bu metodun içinde kitabı A'dan Z'ye isme göre sıralayan kodu yazınız.
Bu sınıftan 5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız.
Sonra ikinci kez Set tipinden bir veri yapısı kullanın ve kitapları sayfa sayısına göre sıralamasını sağlayınız.

Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.
*/

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Book b1 = new Book(3, "abook3", "cauthor3", 48);
        Book b2 = new Book(1, "bbook1", "vauthor1", 54);
        Book b3 = new Book(4, "fbook4", "bauthor4", 556);
        Book b4 = new Book(5, "dbook5", "qauthor5", 104);
        Book b5 = new Book(2, "ebook2", "rauthor2", 240);

        TreeSet<Book> books = new TreeSet<>();

        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        System.out.println("\t####### Books sorted by name #######" +
                "\n---------------------------------------------");
        for (Book book : books) {
            System.out.println("ID: " + book.getId() + " Name: " + book.getName() + " Author: " + book.getAuthor() + " Page: " + book.getPage());
        }

        TreeSet<Book> books1 = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return Integer.compare(o1.getPage(), o2.getPage());
            }
        });

        books1.add(b1);
        books1.add(b2);
        books1.add(b3);
        books1.add(b4);
        books1.add(b5);

        System.out.println("####### Books sorted by page  number #######" +
                "\n----------------------------------------------");
        for (Book book : books1) {
            System.out.println("ID: " + book.getId() + " Name: " + book.getName() + " Author: " + book.getAuthor() + " Page: " + book.getPage());
        }
    }
}
