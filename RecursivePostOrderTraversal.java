
package algorithms.trees;

public class RecursivePostOrderTraversal {

	public void traverseInPostOrderRecursive(Node root) {
		if (root != null) {
			traverseInPostOrderRecursive(root.left);
			traverseInPostOrderRecursive(root.right);
			System.out.print(root.data + " ");
			
		}
	}
	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);

		RecursivePostOrderTraversal obj = new RecursivePostOrderTraversal();
		System.out.println("Post-Order Traversal:" + "\n");
		obj.traverseInPostOrderRecursive(root);
	}

}
 /*  class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}
}*/