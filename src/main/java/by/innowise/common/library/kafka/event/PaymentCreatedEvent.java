package by.innowise.common.library.kafka.event;

import java.util.UUID;

public record PaymentCreatedEvent(

        Long userId,
        UUID orderId,
        PaymentEventStatus status
) {
}
