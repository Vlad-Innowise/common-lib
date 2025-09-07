package by.innowise.common.library.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CustomEnumValidator.class)
public @interface EnumValidator {

    Class<? extends Enum<?>> enumClass();

    String message() default "The provided value [%s] should be one of the ENUM values %s";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
