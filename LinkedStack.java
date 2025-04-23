public class LinkedStack {
	Node top;

	public LinkedStack() {
		this.top = null;
	}

	public void push(int value) {
		Node temp = this.top;
		this.top = new Node(value);
		this.top.next = temp;
	}

	public void pop() {
		this.top = this.top.next;
	}

	public int peek() {
		return this.top.data;
	}

	public boolean isEmpty() {
		return this.top == null;
	}

	public void print() {
		if (this.top != null) {
			this.top.printRecursive();
		} else {
			System.out.println("[empty]");
		}
	}
}