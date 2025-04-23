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

class BinaryTree {
    TreeNode root;

    public BinaryTree() {
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
            if(rootNode.left == null) {
                rootNode.left = newNode;
            } else {
                this.insertRecursive(rootNode.left, newNode);
            }
        } else if (newNode.value > rootNode.value) {
            if(rootNode.right == null) {
                rootNode.right = newNode;
            } else {
                this.insertRecursive(rootNode.right, newNode);
            }
        }
    }

    public void display() {
        this.displayHelper(this.root, "", false);
    }

    private void displayHelper(TreeNode node, String prefix, boolean isLeft) {
        if (node != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + node.value);
            displayHelper(node.right, prefix + (isLeft ? "│   " : "    "), true);
            displayHelper(node.left, prefix + (isLeft ? "│   " : "    "), false);
        } else {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + "NULL");
        }
    }

    public void preorder() {
        System.out.print("PreOrder: ");
        this.preorderHelper(this.root);
        System.out.print("\n");
    }

    private void preorderHelper(TreeNode node) {
        if(node != null) {
            System.out.print(Integer.toString(node.value) + " ");
            this.preorderHelper(node.left);
            this.preorderHelper(node.right);
        }
    }

    public void inorder() {
        System.out.print("InOrder: ");
        this.inorderHelper(this.root);
        System.out.print("\n");
    }

    private void inorderHelper(TreeNode node) {
        if(node != null) {
            this.inorderHelper(node.left);
            System.out.print(Integer.toString(node.value) + " ");
            this.inorderHelper(node.right);
        }
    }

    public void postorder() {
        System.out.print("PostOrder: ");
        this.postorderHelper(this.root);
        System.out.print("\n");
    }

    private void postorderHelper(TreeNode node) {
        if(node != null) {
            this.postorderHelper(node.left);
            this.postorderHelper(node.right);
            System.out.print(Integer.toString(node.value) + " ");
        }
    }

    public int getHeight(boolean byEdge) {
        return this.getHeightHelper(this.root, byEdge);
    }

    private int getHeightHelper(TreeNode node, boolean byEdge) {
        if(node == null) return (byEdge)? -1 : 0;
        return 1 + Math.max(
            this.getHeightHelper(node.left, byEdge),
            this.getHeightHelper(node.right, byEdge)
        );
    }
}
