package merryjane;

import java.util.*;

public class btreeforme {
	public static class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

	public static class binarytree {
		static int idx = -1;

		public static Node buildtree(int nodes[]) {
			idx++;
			if (nodes[idx] == -1) {
				return null;
			}
			Node newnode = new Node(nodes[idx]);
			newnode.left = buildtree(nodes);
			newnode.right = buildtree(nodes);
			return newnode;
		}
	}

	public static void preorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}
	public static void inorder(Node root) {
		if(root==null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	public static void postorder(Node root) {
		if(root==null) {
			return;
		}
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
	}
	public static int heightoftree(Node root) {
		if(root==null) {
			return 0;
		}
		int lh=heightoftree(root.left);
		int rh =heightoftree(root.right);
		int height= Math.max(lh,rh)+1;
		return height;
	}
	public static int countnodes(Node root) {
		if(root==null) {
			return 0;
		}
		int lc=countnodes(root.left);
		int rc=countnodes(root.right);
		return rc+lc+1;
		 
	}
	public static int sumofnode(Node root) {
		if(root==null) {
			return 0;
		}
		int rsum=sumofnode(root.right);
		int lsum=sumofnode(root.left);
		int sum=rsum+lsum+root.data;
		
		return sum;
	}
	public static int diameter(Node root){
		if(root==null) {
			return 0;
		}
		//right and left diameter
		int ld=diameter(root.left);
		int rd=diameter(root.right);
		//self
		int lh=heightoftree(root.left);
		int rh=heightoftree(root.right);
		int self=lh+rh+1;
		return Math.max(rh,Math.max(lh, self));
	}
	static class info{
		int diam;
		int ht;
		public info(int diam ,int ht) {
			this.diam=diam;
			this.ht=ht;
		}
	}
	public static info diameter2(Node root) {
		if(root==null) {
			return new info(0,0);
		}
	info rightinfo=diameter2(root.right);
	info leftinfo=diameter2(root.left);
		int diam = Math.max(Math.max(rightinfo.diam,  leftinfo.diam),rightinfo.diam+leftinfo.diam+1);
		int ht=Math.max(leftinfo.ht,rightinfo.ht);
		return new info(diam,ht);
	}
	public static void main(String[] args) {
		int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
		binarytree tree = new binarytree();
		Node root = tree.buildtree(nodes);
		System.out.println(root.data);
		preorder(root);
		System.out.println();
		inorder(root);
		System.out.println();
		postorder(root);
		System.out.println();
		System.out.println(countnodes(root));
		System.out.println( sumofnode(root));
		System.out.println(diameter(root));
		System.out.println(diameter2(root).diam);
	}

}
