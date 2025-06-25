package concurrent.order.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class RouterConfig {

    @Bean
    public RouterFunction<ServerResponse> orderRoutes(OrderHandler handler) {
        return RouterFunctions.route()
                .POST("/orders", handler::createOrder)
                .GET("/orders/{id}", handler::getOrder)
                .build();
    }

}
