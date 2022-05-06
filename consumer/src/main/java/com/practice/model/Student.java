package com.practice.model;

import com.practice.dto.UniversityDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "students")
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String city;
    @OneToOne(cascade = CascadeType.ALL)
    private University university;

    public Student(String firstName, String lastName, String city, University university) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.university = university;
    }
}
