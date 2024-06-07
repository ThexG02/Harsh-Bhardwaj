package merryjane;
import java.util.*;

import merryjane.btreeforme.Node;

public class binarysumtreee {
public static class Node{
    int data;
    Node Right;
    Node Left;
   public  Node(int data){
        this.data=data;
        this.Right=null;
        this.Left=null;
    }
}
public static Node sumtree(Node root)
{
    if(root==null){
        return root;
    }
    Node Rsum=sumtree(root.Right);
    Node Lsum =sumtree(root.Left);
    root.data=Rsum.data+Lsum.data;
    System.out.print(root.data);
    return root;
}


	public static void main(String[] args) {
	
		Node root = new Node(1);
		root.Left= new Node(2);
		root.Right= new Node(3);
		root.Left.Left= new Node(4);
		root.Left.Right= new Node(5);
		root.Right.Left= new Node(6);
		root.Right.Left= new Node(7);

		sumtree(root);
	}

}

