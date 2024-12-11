package top.codershub.order.service.domain.ports.output.repository;

import top.codershub.domain.valueobject.OrderId;
import top.codershub.order.service.domain.entity.Order;
import top.codershub.order.service.domain.valueobject.TrackingId;

import java.util.Optional;

public interface OrderRepository {

    Order save(Order order);

    Optional<Order> findById(OrderId orderId);

    Optional<Order> findByTrackingId(TrackingId trackingId);
}
