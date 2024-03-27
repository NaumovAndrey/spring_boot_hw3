package ru.gb.springboot_seminar3.entity;

import lombok.Data;

/*Сущьность КНИГА*/
@Data
public class Book {
    private  static long genId;

    private final long id;
    private final String name;

    public Book(String name) {
        id = genId++;
        this.name = name;
    }
}
