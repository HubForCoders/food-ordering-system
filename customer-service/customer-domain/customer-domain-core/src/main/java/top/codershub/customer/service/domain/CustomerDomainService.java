package top.codershub.customer.service.domain;

import top.codershub.customer.service.domain.entity.Customer;
import top.codershub.customer.service.domain.event.CustomerCreatedEvent;

public interface CustomerDomainService {

    CustomerCreatedEvent validateAndInitiateCustomer(Customer customer);

}
