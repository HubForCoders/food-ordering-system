package top.codershub.restaurant.service.domain;

import top.codershub.restaurant.service.domain.entity.Restaurant;
import top.codershub.restaurant.service.domain.event.OrderApprovalEvent;

import java.util.List;

public interface RestaurantDomainService {

    OrderApprovalEvent validateOrder(Restaurant restaurant, List<String> failureMessages);
}
