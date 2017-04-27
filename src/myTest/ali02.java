package myTest;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by ZhangJing on 2017/4/26.
 */
public class ali02 {

    public static void solve(ArrayList<String> input, String[] path){
        if (path.length == 0 || input.size() < path.length)
            System.out.println("");
        for (int i = 0; i < path.length; i++) {
            if (input.contains(path[i])){
                continue;
            }else{
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        String[] pathes = path.split(">");
       // Pattern pattern = Pattern.compile("\\[^\\]");
        String log = scanner.nextLine();
        Pattern pattern = Pattern.compile("(?<=\\[)(.+?)(?=\\])");
        Matcher matcher = pattern.matcher(log);

        ArrayList<String> tag = new ArrayList<>();

        while(matcher.find()){
            String t = matcher.group(1);
            tag.add(t);
            System.out.println(t);
        }

        solve(tag, pathes);

    }
}
