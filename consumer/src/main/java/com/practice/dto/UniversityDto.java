package com.practice.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class UniversityDto {

    private String name;
    private Long grade;
    private Long attendance;
    private List<String> subjects;

}
