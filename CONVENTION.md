# ✅ 코드 컨벤션 (Code Convention)

## 1. 패키지명
- 모두 소문자 사용
- 기능 단위 또는 계층별로 구분
- common 패키지 사용 금지 (의미가 모호하기 때문)
- 예시:
    - `order.api.controller`
    - `order.api.service`

## 2. 클래스명
- 파스칼 표기법 (UpperCamelCase)
- Controller, Service, Handler, Config, DTO 등 접미어 명확히 표기
- 예시:
    - `OrderController`
    - `InventoryService`
    - `KafkaConsumerConfig`
    - `CommonConstants`

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
  ```Java
  @Bean
  public orderRoutes(orderHandler: OrderHandler) = coRouter {
      POST("/orders", orderHandler::createOrder)
      GET("/orders/{id}", orderHandler::getOrder)
  }

## 7. 환경 변수
- application-{profile}.yml 파일 사용
- 환경별로 분리된 설정 관리
- 예시
  - profile:
      env: dev
  - order:
      api:
        url: ${ORDER_API_URL:http://localhost:8080}

8. 불리언 변수 & 메서드 명명 정책
- 변수/메서드 이름 중 boolean 형 인것은 명확하게 "조건"을 표현
- 포함 포르: is, has, can, should, was, will
- 부정 표현(예: isNot) 지양, 가능한 정의 포� + 부정문 현실 권장
- 예시
  - 변수: `isValidUserToken`, `hasAdminRole`, `canApprove`, `isActiveUser`
  - 메서드: `isUserLoggedIn()`, `hasPermission()`, `canReserve()`, `shouldApplyCoupon()`:

