package HuaWeiJiShi;

import java.util.*;

/**
 * Created by ZhangJing on 2017/5/4.
 */
public class SortSuiJiShu {
    /**
     * @param set
     * @param operation 操作符：>表示升序，<表示降序
     */
    public static Set<Object> sortList(Set set ,String operation) {

        List<Object> list= new ArrayList<Object>(set);
        for (int i = 0; i < set.size(); i++) {
            for (int j = 0; j < set.size()-i-1; j++) {
                int a = Integer.parseInt(list.get(j).toString());
                int b = Integer.parseInt(list.get(j+1).toString());
                if(">".equals(operation)){
                    if(a>b){
                        list.set(j, b);
                        list.set(j+1, a);
                    }
                }else{
                    if(a<b){
                        list.set(j, b);
                        list.set(j+1, a);
                    }
                }
            }
        }
        set = new LinkedHashSet<Object>(list);//这里注意使用LinkedHashSet
        return set;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num == 0){
            System.out.println();
            return;
        }

        Set<Object> set = new HashSet<>();

        for (int i = 0; i < num; i++) {
            set.add(scanner.nextInt());
        }
        set = sortList(set,">");

//        for (Object s: set){
//            System.out.println(s);
//        }

        Iterator i = set.iterator();//先迭代出来

        while(i.hasNext()){//遍历
            System.out.println(i.next());
        }

    }

}
