package org.example.university.adapter.student.out.persistence;

import org.example.university.application.department.domain.model.DepartmentName;
import org.example.university.application.student.domain.model.Student;
import org.example.university.application.student.domain.model.StudentId;
import org.springframework.stereotype.Component;

@Component
class StudentEntityMapper {

    public StudentEntity toEntity(Student student) {
        StudentId studentId = student.getStudentId();
        DepartmentName departmentName = student.getDepartmentName();
        return StudentEntity.builder()
                .studentId(studentId.getValue())
                .firstName(student.getFirstName())
                .lastName(student.getLastName())
                .departmentName(departmentName.getName())
                .build();
    }

    public Student toModel(StudentEntity studentEntity) {
        StudentId studentId = StudentId.of(studentEntity.getStudentId());
        DepartmentName departmentName =
                DepartmentName.fromString(studentEntity.getDepartmentName()).orElseThrow();
        return Student.builder()
                .studentId(studentId)
                .firstName(studentEntity.getFirstName())
                .lastName(studentEntity.getLastName())
                .departmentName(departmentName)
                .build();
    }
}
