package library.model;

import java.util.Objects;

public class Books {

    private String title;
    private String author;
    private long isbn;
    private int yearOfPublishing;

    public Books(String title, String author, long isbn, int yearOfPublishing) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Books books)) return false;
        return isbn == books.isbn && yearOfPublishing == books.yearOfPublishing && Objects.equals(title, books.title) && Objects.equals(author, books.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, isbn, yearOfPublishing);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Books{");
        sb.append("title='").append(title).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", isbn=").append(isbn);
        sb.append(", yearOfPublishing=").append(yearOfPublishing);
        sb.append('}');
        return sb.toString();
    }
}