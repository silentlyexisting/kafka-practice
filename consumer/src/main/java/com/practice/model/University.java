package com.practice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Long grade;
    private Long attendance;
    @ElementCollection(targetClass = String.class)
    private List<String> subjects;

    public University(String name, Long grade, Long attendance, List<String> subjects) {
        this.name = name;
        this.grade = grade;
        this.attendance = attendance;
        this.subjects = subjects;
    }
}
