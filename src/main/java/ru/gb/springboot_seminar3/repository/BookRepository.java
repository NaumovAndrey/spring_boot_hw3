package ru.gb.springboot_seminar3.repository;

import org.springframework.stereotype.Repository;
import ru.gb.springboot_seminar3.entity.Book;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookRepository {
    List<Book> list = new ArrayList<>();

//    public Book creatBookRepository(Book book) {
//        list.add(book);
//        return book;
//    }


    public BookRepository() {
        list.add(new Book("Война и мир"));
        list.add(new Book("Мастер и маргарита"));
        list.add(new Book("Приключения Буратино"));
    }

    public Book findById(long id){
        return list.stream().filter(e->e.getId() == id).findFirst().orElse(null);
    }
}
