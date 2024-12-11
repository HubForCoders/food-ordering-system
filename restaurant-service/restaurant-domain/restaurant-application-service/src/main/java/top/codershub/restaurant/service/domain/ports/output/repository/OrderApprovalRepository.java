package top.codershub.restaurant.service.domain.ports.output.repository;

import org.springframework.stereotype.Repository;
import top.codershub.restaurant.service.domain.entity.OrderApproval;

@Repository
public interface OrderApprovalRepository {
    OrderApproval save(OrderApproval orderApproval);
}
