package Ctrip;

import java.util.*;

/**
 * Created by zhang_jingc on 2017/8/11.
 *
 * 没有交集的直接加入
 *
 * 有交集的，直接求交集
 *
 */
public class CardGroup {

    static int[] flags;
    static boolean isfirst = true;

    public static List<List<Integer>> getAvailableCardGroup(List<List<Integer>> allCards) {
        List<List<Integer>> result = allCards, temp;

        do {
            temp = result;
            result = getAvailableCardIntersectio(result);
            temp.retainAll(result);

        } while (temp.size() != result.size());

        return result;
    }

    public static List<List<Integer>> getAvailableCardIntersectio(List<List<Integer>> allCards){
        if (allCards == null){
            return null;
        }

        flags = new int[allCards.size()];

        Set<List<Integer>> result=new HashSet<>();
        for (int i = 0; i < allCards.size(); i++){
            int count = 0; // 假如所有list都与其他list没有交集，说明，已经是最小集合
            if (!isHasIntersectio(allCards, i)){
                count++;
                flags[i] = 1;
                continue;
            }

            if (count == allCards.size()){
                return allCards;
            }

            for (int j = i+1; j < allCards.size(); j++){
                List<Integer> temp = new ArrayList<>(allCards.get(i));
                temp.retainAll(allCards.get(j)); //返回的是true，false。通过大小是否改变确定是否true
                if (temp.isEmpty()){ // 不需证件，或者没有交集(只能通过size判断)，下一轮比较
                    continue;
                }
                result.add(new ArrayList<>(temp));
            }
        }
        isfirst = false;
        for (int k = 0; k < flags.length; k++){
            if (flags[k] == 1) {
                List<Integer> temp = new ArrayList<>(allCards.get(k));
                result.add(temp);
            }
        }
        return new ArrayList<>(result);
    }

    /**
     * 判断List 是否与其他list有交集
     * @param allCards List<List<Integer>> 所有组合
     * @param position 第k个 List 是否与其他list 有交集
     * @return
     */
    public static boolean isHasIntersectio(List<List<Integer>> allCards, int position){
        for (int i = 0; i< allCards.size(); i++){
            List<Integer> temp = new ArrayList<>(allCards.get(position));
            if (i != position){
                temp.retainAll(allCards.get(i));
                if (!temp.isEmpty()) { //有交集
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        List<List<Integer>> cardList = new ArrayList<>();

        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(4);
        list1.add(3);
        list1.add(7);

        List<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(5);
        list2.add(6);

        List<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(5);

        List<Integer> list4 = new ArrayList<>();
        list4.add(6);
        list4.add(7);

        cardList.add(list1);
        cardList.add(list2);
        cardList.add(list3);
        cardList.add(list4);

        //flags = new int[cardList.size()];

        List<List<Integer>> result = getAvailableCardGroup(cardList);
//        for (int k = 0; k < flags.length; k++){
//            if (flags[k] == 1) {
//                List<Integer> temp = new ArrayList<>(cardList.get(k));
//                result.add(temp);
//            }
//        }

        for (int i =0 ; i< result.size(); i++) {
            Iterator<Integer> it = result.get(i).iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            System.out.println("##################");
            }
        }
    }

}
