package Ctrip;

import java.util.*;

/**
 * Created by zhang_jingc on 2017/8/14.
 */
public class Card3 {

    static int[] flags;

    public static List<List<Integer>> getAvailableCardGroup(List<List<Integer>> allCards) {
        List<List<Integer>> result = new ArrayList<>(allCards), temp;
        HashMap<Integer, List<List<Integer>>> out = new HashMap<>();

        //找出了最小的交集组(再取交集就全为null的状态)。唯一的作为必选会直接加入
        result = getAvailableCardIntersectio(result);

        if (result.size() < 2){ // 只有一个交集，说明所有list都包含这个交集。直接返回
            return result;
        }

        int size = result.size();
        List<Integer> l;
        //对于交集组中的每一个交集，分别求出最优解
        //思路：先剔除包含当前交集的list，对于剩下的list，再重复整个过程。
        for (int k = 0; k < size; k++){
            List<List<Integer>> outValue = new ArrayList<>();
            outValue.add(result.get(k));
            temp = new ArrayList<>(allCards);
            //剔除包含已经选用证件 的 list
            for (int m = 0; m < temp.size();){
                l = new ArrayList<>(temp.get(m));
                l.retainAll(result.get(k));
                if (!l.isEmpty()){
                    temp.remove(m);
                    continue;
                }
                m++;
            }

            if (temp.size()==0 || temp.isEmpty()){  //剔除之后剩下0个list，说明所有list包含当前交集
                //outValue.add(result.get(k));
            }else if (temp.size() == 1){    //剩下1个list，直接把这个list加入到结果中
                outValue.add(temp.get(0));
            }else {                         // 剩下2个及以上，重复整个过程
                List<List<Integer>> a = getAvailableCardGroup(temp);
                for (int i = 0; i < a.size(); i++){
                    outValue.add(a.get(i));
                }
            }
            out.put(k,outValue);
        }
        // 最后hashmap中存的是每个交集的最优解。
        int resultIndex = 0;
        int cardNum = 0;
        int resultNum = 0;
        //排序，得到group最少、group中元素最多的结果
        for (int key = 0; key < out.size(); key++){
            int num = 0;
            List<List<Integer>> t = out.get(key);
            Iterator<List<Integer>> t1 = t.iterator();
            if (key ==0 || resultNum > t.size()){
                resultNum = t.size();
                resultIndex = key;
            }

            while(t1.hasNext()){
                num += t1.next().size();
            }
            if (resultNum == t.size()){
                if (num > cardNum){
                    resultIndex = key;
                    cardNum = num;
                }
            }

        }

        return out.get(resultIndex);
    }

    /**
     * 得到最终的交集组
     * @param allCards
     * @return
     */
    public static List<List<Integer>> getAvailableCardIntersectio(List<List<Integer>> allCards){
        if (allCards == null){
            return null;
        }

        flags = new int[allCards.size()];

        Set<List<Integer>> result=new HashSet<>();  // 用hashset能保证相同的交集不会重复加入
        for (int i = 0; i < allCards.size(); i++){
            int count = 0; // 假如每个list都与其他list没有交集，说明，已经是最小集合
            if (!isHasIntersectio(allCards, i)){
                count++;
                flags[i] = 1;
                continue;
            }

            //说明每个list都与其他list没有交集。输入即输出
            if (count == allCards.size()){
                return allCards;
            }

            for (int j = i+1; j < allCards.size(); j++){
                List<Integer> temp = new ArrayList<>(allCards.get(i));
                temp.retainAll(allCards.get(j)); //返回的是true，false。通过大小是否改变确定是否true
                if (temp.isEmpty()){ // 不需证件，或者没有交集(只能通过size判断)，下一轮比较
                    continue;
                }
                // 两两求出的交集在加入交集组前，会与已经加入的元素进行再次交集。这样就不会有任何元素上的重复
                // 主要是解决包含的问题：（1,2）、（2），只会保留后者
                List<Integer> tempt;
                Iterator<List<Integer>> it = result.iterator();
                List<Integer> current = null;
                boolean first = true;
                while (first || it.hasNext()){
                    tempt = new ArrayList<>(temp);
                    if (it.hasNext()){
                    current = it.next();
                    tempt.retainAll(current);}

                    if (tempt != null && tempt.size() != 0 && current != null){
                        if (current.size() > tempt.size()){
                            result.remove(current);
                            result.add(new ArrayList<>(tempt));
                        }
                        if (current.size() <= tempt.size()){
                            result.add(new ArrayList<>(tempt));
                        }
                        break;
                    }
                    if (tempt.size() == 0 || current == null){
                        result.add(new ArrayList<>(temp));
                        break;
                    }
                    first = false;
                }
            }
        }
        for (int k = 0; k < flags.length; k++){ //将唯一 的 list 加入 result
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
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();    //证件列表的个数
        List<List<Integer>> cardList = new ArrayList<>();
        scanner.nextLine();
        if (scanner.hasNextLine()){
            String in = null;
            for (int i = 0; i < row; i++){

                in = scanner.nextLine();
                String[] value = in.split(" ");
                List<Integer> list = new ArrayList<>();
                for (int j =0; j < value.length; j++){
                    list.add(Integer.parseInt(value[j]));
                }
                cardList.add(list);
            }
        }

        List<List<Integer>> result = getAvailableCardGroup(cardList);

        for (int i =0 ; i< result.size(); i++) {
            Iterator<Integer> it = result.get(i).iterator();
            while (it.hasNext()) {
                System.out.print(it.next() + "    ");
            }
            System.out.println("\n" + "##################");
        }
    }

}
