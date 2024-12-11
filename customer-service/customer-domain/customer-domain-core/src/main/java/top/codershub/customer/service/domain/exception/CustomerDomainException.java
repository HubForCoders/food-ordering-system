package top.codershub.customer.service.domain.exception;

import top.codershub.domain.exception.DomainException;

public class CustomerDomainException extends DomainException {

    public CustomerDomainException(String message) {
        super(message);
    }
}
