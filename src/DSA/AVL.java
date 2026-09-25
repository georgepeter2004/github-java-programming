package DSA;

public class AVL {
    Node root;
    class Node{
        int key;
        Node left,right;
        int height;

        Node(int val){
            key = val;
            left = right = null;
            height=0;
        }
    }
    AVL(){
        root = null;
    }
    AVL(int key){
        root = new Node(key);
    }

    public void insert(int val){
        root = insert(root,val);
    }

    public Node insert(Node node, int key){
        if(node==null) {
            return new Node(key);
        }
        if(key<node.key){
            node.left=insert(node.left,key);
        }
        else if(key>node.key){
            node.right=insert(node.right,key);
        }
        else return node;

        node.height = 1+max(getHeight(node.left),getHeight(node.right));
        //if(key==40) System.out.println("Height of node is "+node.key+" Updated as "+node.height);
        int balfactor=getBalanceFactor(node);



        //LL case
        if(balfactor>1 && key < node.left.key){// < last 'L' of LL
            return leftRotate(node);
        }
        //LR case
        if(balfactor>1 && key > node.left.key){// > last 'R' of LR
            node.left=leftRotate(node.left);
            return rightRotate(node);
        }
        //RR case
        if(balfactor<-1 && key > node.right.key){// > last 'R' of RR
            return rightRotate(node);
        }
        //RL
        if(balfactor<-1 && key < node.right.key){// < last 'L' of RL
            node.right=rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public int max(int a,int b){
        return a>b? a:b;
    }

    public int getHeight(Node node){
        if(node==null) return -1;
        return node.height;
    }

    private int getBalanceFactor(Node node){
        return getHeight(node.left)-getHeight(node.right);
    }



    //ROTATION
    private Node rightRotate(Node z){
        Node y = z.left;
        Node t3 = y.right;

        y.right = z;
        z.left = t3;

        z.height = 1+max(getHeight(z.left),getHeight(z.right));
        y.height = 1+max(getHeight(y.left),getHeight(y.right));

        return y;
    }


    private Node leftRotate(Node z){
        Node y = z.right;
        Node t3 = y.left;

        y.left = z;
        z.right = t3;

        z.height = 1+max(getHeight(z.left),getHeight(z.right));
        y.height = 1+max(getHeight(y.left),getHeight(y.right));

        return y;
    }




    public static void inOrder(Node node){
        if(node!=null){
            inOrder(node.left);
            System.out.print(node.key+" height is "+node.height+"\n");
            inOrder(node.right);
        }
    }

    public static void main(String[] args) {
        AVL avl = new AVL(50);

        avl.insert(20);
        avl.insert(60);
        avl.insert(10);
        avl.insert(30);
        avl.insert(40);
        inOrder(avl.root);

    }
}
