package org.example.university.adapter.department.out.persistence;

import java.time.Instant;
import java.util.Set;
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
@Document(collection = "departments")
class DepartmentEntity {

    @Id private String id;

    private String name;
    private Set<RoomEntity> rooms;

    @LastModifiedDate private Instant modifiedAt;
    @CreatedDate private Instant createdAt;
}
