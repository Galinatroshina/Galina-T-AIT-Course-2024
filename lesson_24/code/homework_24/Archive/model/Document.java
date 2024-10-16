package homework_24.Archive.model;
// Реализуйте класс Document и приложение Archive по аналогии с Book и Library. Уникальный номер документа содержит 10 цифр.

public class Document {

    public static final int NUMBER_LENGTH = 10;

    //field
    private String title;
    private String author;
    private long number;
    private int yearOfCreate;

    // constructor
    public Document(String title, String author, long number, int yearOfCreate) {
        this.title = title;
        this.author = author;
        this.number = number;
        this.yearOfCreate = yearOfCreate;
    }
}
