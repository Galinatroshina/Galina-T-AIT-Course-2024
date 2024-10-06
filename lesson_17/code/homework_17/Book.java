package homework_17;

public class Book {

    //fields
    private long isbn;
    private String title;
    private String author;
    private long yearOfPublishing;
    private String genre;

    public Book(long isbn, String title, String author, long yearOfPublishing, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
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

    public long getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(long yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void display (){
        System.out.println("ISBN: " + isbn + " Title: " + title + " Author: " + author + " Year of publishing: " +
                yearOfPublishing + " Genre: " + genre);
    }
}
