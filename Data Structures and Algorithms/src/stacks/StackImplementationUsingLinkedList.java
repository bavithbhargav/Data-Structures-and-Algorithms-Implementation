package stacks;

public class StackImplementationUsingLinkedList {
	
	public static class Node {
		public int data;
		public Node next;

//constructor
		public Node(int data) {

			this.data = data;
			next = null;
		}
	}
	
	Node head;
	
	public boolean isEmpty() {
		if(head == null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push(int data) {
		
		Node toAdd = new Node(data);
		
		if(isEmpty()) {
			head = toAdd;
			System.out.println(toAdd.data + " added to the Stack");
			return;
		}
		
		Node temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = toAdd;
		System.out.println(toAdd.data + " added to the Stack");
		
	}
	
	public void pop() {
		
		if(isEmpty()) {
			System.out.println("The Stack is empty");
			return;
		}
		
		Node temp = head;
		
		if (temp.next == null) {
			System.out.println("The popped element is "+head.data);
			head = null;
			return;
		}
		
		else {
		while (temp.next.next != null) {
			temp = temp.next;
		}
		System.out.println("The popped element is "+temp.next.data);
		temp.next = null;
		}
		
	}
	
	public void peek() {
		
		if(isEmpty()) {
			System.out.println("The is Empty");
			return;
		}
		
		Node temp = head;
		
		while(temp.next != null) {
			temp = temp.next;
		}
		System.out.println("The last element is "+ temp.data);
	}

}
