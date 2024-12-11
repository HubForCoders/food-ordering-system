package top.codershub.payment.service.domain.ports.output.message.publisher;

import top.codershub.outbox.OutboxStatus;
import top.codershub.payment.service.domain.outbox.model.OrderOutboxMessage;

import java.util.function.BiConsumer;

public interface PaymentResponseMessagePublisher {
    void publish(OrderOutboxMessage orderOutboxMessage,
                 BiConsumer<OrderOutboxMessage, OutboxStatus> outboxCallback);
}
