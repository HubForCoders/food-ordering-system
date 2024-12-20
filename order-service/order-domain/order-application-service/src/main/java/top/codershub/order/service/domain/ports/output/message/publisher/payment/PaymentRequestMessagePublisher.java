package top.codershub.order.service.domain.ports.output.message.publisher.payment;

import top.codershub.order.service.domain.outbox.model.payment.OrderPaymentOutboxMessage;
import top.codershub.outbox.OutboxStatus;

import java.util.function.BiConsumer;

public interface PaymentRequestMessagePublisher {

    void publish(OrderPaymentOutboxMessage orderPaymentOutboxMessage,
                 BiConsumer<OrderPaymentOutboxMessage, OutboxStatus> outboxCallback);
}
