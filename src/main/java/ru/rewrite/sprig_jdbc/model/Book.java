package ru.rewrite.sprig_jdbc.model;

public class Book {
    private String name;
    private double cost;
    private String author;
    private int id;



    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", author='" + author + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
