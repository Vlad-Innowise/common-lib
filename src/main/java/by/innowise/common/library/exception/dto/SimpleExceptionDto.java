package by.innowise.common.library.exception.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"code", "message"})
public record SimpleExceptionDto(
        Integer code,
        String message
) {
}
