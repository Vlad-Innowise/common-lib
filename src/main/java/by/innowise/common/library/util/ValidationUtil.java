package by.innowise.common.library.util;

import by.innowise.common.library.exception.UpdateDtoVersionOutdatedException;
import lombok.experimental.UtilityClass;
import org.springframework.http.HttpStatus;

import java.util.Objects;

@UtilityClass
public class ValidationUtil {

    public <V, E extends Versionable> void checkIfDtoVersionIsOutdated(V entityVersion, E dto) {
        if (!Objects.equals(entityVersion, dto.getVersion())) {
            throw new UpdateDtoVersionOutdatedException(String.format("The provided dto version is outdated [%s]", dto),
                                                        HttpStatus.CONFLICT);
        }
    }

}
