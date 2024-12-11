package top.codershub.payment.service.domain.ports.output.repository;

import top.codershub.domain.valueobject.CustomerId;
import top.codershub.payment.service.domain.entity.CreditEntry;

import java.util.Optional;

public interface CreditEntryRepository {

    CreditEntry save(CreditEntry creditEntry);

    Optional<CreditEntry> findByCustomerId(CustomerId customerId);
}
