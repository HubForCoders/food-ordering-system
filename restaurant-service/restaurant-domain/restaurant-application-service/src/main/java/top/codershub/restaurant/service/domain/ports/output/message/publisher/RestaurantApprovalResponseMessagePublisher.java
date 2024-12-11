package top.codershub.restaurant.service.domain.ports.output.message.publisher;

import org.springframework.stereotype.Repository;
import top.codershub.outbox.OutboxStatus;
import top.codershub.restaurant.service.domain.outbox.model.OrderOutboxMessage;

import java.util.function.BiConsumer;

@Repository
public interface RestaurantApprovalResponseMessagePublisher {

    void publish(OrderOutboxMessage orderOutboxMessage,
                 BiConsumer<OrderOutboxMessage, OutboxStatus> outboxCallback);
}
