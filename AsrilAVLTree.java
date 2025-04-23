class AsrilTreeNode{
    int data;
    int height;
    AsrilTreeNode left;
    AsrilTreeNode right;
    
    AsrilTreeNode(int data){
        this.data = data;
        this.height = 1;
    }
}
    
public class AsrilAVLTree {
    private AsrilTreeNode root;
    private int size = 0;
    
    public boolean isEmpty(){
        return size == 0;
    }
    
    public int size(){
        return size;
    }
    
    public int height(AsrilTreeNode node){
        if(node == null) {
        return 0;
        }
        return node.height;
    }
    
    private int updateHeight(AsrilTreeNode node){
        int lh = height(node.left);
        int rh = height(node.right);
        return lh > rh ? 1 + lh : 1 + rh;
    }
    
    public int getBalance(AsrilTreeNode node){
        return height(node.left) - height(node.right);
    }
    
    private AsrilTreeNode rightRotate(AsrilTreeNode node){
        AsrilTreeNode t1 = node.left;
        AsrilTreeNode t2 = t1.right;
        
        node.left = t2;
        t1.right = node;
        
        node.height = updateHeight(node);
        t1.height = updateHeight(t1);
        
        return t1;
    }
    
    private AsrilTreeNode leftRotate(AsrilTreeNode node){
        AsrilTreeNode t1 = node.right;
        AsrilTreeNode t2 = t1.left;
        
        node.right = t2;
        t1.left = node;
        
        node.height = updateHeight(node);
        t1.height = updateHeight(t1);
        
        return t1;
    }
    
    private AsrilTreeNode leftRightRotate(AsrilTreeNode node){
        node.left = leftRotate(node.left);
        return rightRotate(node);
    }
    
    private AsrilTreeNode rightLeftRotate(AsrilTreeNode node){
        node.right = rightRotate(node.right);
        return leftRotate(node);
    }
    
    private AsrilTreeNode rebalance(AsrilTreeNode node){
        int balance = getBalance(node);
        
        if(balance > 1){
        if(getBalance(node.left) >= 0){ // left left
            return rightRotate(node);
        }
        return leftRightRotate(node); // left right
        }
        
        if(balance < -1){
        if(getBalance(node.right) <= 0){
          return leftRotate(node); // right right
        }
        return rightLeftRotate(node); // right left
        }
        
      return node; // balance
    }
    
    public void insert(int data){
        root = insertHelper(data, root);
    }
    
    private AsrilTreeNode insertHelper(int data, AsrilTreeNode node){
        if (node == null){
        size++;
        return new AsrilTreeNode(data);
        } else if (node.data == data){
        System.out.println(data + "sudah ada");
        return node;
        } else if (data < node.data){
        node.left = insertHelper(data, node.left);
        } else {
        node.right = insertHelper(data, node.right);
        }
        
        node.height = updateHeight(node);
        
        return rebalance(node);
    }
    
    public void remove(int data){
        root = removeHelper(data, root);
    }
    
    private AsrilTreeNode removeHelper(int data, AsrilTreeNode node){
        if(node == null){
        System.out.println(data + " tidak ada");
        return null;
        }
        if (data < node.data){
        node.left = removeHelper(data, node.left);
        } else if (data > node.data){
        node.right = removeHelper(data, node.right);
        } else {
        if (node.left == null){
            size--;
            return node.right;
        } else if (node.right == null){
            size--;
            return node.left;
        } else {
            AsrilTreeNode temp = successor(node.right);
            node.data = temp.data;
            node.right = removeHelper(temp.data, node.right);
        }
        }
        
        node.height = updateHeight(node);
        
        return rebalance(node);
    } 
    
    private AsrilTreeNode successor(AsrilTreeNode node){
        while(node.left != null){
        node = node.left;
        }
        return node;
    }
    
    public boolean search(int data){
        return searchHelper(data, root);
    }
    
    private boolean searchHelper(int data, AsrilTreeNode node){
        if(node == null){
        return false;
        }
        if(node.data == data){
        return true;
        } else if (data < node.data){
        return searchHelper(data, node.left);
        } else {
        return searchHelper(data, node.right);
        }
    }
    
    public void print(){
        printHelper(root);
        System.out.println();
    }
    
    private void printHelper(AsrilTreeNode node){
        if(node != null){
        printHelper(node.left);
        System.out.print(node.data + " ");
        printHelper(node.right);
        }
    }
}