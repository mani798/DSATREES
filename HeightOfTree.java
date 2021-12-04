package DSATREES;

public class HeightOfTree {
	
		public static class Node{  
	        int data;  
	        Node left;  
	        Node right;  
	  
	        public Node(int data){  
	            this.data = data;  
	            this.left = null;  
	            this.right = null;  
	        }  
	    }  
	 
	    public Node root;  
	    public void BinaryTree(){  
	        root = null;  
	    }  
	  
	    public int findHeight(Node temp){  
	        if(root == null) {  
	             System.out.println("Tree is empty");  
	            return 0;  
	        }  
	        else {  
	            int leftHeight = 0, rightHeight = 0;  
	            if(temp.left != null)  
	                leftHeight = findHeight(temp.left); 
	            
	            if(temp.right != null)  
	                rightHeight = findHeight(temp.right);  

	            int max = (leftHeight > rightHeight) ? leftHeight : rightHeight;    
	            return (max + 1);  
	        }  
	     }  
	  
	    public static void main(String[] args) {  
	  
	        HeightOfTree h = new HeightOfTree();  
	        h.root = new Node(1);  
	        h.root.left = new Node(2);  
	        h.root.right = new Node(3);  
	        h.root.left.left = new Node(4);  
	        h.root.right.left = new Node(5);  
	        h.root.right.right = new Node(6);  
	        h.root.right.right.right= new Node(7);  
	        h.root.right.right.right.right = new Node(8);  
	  
	        System.out.println("Height of tree: " + h.findHeight(h.root));  
	  }  
	}  


