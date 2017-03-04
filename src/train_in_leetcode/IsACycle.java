package train_in_leetcode;

/**
 * Created by ZhangJing on 2017/2/28.
 *
 * Q：判断链表是不是环
 * slow每次走一步，fast每次走两步
 * 两个能相遇，就一定是环
 */
public class IsACycle {
    public static boolean detectCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }else{
            ListNode slow = head.next;
            ListNode fast = head.next;
            while(fast.next != null && fast.next.next != null ){
                fast = fast.next.next;
                slow = slow.next;

                if (slow == fast){
                    return true;
                }
            }
            return false;
        }

    }


    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = head;
        System.out.println(head);
        System.out.println(detectCycle(head));
    }
}

class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
        next = null;
    }

}



