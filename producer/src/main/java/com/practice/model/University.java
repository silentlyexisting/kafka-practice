package com.practice.model;

import java.util.List;

public record University(
        String name,
        Long grade,
        Long attendance,
        List<String> subjects
) {
}
