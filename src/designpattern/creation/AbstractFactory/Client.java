package designpattern.creation.AbstractFactory;

/**
 * Created by ZhangJing on 2017/3/9.
 */
public class Client {

    public static void main(String[] args) {
        SkinFactory skinFactory;
        Button button;
        TextField textField;
        ComboBox comboBox;

 //       skinFactory = (SkinFactory)XMLUtil.getBean();
        skinFactory = new SpringSkinFactory();
        button = skinFactory.createButton();
        textField = skinFactory.createTextField();
        comboBox = skinFactory.createComboBox();
        button.display();
        textField.display();
        comboBox.display();

    }

}
