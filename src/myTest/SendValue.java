package myTest;

import static java.nio.charset.Charset.defaultCharset;

public class SendValue {
    public static void main(String[] args) {

        String s = "学 Java";

        try{
            System.out.println(defaultCharset().name() +": "+ s.getBytes().length);

            System.out.println("GBK: " + new String(s.getBytes("UTF-8"), "GBK").getBytes().length);

            System.out.println("Unicode: " + new String(s.getBytes("UTF-8"), "Unicode").getBytes().length);

        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
