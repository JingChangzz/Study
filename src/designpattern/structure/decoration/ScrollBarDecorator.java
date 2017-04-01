package designpattern.structure.decoration;

/**
 * Created by ZhangJing on 2017/3/9.
 */
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component){

        super(component);
    }

    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }

    public void setScrollBar(){
        System.out.println("为构件添加ScrollBar");
    }
}
