package org.example.university.adapter.student.out.persistence;

import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "students")
class StudentEntity {

    @Id private String id;

    private String studentId;
    private String firstName;
    private String lastName;
    private String departmentName;

    @LastModifiedDate private Instant modifiedAt;
    @CreatedDate private Instant createdAt;
}
