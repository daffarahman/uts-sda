class TreeNode {
    public int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode (int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }
}

class Tree {
    TreeNode root;

    public Tree() {
        this.root = null;
    }

    public void insert(int value) {
        TreeNode newNode = new TreeNode(value);
        if(this.root == null) {
            this.root = newNode;
        } else {
            this.insertRecursive(this.root, newNode);
        }
    }

    private void insertRecursive(TreeNode rootNode, TreeNode newNode) {
        if(newNode.value < rootNode.value) {
            if(rootNode.left == null) rootNode.left = newNode;
            else this.insertRecursive(rootNode.left, newNode);
        } else if (newNode.value > rootNode.value) {
            if(rootNode.right == null) rootNode.right = newNode;
            else this.insertRecursive(rootNode.right, newNode);
        }
    }

    public void print() {
        this.printTree(this.root, "", false);
    }

    private void printTree(TreeNode node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.value);
            printTree(node.right, prefix + (isLeft ? "│   " : "    "), true);
            printTree(node.left, prefix + (isLeft ? "│   " : "    "), false);
        } else {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + "NULL");
        }
    }
}
