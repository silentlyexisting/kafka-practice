package com.practice.model;

public record Student(
        String firstName,
        String lastName,
        String city,
        College college
) {
}
