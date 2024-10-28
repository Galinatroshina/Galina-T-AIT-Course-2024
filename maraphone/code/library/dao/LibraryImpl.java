package library.dao;

import library.model.Books;

public class LibraryImpl implements Library {

    private Books[] books;
    private int size;

    public LibraryImpl (int capacity){
        this.books = new Books[capacity];
        this.size = 0;
    }

    @Override
    public boolean addBook(Books books) {
        return false;
    }

    @Override
    public Books removeBooks(int isbn) {
        return null;
    }

    @Override
    public Books findBooks(int isbn) {
        return null;
    }

    @Override
    public Books updateBook(Books books) {
        return null;
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public void printBooks() {

    }
}
