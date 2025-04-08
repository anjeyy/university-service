package org.example.university.application.department.domain.model;

import lombok.Builder;
import org.example.university.common.validation.JakartaValidator;

public class Room {

    private final String id;
    private final String name;
    private final Integer capacity;

    @Builder
    public Room(String id, String name, Integer capacity) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        JakartaValidator.validate(this);
    }
}
