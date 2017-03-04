package myTest;

class Two{
    Byte x;
}
public class Pass{
    public static void main(String[] args){
        Pass p=new Pass();
        p.start();
    }
    void start(){
    	Two t=new Two();
        System.out.print(t.x+" ");
        Two t2=fix(t);
        System.out.print(t.x+"	" +t2.x);
    }
    Two fix(Two tt){
        tt.x=42;
        return tt;
    }
}