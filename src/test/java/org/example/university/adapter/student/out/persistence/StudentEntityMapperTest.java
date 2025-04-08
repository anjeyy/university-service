package org.example.university.adapter.student.out.persistence;

import org.assertj.core.api.Assertions;
import org.example.university.application.department.domain.model.DepartmentName;
import org.example.university.application.student.domain.model.Student;
import org.example.university.application.student.domain.model.StudentId;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class StudentEntityMapperTest {

    private final StudentEntityMapper studentEntityMapper = new StudentEntityMapper();

    @Test
    void shouldConvertStudentToStudentEntity() {
        Student student =
                Student.builder()
                        .studentId(StudentId.of("FU0000000001"))
                        .firstName("Manuel")
                        .lastName("Neuer")
                        .departmentName(DepartmentName.MATHEMATICS)
                        .build();

        StudentEntity actual = studentEntityMapper.toEntity(student);

        StudentEntity expected =
                StudentEntity.builder()
                        .studentId("FU0000000001")
                        .firstName("Manuel")
                        .lastName("Neuer")
                        .departmentName("MATHEMATICS")
                        .build();
        Assertions.assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

    @Test
    void shouldConvertStudentEntityToStudent() {
        StudentEntity studentEntity =
                StudentEntity.builder()
                        .studentId("FU0000000001")
                        .firstName("Manuel")
                        .lastName("Neuer")
                        .departmentName("MATHEMATICS")
                        .build();

        Student actual = studentEntityMapper.toModel(studentEntity);

        Student expected =
                Student.builder()
                        .studentId(StudentId.of("FU0000000001"))
                        .firstName("Manuel")
                        .lastName("Neuer")
                        .departmentName(DepartmentName.MATHEMATICS)
                        .build();
        Assertions.assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }
}
