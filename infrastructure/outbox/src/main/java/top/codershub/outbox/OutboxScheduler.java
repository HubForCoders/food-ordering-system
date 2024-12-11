package top.codershub.outbox;

public interface OutboxScheduler {
    void processOutboxMessage();
}
