package ru.gb.springboot_seminar3.controllers;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.springboot_seminar3.entity.Issue;
import ru.gb.springboot_seminar3.services.IssueService;

import java.util.NoSuchElementException;

@Slf4j //log
@RestController
@RequestMapping("issue")
@RequiredArgsConstructor
public class IssueController {

    @Autowired
    private IssueService service;


    @GetMapping
    public ResponseEntity<Issue> issueBook(@RequestBody IssueRequest issueRequest){
        log.info("Поступил запрос на выдачу: readrerId: {}, bookId={}"
                , issueRequest.getReaderId(), issueRequest.getBookId());
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(service.createIssue(issueRequest));
        } catch (NoSuchElementException e){
            return ResponseEntity.notFound().build();
        }
    }
}
