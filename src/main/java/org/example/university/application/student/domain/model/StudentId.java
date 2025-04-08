package org.example.university.application.student.domain.model;

import lombok.Getter;

@Getter
public class StudentId {

    private final String value;

    private StudentId(String value) {
        this.value = validate(value);
    }

    private String validate(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("StudentId cannot be blank.");
        }

        if (value.length() != 12) {
            throw new IllegalArgumentException("StudentId length must be 12.");
        }

        if (!value.startsWith("FU")) {
            throw new IllegalArgumentException("StudentId must start with 'FU'.");
        }
        return value;
    }

    public static StudentId of(String value) {
        return new StudentId(value);
    }
}
