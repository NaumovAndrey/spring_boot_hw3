package ru.gb.springboot_seminar3.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.gb.springboot_seminar3.controllers.IssueRequest;
import ru.gb.springboot_seminar3.entity.Issue;
import ru.gb.springboot_seminar3.repository.BookRepository;
import ru.gb.springboot_seminar3.repository.IssueRepository;
import ru.gb.springboot_seminar3.repository.ReaderRepository;

import java.util.NoSuchElementException;

@RequiredArgsConstructor //делает конструктор
@Service
public class IssueService {
    private final BookRepository bookRepository;
    private final ReaderRepository readerRepository;
    private final IssueRepository issueRepository;

    public Issue createIssue(IssueRequest request){
        if (bookRepository.findById(request.getBookId()) == null){
            throw new NoSuchElementException("Не удалось найти книгу с id " + request.getBookId());
        }

        if (readerRepository.findById(request.getReaderId()) == null){
            throw new NoSuchElementException("Не удалось найти читателя с id " + request.getReaderId());
        }

        Issue issue = new Issue(request.getReaderId(), request.getBookId());
        issueRepository.creatIssue(issue);
        return issue;
    }
}
