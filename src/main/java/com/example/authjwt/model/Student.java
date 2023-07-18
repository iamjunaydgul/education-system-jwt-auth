package com.example.authjwt.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Student {

    private String studentId;
    private String studentName;
    private String studentEmail;
    private String studentTelephoneNumber;
    private String studentAddress;
}
