public class LinkedList {
	Node head;

	public LinkedList() {
		this.head = null;
	}

	public boolean isEmpty() {
		return this.head == null;	
	}

	public void append(int data) {
		Node newNode = new Node(data);
		if(this.head == null) {
			this.head = newNode;
		} else {
			Node current = this.head;
			while(current.next != null) {
				current = current.next;
			}
			current.next = newNode;
		}
	}

	public void prepend(int data) {
		Node newNode = new Node(data);
		newNode.next = this.head;
		this.head = newNode;
	}

	public void remove(int data) {
		if(this.head.data == data) {
			this.head = this.head.next;
		} else {
			Node current = this.head;
			while(current.next != null && current.next.data != data) {
				current = current.next;
			}

			if(current.next != null) {
				current.next = current.next.next;
			}
		}
	}

	public void print() {
		if(this.head != null) {
			this.head.printRecursive();
		}
	}
}