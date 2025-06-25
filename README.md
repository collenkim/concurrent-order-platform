# 프로그램 개요
본 프로젝트는 특정 프로모션이나 한정 수량 이벤트 등으로 인해 짧은 시간 안에 대량의 구매 요청이 몰리는 쇼핑몰 서비스에서, 주문 중복, 재고 초과 판매, 트랜잭션 충돌 등의 문제가 발생하는 상황을 해결하고자 시작되었습니다.

실시간으로 수천 건의 동시 요청을 안정적으로 처리하기 위해, Redis 기반의 분산 락과 비동기 큐 처리 구조를 도입하고, 재고 감소 및 주문 생성 로직에 대해 원자성을 보장하는 구조를 설계했습니다.

또한 트래픽 급증 상황에서도 응답 지연 없이 시스템이 정상적으로 동작할 수 있도록, 캐시 전략, Rate Limiter, 비동기 메시지 처리 등을 조합하여 구매 서비스 전반의 안정성과 성능을 개선했습니다.

이를 통해 피크 시간대에도 오류율을 크게 낮추고, 사용자 경험을 저해하지 않으면서 시스템을 안정적으로 운영할 수 있는 구조를 완성했습니다.

# 주제 선정 이유


# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/3.3.13/gradle-plugin)
* [Create an OCI image](https://docs.spring.io/spring-boot/3.3.13/gradle-plugin/packaging-oci-image.html)

### Additional Links

These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

## 코드 컨벤션
자세한 내용은 [CONVENTION.md](./CONVENTION.md)를 참고하세요.