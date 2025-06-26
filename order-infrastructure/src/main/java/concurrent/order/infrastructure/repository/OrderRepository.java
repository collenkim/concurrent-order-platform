package concurrent.order.infrastructure.repository;

import concurrent.order.infrastructure.domain.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

}
