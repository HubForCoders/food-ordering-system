package top.codershub.customer.service.domain.ports.output.repository;

import top.codershub.customer.service.domain.entity.Customer;

public interface CustomerRepository {

    Customer createCustomer(Customer customer);
}
