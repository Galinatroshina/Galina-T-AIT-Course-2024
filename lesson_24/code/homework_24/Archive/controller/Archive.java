package homework_24.Archive.controller;

import homework_24.Archive.model.Document;

public class Archive {

    // fields
    private Document[] documents;
    private int size; // текущее кол-во документов

    //constructor
    public Archive(int capacity) {
        this.documents = new Document[capacity];
        this.size = 0;
    }


}
