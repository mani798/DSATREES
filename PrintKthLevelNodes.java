package DSATREES;

public class PrintKthLevelNodes {
	public static void main(String[] args) {
		  Node root = new Node(1);
		  root.left = new Node(2);
		  root.right = new Node(3);
		  root.left.left = new Node(4);
		  root.right.left = new Node(5);
		  root.right.left.right= new Node(6);
		  root.right.left.right.left= new Node(7);
		  
		  printKthLevel(root, 1);
		 }
		 private static void printKthLevel(Node root, int levelK) {
		  if(root == null) return;
		  
		  if(levelK==0) {
		   System.out.println(root.key);
		  }
		  
		  printKthLevel(root.left, --levelK);
		  printKthLevel(root.right, levelK);
		 }
}
