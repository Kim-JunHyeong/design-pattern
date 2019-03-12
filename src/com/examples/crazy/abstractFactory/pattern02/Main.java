package com.examples.crazy.abstractFactory.pattern02;

import com.examples.crazy.abstractFactory.pattern02.abst.Button;
import com.examples.crazy.abstractFactory.pattern02.abst.GuiFactory;
import com.examples.crazy.abstractFactory.pattern02.abst.TextArea;
import com.examples.crazy.abstractFactory.pattern02.comcreate.FactoryInstance;

public class Main {

    public static void main(String[] args) {
//        GuiFactory factory = new LinuxGuiFac();
//        GuiFactory factory = new MaxGuiFac();
        GuiFactory factory = FactoryInstance.getGuiFactory();

        Button button = factory.createButton();
        TextArea textArea = factory.createTextArea();

        button.click();
        System.out.println(textArea.getText());

        System.out.println(System.getProperty("os.name"));
    }
}
