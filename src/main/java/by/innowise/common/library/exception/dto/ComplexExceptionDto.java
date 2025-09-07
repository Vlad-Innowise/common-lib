package by.innowise.common.library.exception.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonPropertyOrder({"code", "errors"})
public record ComplexExceptionDto(

        Integer code,

        List<StructuredExceptionDto> errors
) {
}
