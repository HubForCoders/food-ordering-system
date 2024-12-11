package top.codershub.order.service.domain;

import top.codershub.order.service.domain.entity.Order;
import top.codershub.order.service.domain.entity.Restaurant;
import top.codershub.order.service.domain.event.OrderCancelledEvent;
import top.codershub.order.service.domain.event.OrderCreatedEvent;
import top.codershub.order.service.domain.event.OrderPaidEvent;

import java.util.List;

public interface OrderDomainService {

    OrderCreatedEvent validateAndInitiateOrder(Order order, Restaurant restaurant);

    OrderPaidEvent payOrder(Order order);

    void approveOrder(Order order);

    OrderCancelledEvent cancelOrderPayment(Order order, List<String> failureMessages);

    void cancelOrder(Order order, List<String> failureMessages);
}
