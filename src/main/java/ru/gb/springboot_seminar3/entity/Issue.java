package ru.gb.springboot_seminar3.entity;

import lombok.Data;

import java.time.LocalDateTime;

/*Сущьность ОБЪЕКТ ВЫДАЧИ*/
@Data
public class Issue {
    private static long genId;

    private final long id; //id конкретного запроса
    private final long idReader; //id читателя
    private final long idBook; //id книги
    private final LocalDateTime time;

    public Issue(long idReader, long idBook) {
        id = genId++;
        this.idReader = idReader;
        this.idBook = idBook;
        time = LocalDateTime.now();
    }
}
