package top.codershub.order.service.domain.valueobject;

import top.codershub.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {
    public OrderItemId(Long value) {
        super(value);
    }
}
