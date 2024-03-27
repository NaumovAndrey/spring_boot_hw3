package ru.gb.springboot_seminar3.repository;

import org.springframework.stereotype.Repository;
import ru.gb.springboot_seminar3.entity.Reader;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ReaderRepository {
    List<Reader> readers = new ArrayList<>();
    Reader reader;
//    public Reader createReader(Reader reader){
//        readers.add(reader);
//        return reader;
//    }


    public ReaderRepository() {
        readers.add(new Reader("Andrey"));
        readers.add(new Reader("Alena"));
        readers.add(new Reader("Anna"));
    }

    public Reader findById(long id){
        return readers.stream().filter(reader -> reader.getId() == id).findFirst().orElse(null);
    }
}
