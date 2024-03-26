package org.levi.apicdc.apicdc.newbook;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import org.hibernate.validator.constraints.ISBN;

import java.math.BigDecimal;

public record NewBookRequest(
        @NotBlank
        String title,
        @NotNull(message = "price shouldn't not be null")
        @Positive
        BigDecimal price,
        @ISBN(type = ISBN.Type.ISBN_13)
        String isbn
) {
}
