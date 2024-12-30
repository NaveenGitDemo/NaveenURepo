package com.tech;

public class Node {
	
	int data;
	Node next;
	
	public static void main(String [] aa) {
		LinkedList list=new LinkedList();
		list.insertData(10);
		list.insertData(70);
		list.insertData(90);
		list.insertData(40);
		list.insertData(40);
		list.add(4, 30);
		// raise index out of bound exception 
		//list.add(9, 30);
		// adding at begin
		list.insertAtBegin(1000);
		int size=list.length();
		// reverse list
		list.reverseList();
		list.show();
		
		System.out.println("List size :"+size);
		
		java.util.LinkedList<Integer> ll=new java.util.LinkedList<>();
		
	}

}

// space complexity of linked list is O(1)
/* 
 * Time Complexity of linked list storing 'N' elements. For insertion in the linked list, the time complexity is
 *  O(1) if done on the head, O(N) if done at any other 
 *  location, as we need to reach that location by traversing the linked list.
 * 
 * */
class LinkedList{
	
	Node head;
	Node node ;
	public void insertData (int data) {
		node =new Node();
		 node.data=data;
		 node.next=null;
		if(head==null) {
		   head	=node;
		}
		else {
			Node n=head;
			while(n.next!=null) {
				n=n.next;
			}
			n.next=node;
		}
	}
	public void show() {
		Node node=head;
		while(node.next!=null) {
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
		
	}
	public int  length() {
		int count=0;
		if(head == null) {
			return 0;
		}else {
			Node node=head;
			 while(node !=null) {
				 
				 count=count+1;
				 
				 node=node.next;
				
			 }
			 return count;
		}
		
	}

	public void add(int index,int ele) {
		Node node1 =new Node();
		node1.data=ele;
		node1.next=null;
		if(index==0 && head!=null) {
			node1.next=head;
			head=node1;
		}
		int len= length();
		if(index!=0 && index < len) {
			int i=0;
			Node n=head;
			while(i<index-1) {
				n = n.next;
				i++;
			}
			node1.next = n.next;
			n.next = node1;
		}else {
			System.out.println("index not there");
			throw new ArrayIndexOutOfBoundsException(" given index not exists ");
		}
	}
	
	public void insertAtBegin(int data) {
		Node newNode=new Node();
		newNode.data=data;
		newNode.next=null;
		Node pointer;
		if(head==null) {
			head=newNode;
		}else {
			pointer=head;
			newNode.next=pointer;
			pointer=newNode;
			head=pointer;
		}
	}
	
	
	public void reverseList() {
		Node p;
		Node q;
		int size=length()-1;
		 //size=size-1;
		int i=0;int k;int temp=0;
		// first assigned p,q pointers to root means head
		p=head;
		q=head;
		while(i<size) {
			k=0;
			while(k<size) {
			q=q.next;
			k++;
			}
			// now swaping
			temp=q.data;
			q.data=p.data;
			p.data=temp;
			// here pointers movement
			p=p.next;
			q=head;
			i++;
			size--;
		}
		
	}
}



