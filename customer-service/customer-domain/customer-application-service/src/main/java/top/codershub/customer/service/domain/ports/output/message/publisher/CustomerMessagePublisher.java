package top.codershub.customer.service.domain.ports.output.message.publisher;

import top.codershub.customer.service.domain.event.CustomerCreatedEvent;

public interface CustomerMessagePublisher {

    void publish(CustomerCreatedEvent customerCreatedEvent);

}