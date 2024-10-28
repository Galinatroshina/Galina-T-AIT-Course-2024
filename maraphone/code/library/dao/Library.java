package library.dao;

import classwork_24.book_library.model.Book;
import library.model.Books;

public interface Library {

  boolean addBook (Books books);

  Books removeBooks (int isbn);

  Books findBooks (int isbn);

  Books updateBook (Books books);

  int quantity();

  void printBooks();

}
