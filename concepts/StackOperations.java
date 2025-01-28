
package concepts;

import java.util.EmptyStackException;

public class StackOperations {
	private int[] stack;
	private int top;
	private int maxSize;

	public StackOperations(int size) {
		this.maxSize = size;
		this.stack = new int[size];
		this.top = -1;
	}

	public void push(int value) {
		if (top == maxSize - 1) {
			throw new StackOverflowError("Stack is full. Cannot push value: " + value);
		}
		stack[++top] = value;
	}

	public int pop() {
		if (top == -1) {
			throw new EmptyStackException();
		}
		return stack[top--];
	}

	public int peek() {
		if (top == -1) {
			throw new EmptyStackException();
		}
		return stack[top];
	}

	public void display() {
		if (top == -1) {
			throw new EmptyStackException();
		} else {
			for (int i = top; i >= 0; i--) {
				System.out.println("stack[" + i + "] --> " + stack[i]);
			}
		}
	}

	public static void main(String[] args) {
		StackOperations stack = new StackOperations(5);
		stack.push(10);
		stack.push(20);
		stack.push(30);

		System.out.println("Stack elements after pushing:");
		stack.display();

		System.out.println("Popped element: " + stack.pop());

		System.out.println("Stack elements after popping:");
		stack.display();

		System.out.println("Peek element: " + stack.peek());

	}
}
