package org.example;

public class Sayinglist {
    private long id;
    private String saying;
    private String author;

    public Sayinglist(long id, String saying, String author) {
        this.id = id;
        this.saying = saying;
        this.author = author;
    }

    public long getId() {
        return this.id;
    }

    public String getContent() {
        return this.saying;
    }

    public String getAuthor() {
        return this.author;
    }
}
