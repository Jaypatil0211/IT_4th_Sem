public class BSTTest {
    public static void main(String[] args){
        BST bst = new BST();
        bst.root = bst.insert(11,bst.root);
        bst.root = bst.insert(7,bst.root);
        bst.root = bst.insert(16,bst.root);
        
        System.out.println("Root: " + bst.root.data);
        System.out.println("Left: " + bst.root.left.data);
        System.out.println("Right: " + bst.root.right.data);
    }
}
class Node {
    int data;
    Node left;
    Node right;
    Node (int v){
        data=v;
        left=null;
        right=null;
    }
}
class BST{
    Node root;
    Node insert(int v, Node root){
        if(root == null){
            root=new Node(v);
        }
        if(root.data>v){
            root.left = insert(v,root.left);
        }
        if(root.data<v){
            root.right = insert(v,root.right);
        }
        return root;
    }
}
