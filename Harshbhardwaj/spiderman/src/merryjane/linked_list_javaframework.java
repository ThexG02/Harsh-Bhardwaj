package merryjane;

import java.util.*;

import merryjane.linked_list.Node;


public class linked_list_javaframework {
    public static void rev(LinkedList<Integer> ll) {
    	Node prev=null;
    	Node curr=head=tail;
    	Node next;
    	while(curr!=null) {
    		next=curr.next;
    		curr.next=prev;
    		prev=curr;
    		curr=next;
    	}
    	head=prev;
    }
  public static Node head;
  public static Node tail;
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		ll.addFirst(5);
		ll.addFirst(4);

		ll.addFirst(3);

		ll.addFirst(2);

		ll.addFirst(1);

		ll.addLast(6);
		ll.addFirst(0);
		//System.out.println(ll);
		ll.add(2,69);
		System.out.println(ll);
	rev(ll);
	System.out.println(ll);
	}

}
