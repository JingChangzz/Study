package jianzhi_offer;

/**
 * Created by ZhangJing on 2017/3/14.
 *
 * 替换所有的空格
 *
 * 因为在java中String已经有replaceAll方法，所以可以比较简单地实现
 *
 * 假若自己写实现过程，为了提高效率，应该从后往前开始替换
 * 1.统计空格数目
 * 2.从后往前，一个个替换空格
 * 时间复杂度O(n)   【O(2n) = O(n)】
 *
 */
public class ReplaceAllBlank {

    public static String replaceBlank(StringBuffer str){

       String result =  str.toString();

       result = result.replaceAll(" ", "%20");

        return result;
    }

    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("Hello world ");

        System.out.println(replaceBlank(s));
    }

}
