package by.innowise.common.library.exception;

import org.springframework.http.HttpStatus;

public class UniqueConstraintViolationException extends ApplicationException {

    public UniqueConstraintViolationException(String message, HttpStatus httpStatus) {
        super(message, httpStatus);
    }
}
