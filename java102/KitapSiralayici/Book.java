package com.nested;

public class Book implements Comparable<Book>{

    private String bookName;
    private int bookPage;

    public Book(String bookName, int bookPage){
        this.bookName = bookName;
        this.bookPage = bookPage;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookPage() {
        return bookPage;
    }

    public void setBookPage(int bookPage) {
        this.bookPage = bookPage;
    }

    @Override
    public int compareTo(Book compared) {
        return this.bookName.compareTo(compared.getBookName());
    }

    @Override
    public String toString(){
        return this.bookName + " : " + this.bookPage;
    }
}
