package concurrent.order.infrastructure.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@Table(name = "orders")
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class OrderEntity extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "order_id")
    private String orderId;

    @ManyToOne
    private ProductEntity product;

    @Column(name = "quantity")
    private int quantity;

    private OrderEntity(String orderId, ProductEntity product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }


}
