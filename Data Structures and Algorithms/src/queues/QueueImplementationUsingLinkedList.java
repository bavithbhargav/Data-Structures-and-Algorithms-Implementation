package queues;

public class QueueImplementationUsingLinkedList {
	
	public static class Node {
		public int data;
		public Node next;

    //constructor
		public Node(int data) {

			this.data = data;
			next = null;
		}
	}
	
	public Node head, rear;

	public void enqueue(int data) {

		Node toAdd = new Node(data);
		if (head == null) {
			head = rear = toAdd;
			System.out.println(toAdd.data + " added to the queue");
			return;
		}

		rear.next = toAdd;
		rear = rear.next;
		
		System.out.println(toAdd.data + " added to the queue");

	}

	public void dequeue() {

		if (head == null) {
			System.out.println("The queue is Empty");
			return;
		}

		Node temp = head;
		head = head.next;

		if (head == null) {
			rear = null;
		}

		System.out.println(temp.data + " removed from the queue");
	}

}
