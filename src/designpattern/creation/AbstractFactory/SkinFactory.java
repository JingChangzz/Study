package designpattern.creation.AbstractFactory;

/**
 * Created by ZhangJing on 2017/3/9.
 */
public interface SkinFactory {

    public Button createButton();
    public TextField createTextField();
    public ComboBox createComboBox();
}
