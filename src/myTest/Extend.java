package myTest;

/**
 * Created by ZhangJing on 2017/3/8.
 */
public class Extend {

    public static void main(String[] args) {
        Z z = new Z();
    }

}

class x{
    Y y = new Y();
    public x(){
        System.out.println("X");
    }
}

class Y{
    public Y(){
        System.out.println("Y");
    }
}

class Z extends x{

    public Z(){
    System.out.println("Z");
    }
}