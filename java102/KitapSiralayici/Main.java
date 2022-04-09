package com.nested;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Book book1 = new Book("Aspidistra", 296);
        Book book2 = new Book("Insan Olmak", 189);
        Book book3 = new Book("Utopia", 359);
        Book book4 = new Book("Cilgin Bir İhtiyarin Guncesi", 168 );
        Book book5 = new Book("The Brothers Karamazov", 840);

        TreeSet<Book> bookSet = new TreeSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        for (Book book : bookSet){
            System.out.println("Book Name: " + book.getBookName() + "\nPage: " + book.getBookPage());
        }

        System.out.println("##############");

        TreeSet<Book> bookComparePage = new TreeSet<>(new Comparator<Book>() {
            @Override
            public int compare(Book b1, Book b2) {
                return b1.getBookPage() - b2.getBookPage();
            }
        }.reversed());

        bookComparePage.add(book1);
        bookComparePage.add(book2);
        bookComparePage.add(book3);
        bookComparePage.add(book4);
        bookComparePage.add(book5);

        for(Book book : bookComparePage){
            System.out.println("Book Name: " + book.getBookName() + "\n Page: " + book.getBookPage());

        }
    }
}
