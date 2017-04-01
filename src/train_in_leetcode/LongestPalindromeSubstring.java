package train_in_leetcode;

/**
 * Created by ZhangJing on 2017/4/1.
 */
public class LongestPalindromeSubstring {
    public static int length;


    public static String LongestPalindrome(String s)
    {
        int begin =0;
        int maxLenOfPalindrome = 1;//至少回文长度为1

        boolean[][] flag = new boolean[length][length];


        /**
         * 第一层循环
         * i，子串的尾下标
         * 第二层循环
         * j，从0开始循环，一直到i-1，判断 j--i 子串是不是回文，满足：
         * s[j] 是否==s[i]
         * 并且 j+1 --  i-1 也是回文
         *
         */
        for (int i = 0; i < length; i++){
            flag[i][i] = true;  //位置为i，单个字符，一定回文

            for (int j = 0; j < i; j++){
                flag[j][i] = (s.charAt(j) == s.charAt(i) && (i - j < 2 || flag[j+1][i-1]));
                if (flag[j][i] && maxLenOfPalindrome < (i-j+1)){
                    maxLenOfPalindrome = i-j+1;
                    begin = j;
                }
            }
        }

        return s.substring(begin, maxLenOfPalindrome+begin);
    }

    public static void main(String[] args) {
        String input = "adereda";

        length = input.length();
        System.out.println(LongestPalindrome(input));
    }

}
