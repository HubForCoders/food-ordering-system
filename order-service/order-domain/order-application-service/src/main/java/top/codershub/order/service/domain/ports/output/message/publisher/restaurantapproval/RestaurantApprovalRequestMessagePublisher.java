package top.codershub.order.service.domain.ports.output.message.publisher.restaurantapproval;

import top.codershub.order.service.domain.outbox.model.approval.OrderApprovalOutboxMessage;
import top.codershub.outbox.OutboxStatus;

import java.util.function.BiConsumer;

public interface RestaurantApprovalRequestMessagePublisher {

    void publish(OrderApprovalOutboxMessage orderApprovalOutboxMessage,
                 BiConsumer<OrderApprovalOutboxMessage, OutboxStatus> outboxCallback);
}
