package com.examples.crazy.factoryMethod.framework;

public abstract class ItemCreator {

    // 팩토리 메소드 -> 템플릿 메소드 패턴 사용
    public Item create() {

        Item item;
        // 아이템을 생성하는 단계
        // step 1. 데이터베이스에서 아이템 정보를 호출
        requestItemsInfo();
        // step 2 . 그것을 바탕으로 아이템을 생성
        item = createItem();
        // step 3. 생성이 완료되면 아이템 생성 정보를 남긴다.
        createItemLog();

        return item;
    }

    // 아이템을 생성하기 전에 데이터베이스에서 아이템 정보를 요청
    abstract protected void requestItemsInfo();

    // 아이템을 생성 후 아이템 복제 등의 불법을 방지하기 위해 데이터베이스에 아이템 생성 정보를 남깁니다.
    abstract protected void createItemLog();

    // 아이템을 생성하는 알고리즘
    abstract protected Item createItem();
}
