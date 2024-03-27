package ru.gb.springboot_seminar3.repository;

import org.springframework.stereotype.Repository;
import ru.gb.springboot_seminar3.entity.Issue;

import java.util.ArrayList;
import java.util.List;

@Repository
public class IssueRepository {
    private List<Issue> list = new ArrayList<>();
    public void creatIssue(Issue issue){
        list.add(issue);
    }

    public Issue findById(long id){
        return list.stream().filter(e -> e.getId() == id).findFirst().orElse(null);
    }
}
