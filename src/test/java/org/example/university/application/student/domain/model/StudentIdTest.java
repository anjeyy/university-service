package org.example.university.application.student.domain.model;

import org.assertj.core.api.Assertions;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;

class StudentIdTest {

    @ParameterizedTest
    @NullAndEmptySource
    void shouldThrowExceptionForInvalidStudentId(String studentIdAsString) {
        ThrowingCallable expectedThrow = () -> StudentId.of(studentIdAsString);

        Assertions.assertThatThrownBy(expectedThrow).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void shouldThrowExceptionForInvalidStudentIdLength() {
        String studentIdAsString = "FU001";

        ThrowingCallable expectedThrow = () -> StudentId.of(studentIdAsString);

        Assertions.assertThatThrownBy(expectedThrow).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void shouldThrowExceptionForInvalidStudentIdPrefix() {
        String studentIdAsString = "ZZ0000000001";

        ThrowingCallable expectedThrow = () -> StudentId.of(studentIdAsString);

        Assertions.assertThatThrownBy(expectedThrow).isInstanceOf(IllegalArgumentException.class);
    }
}
