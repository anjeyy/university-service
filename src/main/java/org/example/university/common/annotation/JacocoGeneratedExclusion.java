package org.example.university.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Using this annotation will force Jacoco to skip the evaluation of the testing coverage.
 *
 * @see <a
 *     href="https://www.baeldung.com/jacoco-report-exclude#excluding-with-custom-annotation">baeldung</a>
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface JacocoGeneratedExclusion {}
