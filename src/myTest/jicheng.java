package myTest;

/**
 * Created by ZhangJing on 2017/5/6.
 */
public class jicheng {

    private String name = "hello";

    public jicheng() {
//		System.out.println(this);
//		关键是要认识到调用callName方法的是sub类型的对象
        callName();
    }

    public void callName() {
        System.out.println("father_callname");
    }

    public static void main(String[] args) {
        new Sub();
    }
}

    class Sub extends jicheng{
        private String name="world";
        public void callName(){
            System.out.println("sub_callname");
        }
    }

