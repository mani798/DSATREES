package DSATREES;

public class SumOfNodes {
	class Node
	{
	    public int data;
	    public Node left;
	    public Node right;
	    public Node(int x){
	        data = x;
	        left = right= null;
	    }
	}
	// CLASS BINARY TREE. THERE CAN BE MULTIPLE FUNCTION IN THIS CLASS
	class BinaryTree
	{
	    Node root;
	    BinaryTree(){
	        root= null;
	    }
	    //Main function that computes the sum of function
	    private int sumOfNodes(Node r)
	    {
	        if(r == null){ return 0; }
	        return r.data + sumOfNodes(r.left) + sumOfNodes(r.right);
	    }
	    // WRAPPER FUNCTION TO CALL THE ABOVE RECURSIVE FUNCTION
	    public int sumOfNodes()
	    {
	        return sumOfNodes(root);
	    }
	    // FUNCTION TO CREATE A TREE WITH SAMPLE NODES
	    void populateNodes()
	    {
	        root = new Node(6);
	        root.left = new Node(3);
	        root.right = new Node(1);
	        root.left.left = new Node(4);
	        root.right.left = new Node(5);
	        root.right.right = new Node(10);
	        root.right.left.right = new Node(3);
	    }
	}
	// CLASS WITH main FUNCTION
	class RTDemo
	{
	    public void main(String[] args)
	    {
	        BinaryTree tree = new BinaryTree();
	        tree.populateNodes();
	        System.out.println(tree.sumOfNodes());
	    }
	}

}
