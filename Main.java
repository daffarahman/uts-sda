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
		System.out.println("\nBinary Search Tree: ");
		binarySearchTreeMain();

		System.out.println("\nBinary Tree: ");
		binaryTreeMain();

		System.out.println("\n\n::::: Map :::::\n");
		mapMain();
	}

	public static void linkedListMain() {
		LinkedList ll = new LinkedList();
		ll.append(5);
		ll.append(2);
		ll.append(3);
		ll.print();
		ll.prepend(7);
		ll.print();
		ll.remove(2);
		ll.print();
		ll.remove(3);
		ll.remove(7);
		ll.print();
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

	public static void binarySearchTreeMain() {
		BinarySearchTree bst = new BinarySearchTree();

		bst.insert(20);
        bst.insert(10);
        bst.insert(30);
        bst.insert(6);
        bst.insert(25);
        bst.insert(28);
        bst.insert(2);
        bst.insert(5);
        bst.insert(49);
        bst.insert(40);
        
        bst.display();
        bst.preorder();
        bst.inorder();
        bst.postorder();
        System.out.println(bst.getHeight(true));
        System.out.println(bst.getHeight(false));
	}

	public static void binaryTreeMain() {
		BinaryTree bt = new BinaryTree();
		bt.root = new TreeNode(5);
		bt.root.left = new TreeNode(9);
		bt.root.left.left = new TreeNode(8);
		bt.root.left.left.right = new TreeNode(2);
		bt.root.right = new TreeNode(2);

		bt.display();
        bt.preorder();
        bt.inorder();
        bt.postorder();
        System.out.println(bt.getHeight(true));
        System.out.println(bt.getHeight(false));
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