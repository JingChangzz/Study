package pinduoduo;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by ZhangJing on 2017/8/27.
 */
public class Main2 {

    private static void isMatch(String input) {
        Stack<Character> ans = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char n = input.charAt(i);
            if ( n == '{' ) {
                ans.add(n);
                continue;
            }
            if ( n == '[' ) {
                ans.add(n);
                continue;
            }
            if ( n == '(' ) {
                ans.add(n);
                continue;
            }
            if ( n == '}' ) {
                ans.pop();
                continue;
            }
            if ( n == ']' ) {
                ans.pop();
                continue;
            }
            if ( n == ')' ) {
                ans.pop();
                continue;
            }

        }

        if (ans.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        isMatch(input);
    }
}
