package top.codershub.payment.service.domain;

import top.codershub.payment.service.domain.entity.CreditEntry;
import top.codershub.payment.service.domain.entity.CreditHistory;
import top.codershub.payment.service.domain.entity.Payment;
import top.codershub.payment.service.domain.event.PaymentEvent;

import java.util.List;

public interface PaymentDomainService {

    PaymentEvent validateAndInitiatePayment(Payment payment,
                                            CreditEntry creditEntry,
                                            List<CreditHistory> creditHistories,
                                            List<String> failureMessages);

    PaymentEvent validateAndCancelPayment(Payment payment,
                                          CreditEntry creditEntry,
                                          List<CreditHistory> creditHistories,
                                          List<String> failureMessages);
}
