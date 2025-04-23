class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	public void printRecursive() {
		System.out.print(this.data);
		if(this.next != null) {
			System.out.print(", ");
			this.next.printRecursive();
		} else {
			System.out.print("\n");
		}
	}
}