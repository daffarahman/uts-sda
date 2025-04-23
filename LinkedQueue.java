public class LinkedQueue {
	Node head;

	public LinkedQueue() {
		this.head = null;
	}

	public void enqueue(int value) {
		Node newNode = new Node(value);

		if (this.head == null) {
			this.head = newNode;
			return;
		}

		Node current = this.head;
		while(current.next != null) {
			current = current.next;
		}

		current.next = newNode;
	}

	public void dequeue() {
		if(this.head != null) {
			this.head = this.head.next;
		}
	}

	public void print() {
		if(this.head != null)
			this.head.printRecursive();
		else
			System.out.println("empty");
	}
}