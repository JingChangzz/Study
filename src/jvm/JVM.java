package jvm;
public class JVM {
    public static void main(String[] args) {    
        objPoolTest();
    }

    public static void objPoolTest() {
        int i1 = 40;//或者Integer
        int i2 = 40;
        Integer i3 = 0;
        Integer i4 = new Integer(40);
        Integer i5 = new Integer(40);
        Integer i6 = new Integer(0);
        
        System.out.println("i1=i2\t" + (i1 == i2));
        System.out.println("i1=i2+i3\t" + (i1 == i2 + i3));
        System.out.println("i4=i5\t" + (i4 == i5));
        System.out.println("i4=i5+i6\t" + (i4 == i5 + i6));    
        System.out.println("i1=i4\t" + (i1 == i4));
        
        System.out.println();        
    }
}