package com.matheus.simplemail.model;

import lombok.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Email {


    private String from;
    private String to;
    private String subject;
    private String body;
}
