/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classandobject;
import java.util.ArrayList;
/**
 *
 * @author USER
 */
public class ClassAndObject {

    public static void main(String[] args) {
        // Membuat objek buku
        Book book1 = new Book("Harry Potter", "J.K. Rowling");
        Book book2 = new Book("dilan", "pidi baiq");

        // Membuat objek perpustakaan
        Library library = new Library();

        // Menambahkan buku ke perpustakaan
        library.addBook(book1);
        library.addBook(book2);

        // Menampilkan semua buku di perpustakaan
        library.displayBooks();
    }
}
class Book {
    private String title;
    private String author;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
class Library {
    private ArrayList<Book> books;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // Method untuk menambah buku ke class library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method untuk menampilkan semua buku yang ada di library
    public void displayBooks() {
        System.out.println("Books in the library:");
        for (Book book : books) {
            System.out.println("Title: " + book.getTitle() + ", Author: " + book.getAuthor());
        }
    }
}