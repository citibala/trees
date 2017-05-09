

package algorithms.trees;

public class ValidBinarySearchTree {
	 
	    boolean isValidBST(Node node, int min, int max)
	    {
	        if (node == null)
	            return true;
	        if (node.data < min || node.data > max)
	            return false;
	        return (isValidBST(node.left, min, node.data) &&
	        		isValidBST(node.right, node.data, max));
	    }
	public static void main (String[] args) {
		Node root = new Node(50);
		root.left = new Node(20);
		root.right = new Node(70);
		root.left.left = new Node(10);
		root.left.right = new Node(30);
		root.right.left = new Node(60);
		root.right.right = new Node(80);
		ValidBinarySearchTree obj  = new ValidBinarySearchTree();
		System.out.print("\nIs Valid Binary Search Tree: ");
		System.out.print(obj.isValidBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));	
	}
}
/*class Node {
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data = data;
  }
}*/