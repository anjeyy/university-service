package org.example.university.application.student.domain.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import org.example.university.application.department.domain.model.DepartmentName;
import org.example.university.common.validation.JakartaValidator;

@Getter
public class Student {

    @NotNull private final StudentId studentId;
    @NotBlank private final String firstName;
    @NotBlank private final String lastName;
    @NotNull private DepartmentName departmentName;

    @Builder
    public Student(
            StudentId studentId, String firstName, String lastName, DepartmentName departmentName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentName = departmentName;
        JakartaValidator.validate(this);
    }
}
