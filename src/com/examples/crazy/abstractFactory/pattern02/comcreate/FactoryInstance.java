package com.examples.crazy.abstractFactory.pattern02.comcreate;

import com.examples.crazy.abstractFactory.pattern02.abst.Button;
import com.examples.crazy.abstractFactory.pattern02.abst.GuiFactory;
import com.examples.crazy.abstractFactory.pattern02.abst.TextArea;

public class FactoryInstance {

    public static GuiFactory getGuiFactory() {
        // 라이브러리의 변경없이 동일한 결과를 얻을 수 있도록 할 수 있다.
        // 추상 팩토리 패턴에서 얻을 수 있는 이점이다.
        switch (getOsCode()) {
            case 0:
                return new MaxGuiFac();
            case 1:
                return new LinuxGuiFac();
        }
        return null;
    }

    private static int getOsCode() {
        if (System.getProperty("os.name").equals("Mac OS X")) {
            return 0;
        } else {
            return 1;
        }
    }
}

class LinuxButton implements Button {

    @Override
    public void click() {
        System.out.println("Linux Button");
    }
}

class LinuxGuiFac implements GuiFactory {

    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new LinuxTextArea();
    }
}

class LinuxTextArea implements TextArea {

    @Override
    public String getText() {
        return "리눅스 텍스트에어리어";
    }
}

class MaxButton implements Button {

    @Override
    public void click() {
        System.out.println("Max button");
    }
}

class MaxGuiFac implements GuiFactory {

    @Override
    public Button createButton() {
        return new MaxButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MaxTextArea();
    }
}

class MaxTextArea implements TextArea {

    @Override
    public String getText() {
        return "Max 텍스트에어리어";
    }
}

