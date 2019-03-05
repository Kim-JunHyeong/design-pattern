# 템플릿 메소드 패턴(Template Method Pattern)
- 공통적인 프로세스를 묶어주기

### 학습 목표
- 일정한 프로세스를 가진 요구사항을 템플릿 메소드 패턴을 이용하여 구현할 수 있다.

### 사전적 의미
- 모양자(기호를 그리기 쉽도록 기호의 표준 모양을 파 놓은 자)

### Template Method Pattern
- 어떤 패턴인가?
    - 알고리즘의 **구조를 메소드에 정의**하고
    - 하위 클래스에서 알고리즘 구조의 변경없이 알고리즘을 **재정의**하는 패턴
- 어떨때 사용하는가?
    - 구현하려는 알고리즘이 **일정한 프로세스**가 있다.
    - 구현하려는 알고리즘이 **변경 가능성**이 있다.
- 어떤 단계로 이루어지는가?
    - 알고리즘을 **여러 단계**로 나눈다.
    - 나눠진 알고리즘의 단계를 **메소드로 선언**한다.
    - 알고리즘을 수행할 **템플릿 메소드**를 만든다.
    - 하위 클래스에서 **나눠진 메소드들을 구현**한다. 
    
### 요구 사항
- 신작 게임의 접속을 구현해주세요.
    - requestConnection(String str) : String
- 유저가 게임 접속 시 다음을 고려해야합니다.
    - 보안 과정 : 보안 관련 부분을 처리합니다.
        - doSecurity(String string) : String
    - 인증 과정 : user name 과 password 가 일치하는지 확인합니다.
        - authentication(String id, String password) : boolean
    - 권한 과정 : 접속자가 유료 회원인지 무료 회원인지 게임 마스터인지 확인합니다.
        - authorization(String userName) : int
    - 접속 과정 : 접속자에게 커넥션 정보를 넘겨줍니다.
        - connection(String info) : String 점
        
- 단계 별 요구사항 매칭
    - 접속 : 알고리즘
    - 단계 : 보안, 인증, 권한, 접속
    - 메소드로 선언 : doSecurity(String string), authentication(String id, String password) ...
    - 템플릿 메소드를 만든다 : requestConnection(String str)
    
### 더 공부해봅시다.
- 보안 부분이 정부 정책에 의해서 강화 되었습니다. 강화된 방식으로 코드를 변경해 봅시다.
- 여가부에서 밤 10시 이후에는 셧다운제 운영

### 장
- 효과적인 유지보수가 가능해짐