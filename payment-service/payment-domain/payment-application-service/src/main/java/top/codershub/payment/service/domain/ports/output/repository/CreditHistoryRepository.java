package top.codershub.payment.service.domain.ports.output.repository;

import top.codershub.domain.valueobject.CustomerId;
import top.codershub.payment.service.domain.entity.CreditHistory;

import java.util.List;
import java.util.Optional;

public interface CreditHistoryRepository {

    CreditHistory save(CreditHistory creditHistory);

    Optional<List<CreditHistory>> findByCustomerId(CustomerId customerId);
}
