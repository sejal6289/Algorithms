package LinkedListExample;

import java.util.HashSet;

public class LinkedList {
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public void printList() {
		Node n = head;
		while(n != null) {
			System.out.print(n.data + " ");
			n=n.next;
		}
	}
	
	//inserts at front of the list
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	//delete a node
	public Node pop(int d) {
		
		if(head == null) {
			return null;
		}
		Node n = head;
		if(n.data == d) {
			head = head.next;
			return head;
		}
		
		while(n.next !=null) {
			if(n.next.data == d) {
				n.next = n.next.next;
				return head;
				
			}
			n = n.next;
		}
		return head;
		
	}
	
	public void linkedList_count(Node head) {
		Node current = head;
		int count = 0;
		
		while(current != null) {
			count++;
			current = current.next;
		}
		System.out.println("Count = "+count);
	}
	
	//delete a node - recursive
	
	public int getNodeCount(Node head) {
		
		if(head == null) {
			return 0;
		}
		else {
			return 1 + getNodeCount(head.next);
		}
	}
	
	public void deletedups(Node n) {
		HashSet<Integer> h = new HashSet<Integer>();
		Node previous = null;
		
		while(n != null) {
			if(h.contains(n.data)){
				previous.next = n.next;
			}
			else {
				h.add(n.data);
				previous = n;
			}
			n=n.next;
		}
	}
	
	public Node nthToLast(Node head, int k) {
		Node p1=head;
		Node p2= head;
		
		for(int i=0;i<k;i++) {
			if(p1 == null)
				return null;
			p1=p1.next;
		}
		
		while(p1 != null) {
			p1 = p1.next;
			p2 = p2.next;
		}
		return p2;
		
	}
	
	public void deleteMiddleNode(Node head) {
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(3);
		
		l.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		l.printList();
		
		l.push(0);
		System.out.println("");
		l.printList();
		
		System.out.println("");
		l.pop(3);
		l.printList();
		System.out.println("");
		l.linkedList_count(l.head);
		
		System.out.println("");
		l.pop(5);
		l.printList();
		System.out.println("");
		l.linkedList_count(l.head);
		
		System.out.println(l.getNodeCount(l.head));
		
		System.out.println("");
		l.deletedups(l.head);
		l.printList();
		System.out.println("");
		
		l.push(22);
		l.push(12);
		l.push(122);
		System.out.println("");
		l.printList();
		System.out.println("");
		
		LinkedList output_list = new LinkedList();
		
		output_list.head = l.nthToLast(l.head, 5);
		output_list.printList();
	}

}
