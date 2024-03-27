package ru.gb.springboot_seminar3.entity;

import lombok.Data;

/*Сущьность ЧИТАТЕЛЬ*/
@Data
public class Reader {
    private  static long genId;

    private final long id;
    private final String name;

    public Reader(String name) {
        id = genId++;
        this.name = name;
    }
}
