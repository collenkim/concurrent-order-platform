# ✅ 코드 컨벤션 (Code Convention)

## 1. 패키지명
- 모두 소문자 사용
- 기능 단위 또는 계층별로 구분
- 예시:
    - `order.api.controller`
    - `com.example.inventory.service`

## 2. 클래스명
- 파스칼 표기법 (UpperCamelCase)
- Controller, Service, Handler, Config, DTO 등 접미어 명확히 표기
- 예시:
    - `OrderController`
    - `InventoryService`
    - `KafkaConsumerConfig`

## 3. 메서드명
- 카멜 표기법 (lowerCamelCase)
- 동사 + 목적어 중심으로 명확히 표현
- 예시:
    - `createOrder()`
    - `decreaseStock()`
    - `sendToKafka()`

## 4. 변수명
- 카멜 표기법 (lowerCamelCase)
- 축약 지양, 의미 있는 이름 사용
- 예시:
    - `orderRequestDto`, `remainingStock`, `kafkaTemplate`

## 5. 상수명
- 모두 대문자 + 언더스코어
- 예시:
    - `MAX_ORDER_QUANTITY`, `KAFKA_TOPIC_NAME`

## 6. 라우터 함수 (WebFlux)
- Router 함수는 `RouterConfig` 클래스 내 정의
- HTTP 메서드와 URI를 함수명에 포함
- 예시:
  ```kotlin
  @Bean
  fun orderRoutes(orderHandler: OrderHandler) = coRouter {
      POST("/orders", orderHandler::createOrder)
      GET("/orders/{id}", orderHandler::getOrder)
  }