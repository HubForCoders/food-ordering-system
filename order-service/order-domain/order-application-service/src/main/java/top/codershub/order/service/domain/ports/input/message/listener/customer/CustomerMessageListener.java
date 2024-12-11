package top.codershub.order.service.domain.ports.input.message.listener.customer;

import top.codershub.order.service.domain.dto.message.CustomerModel;

public interface CustomerMessageListener {

    void customerCreated(CustomerModel customerModel);
}
