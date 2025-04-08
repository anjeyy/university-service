package org.example.university.common.validation;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.util.Set;
import org.example.university.common.annotation.JacocoGeneratedExclusion;

public class JakartaValidator {

    @JacocoGeneratedExclusion
    private JakartaValidator() {
        throw new UnsupportedOperationException("No instance allowed.");
    }

    public static <T> void validate(T obj) {
        Set<ConstraintViolation<T>> constraintViolations = validateWithResult(obj);
        if (!constraintViolations.isEmpty()) {
            throw new ConstraintViolationException(constraintViolations);
        }
    }

    public static <T> Set<ConstraintViolation<T>> validateWithResult(T obj) {
        Validator validator = buildClosableValidator();
        return validator.validate(obj);
    }

    private static Validator buildClosableValidator() {
        try (ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory()) {
            return validatorFactory.getValidator();
        }
    }
}
