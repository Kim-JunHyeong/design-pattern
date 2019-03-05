package com.examples.crazy.templateMethod;

public abstract class AbstGameConnectHelper {

    protected abstract String doSecurity(String string);

    protected abstract boolean authentication(String id, String password);

    protected abstract int authorization(String userName);

    protected abstract String connection(String info);
    // 알고리즘의 단계이기 때문에 외부에 노출이 되면 안된다.
    // 위의 4 단계는 requestConnection 이라는 함수 호출을 위해 만들어진 것이기 때문에 외부에 노출이 되면 안된다.
    // 하지만 private 선언은 하면 안됨, 하위 클래스에서 사용할 수 있어야 하기 때문
    // 따라서 protected 사용!

    // 템플릿 메소드
   public String requestConnection(String encodedInfo) {

       // 보안 과정 -> 암호화 된 문자열을 복호화
       String decodedInfo = doSecurity(encodedInfo);
       // 인증 과정 -> 반환된 것을 가지고 id, password 를 할당한다.
       String id = "aaa";
       String password = "bbb";
       if (!authentication(id, password)) {
           throw  new Error("아이디 또는 암호 불일치");
       }
       // 권한 과정
       String userName = "userName";
       int authorization = authorization(userName);
       // 접속 과정
       switch (authorization) {
           case -1: //
               throw new Error("shut down");
           case 0:  // 게임 매니저
               break;
           case 1:  // 유료 회원
               break;
           case 2:  // 무료 회원
               break;
           case 3:  // 권한 없음
               break;
           default: // 기타 사황
               break;
       }
       return connection(decodedInfo);
   }
}
