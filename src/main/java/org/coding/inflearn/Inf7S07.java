package org.coding.inflearn;

import java.util.LinkedList;
import java.util.Queue;

class BfsNode{
    int data;
    BfsNode lt, rt;
    public BfsNode(int val){
        data = val;
        lt = rt = null;
    }
}

public class Inf7S07 {
    BfsNode root;
    public void BFS(BfsNode bfsNode) {
        Queue<BfsNode> q = new LinkedList<>();
        q.offer(root);
        int L = 0;
        while (!q.isEmpty()){
            int len = q.size();
            System.out.println("L = " + L);
            for (int i = 0; i < len; i++){
                BfsNode cur = q.poll();
                System.out.print("cur = " + cur.data + " ");
                if (cur.lt != null) {
                    q.offer(cur.lt);
                }

                if (cur.rt != null){
                    q.offer(cur.rt);
                }
            }
            L++;
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Inf7S07 tree = new Inf7S07();
        tree.root = new BfsNode(1);
        tree.root.lt = new BfsNode(2);
        tree.root.rt = new BfsNode(3);
        tree.root.lt.lt = new BfsNode(4);
        tree.root.lt.rt = new BfsNode(5);
        tree.root.rt.lt = new BfsNode(6);
        tree.root.rt.rt = new BfsNode(7);
        tree.BFS(tree.root);
    }

}
