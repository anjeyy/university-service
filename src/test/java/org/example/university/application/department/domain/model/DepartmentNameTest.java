package org.example.university.application.department.domain.model;

import java.util.Optional;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DepartmentNameTest {

    @Test
    void shouldConvertToDepartmentName() {
        String mathematicsDepartmentName = "MATHEMATICS";

        Optional<DepartmentName> actual = DepartmentName.fromString(mathematicsDepartmentName);

        Assertions.assertThat(actual).isNotEmpty().get().isEqualTo(DepartmentName.MATHEMATICS);
    }
}
