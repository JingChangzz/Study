package designpattern.structure.decoration;

/**
 * Created by ZhangJing on 2017/3/9.
 */
public class ComponentDecorator extends Component {
    private Component component;

    public ComponentDecorator(Component component){

        this.component = component;

    }

    @Override
    public void display() {
        component.display();
    }
}
