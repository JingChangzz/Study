package designpattern.structure.decoration;

/**
 * Created by ZhangJing on 2017/3/9.
 */
public class Client {

    public static void main(String[] args) {

        Component component, componentScrollBar, componentBlackBorder;

        component = new Window();
        componentScrollBar = new ScrollBarDecorator(component);
        componentBlackBorder = new BlackBorderDecorator(componentScrollBar);
        componentBlackBorder.display();

    }

}
