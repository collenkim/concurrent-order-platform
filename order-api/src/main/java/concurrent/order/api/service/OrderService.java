package concurrent.order.api.service;

import concurrent.order.api.dto.OrderRequestDto;
import concurrent.order.api.dto.OrderResponseDto;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class OrderService {

    public Mono<OrderResponseDto> getOrderById(String orderId) {
        // TODO: 실제 DB 조회 로직
        // 임시 예제 데이터
        return Mono.just(new OrderResponseDto(orderId, "Sample Product", 2));
    }

    public Mono<OrderResponseDto> createOrder(OrderRequestDto request) {
        // TODO: 주문 생성 로직 (재고 체크, DB 저장 등)
        // 임시 예제
        OrderResponseDto response = new OrderResponseDto("generated-order-id", request.getProductName(), request.getQuantity());
        return Mono.just(response);
    }

    public Mono<Boolean> deleteOrder(String orderId) {
        // TODO: 주문 취소 로직
        return Mono.just(true);
    }

}
