package com.levi.statsapi.exception.details;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@SuperBuilder
public class ValidationExceptionDetails extends ExceptionDetails {

    private final String fields;
    private final String fieldsMessage;

}
