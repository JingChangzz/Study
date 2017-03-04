package train_in_leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ZhangJing on 2017/2/27.
 */
public class StringInDic {

    public static boolean wordBreak(String s, Set<String> dict) {

        if(s.length() < 1){
            return  false;
        }else if (dict.contains(s)){
            return true;
        }
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i =1; i <= s.length(); i++){

            for (int j = 0; j < i; j++) {
                if (dp[j] && dict.contains(s.substring(j, i))) {
                    dp[i] = true;
                }
            }

        }
        return dp[s.length()];
    }


    public static  void main(String[] args){
        Set<String> dict = new HashSet<>();
        dict.add("leet");
        dict.add("code");
        dict.add("hello");
        dict.add("a");
        dict.add("b");
        System.out.println(wordBreak("aba", dict));
    }

}
