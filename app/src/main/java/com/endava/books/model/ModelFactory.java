package com.endava.books.model;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

public class ModelFactory {

    public static List<BookTemporal> getBooks() {

        List<BookTemporal> tmp = new ArrayList<>();
        tmp.add(new BookTemporal("El coronel no tiene quien le escriba", "Gabo", "Pollito","2008"));
        tmp.add(new BookTemporal("Breve historia del tiempo", "Hawking", "Universal", "2012"));
        return tmp;
    }

    public static List<AuthorTemporal> getAuthors() {

        List<AuthorTemporal> tmp = new ArrayList<>();
        //tmp.add();

        tmp.add(new AuthorTemporal("Gabriel", "Garcia Marquez", "86"));
        tmp.add(new AuthorTemporal("Stephen", "Hawking", "68"));

        return tmp;
    }

    public static List<PublisherTemporal> getPublishers() {

        List<PublisherTemporal> tmp = new ArrayList<>();
        //tmp.add();

        tmp.add(new PublisherTemporal("Norma", "Deja volar tu imaginacion"));
        tmp.add(new PublisherTemporal("Salamandra", "Para toda la familia"));

        return tmp;
    }

    @Data
    @AllArgsConstructor
    static class BookTemporal {

        private String name;
        private String author;
        private String publisher;
        private String year;

    }

    @Data
    @AllArgsConstructor
    static class AuthorTemporal {

        private String firstName;
        private String lastName;
        private String age;

    }

    @Data
    @AllArgsConstructor
    static class PublisherTemporal {

        private String brand;
        private String slogan;
    }
}
