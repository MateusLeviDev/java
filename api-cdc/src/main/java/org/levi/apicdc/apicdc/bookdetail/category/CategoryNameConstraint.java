package org.levi.apicdc.apicdc.bookdetail.category;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = CategoryNameValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CategoryNameConstraint {
    String message() default "There is already category with this name";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
