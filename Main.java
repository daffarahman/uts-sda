public class Main {
	public static void main(String[] args) {
		System.out.println("\nLinkedList:");
		linkedListMain();

		System.out.println("\n::::: Node Based Queue and Stack :::::\n");
		
		System.out.println("\nStack: ");
		linkedStackMain();

		System.out.println("\nQueue: ");
		linkedQueueMain();

		System.out.println("\n\n::::: Array Based Queue and Stack :::::\n");
		System.out.println("\nStack: ");
		arrayStackMain();

		System.out.println("\nQueue: ");
		arrayQueueMain();

		System.out.println("\n\n::::: Set :::::\n");
		setMain();

		System.out.println("\n\n::::: Tree :::::\n");
		System.out.println("\nBinary Tree: ");
		binaryTreeMain();

		System.out.println("\n\n::::: Map :::::\n");
		mapMain();
	}

	public static void linkedListMain() {

	}

	public static void linkedStackMain() {
		LinkedStack stack = new LinkedStack();
		System.out.println(stack.isEmpty());
		stack.push(2);
		stack.push(5);
		stack.print();
		stack.push(8);
		stack.print();
		stack.pop();
		stack.push(9);
		stack.print();
		stack.push(3);
		stack.push(6);
		stack.print();
		System.out.println(stack.isEmpty());
		System.out.println(stack.peek());
	}

	public static void linkedQueueMain() {
		LinkedQueue queue = new LinkedQueue();
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.print();
		queue.dequeue();
		queue.print();
		queue.dequeue();
		queue.print();
		queue.enqueue(7);
		queue.print();
		queue.dequeue();
		queue.print();
	}

	public static void arrayStackMain() {
		ArrayStack arrayStack = new ArrayStack(100);
		System.out.println(arrayStack.isEmpty());
		arrayStack.push(2);
		arrayStack.push(5);
		arrayStack.print();
		arrayStack.push(8);
		arrayStack.print();
		arrayStack.pop();
		arrayStack.push(9);
		arrayStack.print();
		arrayStack.push(3);
		arrayStack.push(6);
		arrayStack.print();
		System.out.println(arrayStack.isEmpty());
		System.out.println(arrayStack.peek());
	}

	public static void arrayQueueMain() {
		ArrayQueue arrayQueue = new ArrayQueue(100);
		arrayQueue.enqueue(3);
		arrayQueue.enqueue(4);
		arrayQueue.enqueue(5);
		arrayQueue.print();
		arrayQueue.dequeue();
		arrayQueue.print();
		arrayQueue.dequeue();
		arrayQueue.print();
		arrayQueue.enqueue(7);
		arrayQueue.print();
		arrayQueue.dequeue();
		arrayQueue.print();
	}

	public static void setMain() {
		Set newSet1 = new Set(100);
		Set newSet2 = new Set(100);
		
		newSet1.add(2);
		newSet1.add(7);
		newSet1.add(5);
		newSet1.add(5);
		newSet1.add(8);
		newSet1.print();

		newSet2.add(8);
		newSet2.add(7);
		newSet2.add(5);
		newSet2.add(5);
		newSet2.add(3);
		newSet2.print();

		System.out.println(newSet1.isEqual(newSet2));

		Set unionSet = newSet1.union(newSet2);
		unionSet.print();

		Set intersectionSet = newSet1.intersection(newSet2);
		intersectionSet.print();

		Set differenceSet = newSet1.setDifference(newSet2);
		differenceSet.print();

		Set newSet3 = new Set(100);
		newSet3.add(2);
		newSet3.add(5);
		newSet3.print();

		System.out.println(newSet3.isSubsetOf(newSet1));

		newSet3.add(9);
		newSet3.print();
		System.out.println(newSet3.isSubsetOf(newSet1));
	}

	public static void binaryTreeMain() {
		BinaryTree tree = new BinaryTree();

		tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(6);
        tree.insert(25);
        tree.insert(28);
        tree.insert(2);
        tree.insert(5);
        tree.insert(49);
        tree.insert(40);
        
        tree.display();
        tree.preorder();
        tree.inorder();
        tree.postorder();
        System.out.println(tree.getHeight(true));
        System.out.println(tree.getHeight(false));
	}

	public static void mapMain() {
		Map map = new Map(100);
		map.add("zidan", 20);
		map.add("daffa", 45);
		map.add("qiqi", 17);
		map.add("ihsan", 6);
		map.add("ihsan", 9);
		map.print();
	}
}