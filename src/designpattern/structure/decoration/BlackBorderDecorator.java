package designpattern.structure.decoration;

/**
 * Created by ZhangJing on 2017/3/9.
 */
public class BlackBorderDecorator extends ComponentDecorator {

    public BlackBorderDecorator(Component component){

        super(component);
    }

    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }

    public void setBlackBorder(){
        System.out.println("为构件添加BlackBorder");
    }
}
