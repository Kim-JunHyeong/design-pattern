# Decorator Pattern
- 동적으로 책임 추가

### 학습 목표
- 동적으로 책임 추가가 필요할 때 데코레이터 패턴을 사용할 수 있다.

### 키워드
- 동적, 책임 추가

### 기본 설계
image

### Component
- 실질적인 인스턴스를 컨트롤하는 역할

### ConcreteComponent
- Component의 실질적인 인스턴스 부분이며, 책임의 주체 역할

### Decorator
- Component와 ConcreteDecorator를 동일시 하도록 해주는 역할

### ConcreteDecorator
- 실질적인 장식 인스턴스 및 정의이며 추가된 책임의 주체 부분