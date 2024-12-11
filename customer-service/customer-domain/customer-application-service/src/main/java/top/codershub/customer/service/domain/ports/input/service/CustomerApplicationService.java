package top.codershub.customer.service.domain.ports.input.service;

import top.codershub.customer.service.domain.create.CreateCustomerCommand;
import top.codershub.customer.service.domain.create.CreateCustomerResponse;

import javax.validation.Valid;

public interface CustomerApplicationService {

    CreateCustomerResponse createCustomer(@Valid CreateCustomerCommand createCustomerCommand);

}
