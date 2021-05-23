package stacks;

import java.util.Scanner;

public class StackImplementationUsingArrays {
	
	Scanner sc = new Scanner(System.in);
	
	int top = -1;
	int max_size = 10;
	int arr[] = new int[max_size];
	
	boolean isEmpty() {
		if(top == -1) {
			return true;
		}
		else
			return false;
	}
	
	boolean isFull() {
		if(top == max_size-1) {
			return true;
		}
		else
			return false;
	}
	
	public void push(int data) {
		if(isFull()) {
			System.out.println("Overflow!");
			return;
		}
		else {
			top++;
			arr[top] = data;
			System.out.println("Item pushed");
		}
		
	}
	
    public void pop() {
		if(isEmpty()) {
			System.out.println("Underflow!");
			return;
		}
		else {
			System.out.println("The popped item is " + arr[top]);
			top--;
		}
		
	}
    
    public void peek() {
    	if(isEmpty()) {
    		System.out.println("Stack is Empty");
    	}
    	else {
    		System.out.println(arr[top]);
    	}
    }
	

}

