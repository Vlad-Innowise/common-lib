package by.innowise.common.library.kafka.event;

import java.math.BigDecimal;
import java.util.UUID;

public record OrderCreatedEvent(

        Long userId,
        UUID orderId,
        BigDecimal amount
) {
}
