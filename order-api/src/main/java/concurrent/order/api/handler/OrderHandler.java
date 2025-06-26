package concurrent.order.api.handler;

import concurrent.order.api.dto.OrderRequestDto;
import concurrent.order.api.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
@RequiredArgsConstructor
public class OrderHandler {

    private final OrderService orderService;

    public Mono<ServerResponse> getOrderById(ServerRequest request) {
        String orderId = request.pathVariable("orderId");
        return orderService.getOrderById(orderId)
            .flatMap(order -> ServerResponse.ok().bodyValue(order))
            .switchIfEmpty(ServerResponse.notFound().build());
    }

    public Mono<ServerResponse> createOrder(ServerRequest request) {
        Mono<OrderRequestDto> orderRequestMono = request.bodyToMono(OrderRequestDto.class);
        return orderRequestMono
            .flatMap(orderService::createOrder)
            .flatMap(orderResponse -> ServerResponse.ok().bodyValue(orderResponse));
    }

    public Mono<ServerResponse> deleteOrder(ServerRequest request) {
        String orderId = request.pathVariable("orderId");
        return orderService.deleteOrder(orderId)
            .flatMap(success -> success
                ? ServerResponse.noContent().build()
                : ServerResponse.notFound().build());
    }

}
