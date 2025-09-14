package by.innowise.common.library.dto;

import java.time.LocalDate;

public record UserProfileDto(

        Long authId,
        String name,
        String surname,
        LocalDate birthDate,
        String email
) {
}
