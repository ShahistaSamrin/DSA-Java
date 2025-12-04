/*OUTPUT:
Inorder (sorted): 10 20 25 30 40 50 
Preorder (AVL structure): 30 20 10 25 40 50 */
class Node {
    int data;
    int height;
    Node left, right;

    Node(int data) {
        this.data = data;
        this.height = 1; // new node height = 1
    }
}

class TreeMethods {
    Node root;

    int height(Node n){ 
        if(n == null) return 0; 
        return n.height; 
    } 
    int getBalance(Node n){ 
        if(n == null)return 0; 
        return height(n.left) - height(n.right); 
    }

    Node rightRotate(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        // rotation
        x.right = y;
        y.left = T2;

        // update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x; // IMPORTANT: return new root
    }

    Node leftRotate(Node x) {
        Node y = x.right;
        Node T2 = y.left;

        // rotation
        y.left = x;
        x.right = T2;

        // update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y; // new root
    }

    Node insert(Node node, int key) {
        // 1. Normal BST insertion
        if (node == null)
            return new Node(key);

        if (key < node.data)
            node.left = insert(node.left, key);
        else if (key > node.data)
            node.right = insert(node.right, key);
        else
            return node; // duplicates not allowed

        // 2. Update height
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // 3. Get balance factor
        int balance = getBalance(node);

        // 4. Balance cases

        // Left Left
        if (balance > 1 && key < node.left.data)
            return rightRotate(node);

        // Right Right
        if (balance < -1 && key > node.right.data)
            return leftRotate(node);

        // Left Right
        if (balance > 1 && key > node.left.data) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // Right Left
        if (balance < -1 && key < node.right.data) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node; // unchanged
    }

    // inorder traversal
    public void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + " ");
            inorder(node.right);
        }
    }
     public void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }
}

public class TreeAVL {
    public static void main(String[] args) {
        TreeMethods tree = new TreeMethods();

        int[] keys = {10, 20, 30, 40, 50, 25};

        for (int k : keys)
            tree.root = tree.insert(tree.root, k); 
        System.out.print("Inorder (sorted): ");
        tree.inorder(tree.root);
        System.out.println();
        System.out.print("Preorder (AVL structure): ");
        tree.preorder(tree.root);
        System.out.println();
    }
}
