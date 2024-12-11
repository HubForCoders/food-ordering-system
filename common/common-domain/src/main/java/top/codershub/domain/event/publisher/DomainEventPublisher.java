package top.codershub.domain.event.publisher;

import top.codershub.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent> {

    void publish(T domainEvent);
}
