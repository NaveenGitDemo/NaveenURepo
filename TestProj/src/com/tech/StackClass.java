package com.tech;

public class StackClass {
	
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data=data;
			next=null;
		}
	}
	// Time Complexity of stack is O(1) Push() , Pop() , Peek()  -> time complexity should be O(1) will not implement stack using
	//array because time complexity become O(n) 
	static class Stack{
		 // Top   3000
		/*   | Head   |
		 *   |(3000)10| next 2000
		 *   |(2000)20| next 1000
		 *   |(1000)  | next 500
//		 *   | (500)  | next null  (initial value)
		 * 
		 */
	
		Node head=null;
	   public boolean isEmpty(){
		   if(head == null) {
			   return true;
		   }else {
			   return false;
		   }
	   }
	   
	   public void push(int data) {
		   Node node=new Node(data);
		   if(isEmpty()) {
			   head=node; 
		   }else {
			   node.next=head;
			   head=node;
		   }
	   }
	  
	   public int peek() {
		   int data=0;
		   if(isEmpty()) {
			   return -1;
		   }else {
			     data=head.data;
			     return data;
		   }
	   }
	   public int pop(){
		   int data=0;
		   if(isEmpty()) {
			   return -1;
		   }else {
			   data=head.data;
			   head=head.next;
			   return data;
		   }
	   }
		
	}

	public static void main(String [] arg) {
		// create stack obj
		Stack stack=new Stack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		//System.out.println(stack.peek());
		while(!stack.isEmpty()) {
			System.out.print(" "+ stack.peek());
			stack.pop();
		}
		
		
	}
}
