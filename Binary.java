package DSATREES;

class Node {
    int data;
    Node left, right;
	public char[] key;

    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}
 
public class Binary{
    Node root;
    static int count;

    static void preOrder(Node node, int max)
    {
        if (node == null) {
            return;
        }

        if (node.data >= max) {
            count++;
            max = Math.max(node.data, max);
        }
 
       
        preOrder(node.left, max);
        preOrder(node.right, max);
    }

    public static void main(String[] args)
    {
        Binary tree = new Binary();
 
 
        tree.root = new Node(3);
        tree.root.left = new Node(4);
        tree.root.right = new Node(10);
 
        tree.root.left.left = new Node(20);
        tree.root.left.right = new Node(21);
 
        tree.root.right.left = new Node(1);
 
        count = 0;
        preOrder(tree.root, Integer.MIN_VALUE);
 
        System.out.println(count);
    }
}
