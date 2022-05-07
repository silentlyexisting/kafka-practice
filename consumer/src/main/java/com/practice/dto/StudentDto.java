package com.practice.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentDto {

    private String firstName;
    private String lastName;
    private String city;
    private CollegeDto college;

}
