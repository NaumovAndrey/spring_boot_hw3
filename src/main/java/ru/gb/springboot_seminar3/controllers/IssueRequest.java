package ru.gb.springboot_seminar3.controllers;

import lombok.Data;

@Data
public class IssueRequest {
    private long readerId;
    private long bookId;
}
