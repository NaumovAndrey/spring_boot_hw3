package ru.gb.springboot_seminar3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootSeminar3Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootSeminar3Application.class, args);
    }
    //БИБЛИОТЕКА
    /*
    1. Контроллеры (controllers, api)
    2. Сервисный слой (services)
    3. Репозиторий (repositiry, dao)
    4. Сущности (entity, model)



     /*Сущности->
        book (книга)
        reader (читатель)
        issue (выдача)
    Репозиторий->
        Для каждой сущьности создаём свойрепозиторий:
        BookRepository
        IssueRepository
        ReaderRepository

     */
}
