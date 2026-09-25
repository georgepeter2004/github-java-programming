package DSA;

public class BinarySearchTree {
    Node root;
    class Node{
        int key;
        Node left,right;

        Node(int val){
            key = val;
            left = right = null;
        }
    }

    BinarySearchTree(int key){
        root = new Node(key);
    }

    public void insert(int val){
        insert(root,val);
    }

    public Node insert(Node root,int key){
        if(root==null) {
            return new Node(key);
        }
        if(key<root.key){
            root.left=insert(root.left,key);
        }
        else{
            root.right=insert(root.right,key);
        }

        return root;
    }

    public Node search(Node root,int val){
        if(root == null || root.key==val) return root;

        if(val<root.key)
            return search(root.left,val);

        return search(root.right,val);
    }

    public static void inOrder(Node root){
        if(root!=null){
            inOrder(root.left);
            System.out.print(root.key+" ");
            inOrder(root.right);
        }
    }


    public Node delete(Node root,int val){
        if(root==null) return root;
        if(val<root.key){
            root.left = delete(root.left,val);
        }
        else if(val>root.key) root.right = delete(root.right,val);
        else{
            if(root.right==null) return delete(root.left,val);
            else if(root.left==null) return delete(root.right,val);
            else{
                root.key=min(root.right);
                root.right=delete(root.right,root.key);
            }
        } return root;
    }

    public int min(Node root){
        int minval = root.key;
        while(root.left!=null){
            minval = root.left.key;
            root = root.left;
        }
        return minval;
    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree(50);
        bst.insert(20);
        bst.insert(10);
        bst.insert(25);
        bst.insert(70);
        bst.insert(60);
        bst.insert(90);
        inOrder(bst.root);
        System.out.println();
        bst.delete(bst.root,70);
        inOrder(bst.root);
        System.out.println();
        if(bst.search(bst.root,70)!=null) System.out.println("Found");
        else System.out.println("Not Found");



    }


}
