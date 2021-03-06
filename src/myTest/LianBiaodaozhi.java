package myTest;

/**
 * Created by ZhangJing on 2017/5/9.
 */
public class LianBiaodaozhi {

    /**
     * 递归，在反转当前节点之前先反转后续节点
     */
    public static ListNode reverse(ListNode head) {
        if (null == head || null == head.getNextNode()) {
            return head;
        }
        ListNode reversedHead = reverse(head.getNextNode());
        head.getNextNode().setNextNode(head);
        head.setNextNode(null);
        return reversedHead;
    }

    /**
     * 遍历，将当前节点的下一个节点缓存后更改当前节点指针
     *
     */
    public static ListNode reverse2(ListNode head) {
        if (null == head) {
            return head;
        }
        ListNode pre = head;
        ListNode cur = head.getNextNode();
        ListNode next;
        while (null != cur) {
            next = cur.getNextNode();
            cur.setNextNode(pre);
            pre = cur;
            cur = next;
        }
        //将原链表的头节点的下一个节点置为null，再将反转后的头节点赋给head
        head.setNextNode(null);
        head = pre;

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        ListNode tmp = null;
        ListNode cur = null;
        // 构造一个长度为10的链表，保存头节点对象head
        for (int i = 1; i < 10; i++) {
            tmp = new ListNode(i);
            if (1 == i) {
                head.setNextNode(tmp);
            } else {
                cur.setNextNode(tmp);
            }
            cur = tmp;
        }
        //打印反转前的链表
        ListNode h = head;
        while (null != h) {
            System.out.print(h.getRecord() + " ");
            h = h.getNextNode();
        }
        //调用反转方法
        head = reverse2(head);
        System.out.println("\n**************************");
        //打印反转后的结果
        while (null != head) {
            System.out.print(head.getRecord() + " ");
            head = head.getNextNode();
        }
    }

}


class ListNode{

    //变量
    private int record;
    //指向下一个对象
    private ListNode nextNode;

    public ListNode(int record) {
        super();
        this.record = record;
    }
    public int getRecord() {
        return record;
    }
    public void setRecord(int record) {
        this.record = record;
    }
    public ListNode getNextNode() {
        return nextNode;
    }
    public void setNextNode(ListNode nextNode) {
        this.nextNode = nextNode;
    }
}