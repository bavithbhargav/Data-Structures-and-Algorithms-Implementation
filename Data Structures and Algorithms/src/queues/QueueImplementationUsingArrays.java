package queues;

public class QueueImplementationUsingArrays {
	
	int max_size = 10;
	int arr[] = new int[max_size];
	int front = 0;
	int rear = -1;
	int current_size = 0;
	
	public boolean isFull() {
		if(max_size == current_size) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		if(current_size == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Queue is full!");
			return;
		}
		if(rear == max_size-1) {
			rear = -1;
		}
		rear++;
		arr[rear] = data;
		current_size++;
		System.out.println(data + " added to the Queue");
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!");
			return;
		}
		System.out.println("The popped element is " + arr[front]);
		front++;
		if(front == max_size) {
			front = 0;
		}
		current_size--;
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty");
		}
		else {
			System.out.println(arr[front]);
		}
	}

}
