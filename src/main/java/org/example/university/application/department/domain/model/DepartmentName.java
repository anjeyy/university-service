package org.example.university.application.department.domain.model;

import java.util.Optional;
import lombok.Getter;

@Getter
public enum DepartmentName {
    JURISPRUDENCE("JURISPRUDENCE"),
    EDUCATIONAL_SCIENCE("EDUCATIONAL_SCIENCE"),
    MATHEMATICS("MATHEMATICS"),
    COMPUTER_SCIENCE("COMPUTER_SCIENCE");

    private final String name;

    DepartmentName(String valueAsString) {
        this.name = valueAsString;
    }

    public static Optional<DepartmentName> fromString(String rawValue) {
        for (DepartmentName departmentName : DepartmentName.values()) {
            if (departmentName.name.equalsIgnoreCase(rawValue)) {
                return Optional.of(departmentName);
            }
        }
        return Optional.empty();
    }
}
