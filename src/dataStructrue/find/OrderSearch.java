package dataStructrue.find;

/**
 * Created by ZhangJing on 2017/5/6.
 */
public class OrderSearch {

    /**
     * 顺序查找
     * @param table
     * @param keyWord
     * @return
     */
    public static boolean orderSearch(int[] table,int keyWord){
        for(int i = 0;i<table.length;i++){
            if(table[i] == keyWord){
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] table = {1,23,4,5,6};
        System.out.println(OrderSearch.orderSearch(table, 5));

    }

}
