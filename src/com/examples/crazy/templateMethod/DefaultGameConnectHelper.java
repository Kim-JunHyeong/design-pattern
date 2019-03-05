package com.examples.crazy.templateMethod;

public class DefaultGameConnectHelper extends AbstGameConnectHelper {

    @Override
    protected String doSecurity(String string) {
//        System.out.println("디코드");
        // 변경 후
        System.out.println("강화된 알고리즘을 이용한 디코드");
        return string;
    }

    @Override
    protected boolean authentication(String id, String password) {
        System.out.println("DB 에서 ID/PW 확인 과정");
        return true;    // 무조건 성공한 것으로!
    }

    @Override
    protected int authorization(String userName) {
        System.out.println("권한 확인");
        // 서버에서 유저 이름, 유저의 나이를 알 수 있다.
        // 따라서 나이를 확인하고 성인이 아니고 10시가 지났다면 권한이 없는 것으로 한다.
        return 0;   // 일단 마스터
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속 단계!");
        return info;
    }

    @Override
    public String requestConnection(String encodedInfo) {
        return super.requestConnection(encodedInfo);
    }
}
