package ru.netology.javaqa.javaqamvn;

public class Book extends Product {

    public Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }

    private String author;
}