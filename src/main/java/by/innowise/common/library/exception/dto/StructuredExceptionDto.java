package by.innowise.common.library.exception.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"field", "message"})
public record StructuredExceptionDto(
        String field,
        String message
) {
}
