package myTest;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by on 2017/4/26.
 */
public class ali01 {

    private static void creatBinaryTree(int[] datas,List<Node> nodelist){
        //将数组变成node节点
        for(int nodeindex=0;nodeindex<datas.length;nodeindex++){
            Node node = new Node(datas[nodeindex]);
            nodelist.add(node);
        }
        //给所有父节点设定子节点
        for(int index=0;index<nodelist.size()/2-1;index++){
            //编号为n的节点他的左子节点编号为2*n 右子节点编号为2*n+1 但是因为list从0开始编号，所以还要+1
            //这里父节点有1（2,3）,2（4,5）,3（6,7）,4（8,9） 但是最后一个父节点有可能没有右子节点 需要单独处理
            nodelist.get(index).setLeft(nodelist.get(index*2+1));
            nodelist.get(index).setRight(nodelist.get(index*2+2));
        }
        //单独处理最后一个父节点  因为它有可能没有右子节点
        int index = nodelist.size()/2-1;
        nodelist.get(index).setLeft(nodelist.get(index*2+1)); //先设置左子节点
        if(nodelist.size() % 2 == 1){ //如果有奇数个节点，最后一个父节点才有右子节点
            nodelist.get(index).setRight(nodelist.get(index*2+2));
        }
    }

    public static void bfs(Node root){
        if(root == null) return;
        LinkedList<Node> queue = new LinkedList<>();
        queue.offer(root); //首先将根节点存入队列
        //当队列里有值时，每次取出队首的node打印，打印之后判断node是否有子节点，若有，则将子节点加入队列
        while(queue.size() > 0){
            Node node = queue.peek();
            queue.poll(); //取出队首元素并打印
            System.out.print(node.value+" ");
            if(node.left != null){ //如果有左子节点，则将其存入队列
                queue.offer(node.left);
            }
            if(node.right != null){ //如果有右子节点，则将其存入队列
                queue.offer(node.right);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] in = input.split(",");
        int[] inputs = new int[in.length];

        for (int i = 0; i < in.length; i++) {
            if (in[i].equals("^")){
                inputs[i] = 0;
            }else
                inputs[i] = Integer.getInteger(in[i]).intValue();
        }

        if(inputs.length < 2){
            System.out.println(inputs[0]);
        }else {

            List<Node> nodelist = new LinkedList<>();
            creatBinaryTree(inputs, nodelist);
            Node root = nodelist.get(0);
            bfs(root);
        }

    }
}

class Node{
    int value;
    Node left;
    Node right;
    public Node(int var){
        this.value = var;
        this.left = null;
        this.right = null;
    }
    public void setLeft(Node left) {
        this.left = left;
    }
    public void setRight(Node right) {
        this.right = right;
    }
    public int getVar() {
        return value;
    }
    public void setVar(int var) {
        this.value = var;
    }
    public Node getLeft() {
        return left;
    }
    public Node getRight() {
        return right;
    }

}