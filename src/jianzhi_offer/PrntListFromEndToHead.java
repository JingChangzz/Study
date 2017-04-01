package jianzhi_offer;

import java.util.ArrayList;

/**
 * Created by ZhangJing on 2017/3/14.
 *
 * 从尾到头打印链表
 * 1.压栈
 * 2.递归
 *
 */
public class PrntListFromEndToHead {
    ArrayList<Integer> result = new ArrayList<>();
    int i = 0;
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode != null){
            if (listNode.next != null){

                printListFromTailToHead(listNode.next);
            }

            result.add(i++, listNode.val);
        }

        return result;
    }

    public static void main(String[] args) {
        ListNode ln = new ListNode(123);
        ln.next = new ListNode(456);

        PrntListFromEndToHead plfeth = new PrntListFromEndToHead();
        plfeth.printListFromTailToHead(ln);

        for (int i = 0; i < plfeth.result.size(); i++){
            System.out.println(plfeth.result.get(i));
        }
    }
}


class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}