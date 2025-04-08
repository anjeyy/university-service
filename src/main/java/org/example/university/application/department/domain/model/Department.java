package org.example.university.application.department.domain.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.Collection;
import java.util.HashSet;
import lombok.Builder;
import lombok.Getter;
import org.example.university.common.validation.JakartaValidator;

@Getter
public class Department {

    @NotNull private final DepartmentName name;
    @NotEmpty private final Collection<Room> rooms;

    @Builder
    public Department(DepartmentName departmentName, Collection<Room> rooms) {
        this.name = departmentName;
        this.rooms = new HashSet<>(rooms);
        JakartaValidator.validate(this);
    }
}
