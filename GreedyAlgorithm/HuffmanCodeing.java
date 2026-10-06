import java.util.*;

class Node {
    char ch;
    int freq;
    Node left;
    Node right;

    Node(char ch, int freq) {
        this.ch = ch;
        this.freq = freq;
    }

    Node(int freq, Node left, Node right) {
        this.freq = freq;
        this.left = left;
        this.right = right;
    }
}

public class HuffmanCodeing{


    public static void printCodes(Node root, String code){
        if(root==null){
            return;
        }

        if(root.left==null && root.right==null){
            System.out.println(root.ch+" : "+code);
            return;
        }
        printCodes(root.left,code+"0");
        printCodes(root.right,code+"1");
    }


    public static void main(String[] args){
          char[] chars = {'A', 'B', 'C', 'D', 'E', 'F'};
        int[] freq = {5, 9, 12, 13, 16, 45};

        PrirorityQueue<Node> pq=new PrirorityQueue<>((a,b)->a.freq - b.freq);

        for(int i=0;i<chars.length;i++){
            pq.add(new Node(chars[i], freq[i]));
        }

        while(pq.size()>1){
            Node left=pq.poll;
            Node right=pq.poll;

            Node newNode=new Node(left.freq+right.freq, left, right);

            pq.add(newNode);
        }

        Node root=pq.poll();
        printCodes(root,"");
    }
}