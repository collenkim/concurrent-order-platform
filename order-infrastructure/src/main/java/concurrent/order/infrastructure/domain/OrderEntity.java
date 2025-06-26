package concurrent.order.infrastructure.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@NoArgsConstructor
public class OrderEntity {

    @Id
    private String id;

    private String productName;
    private int quantity;

    private OrderEntity(String id, String productName, int quantity) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
    }


}
