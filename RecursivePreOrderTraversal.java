
package algorithms.trees;

public class RecursivePreOrderTraversal {

	public void traverseInPreOrderRecursive(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			traverseInPreOrderRecursive(root.left);
			traverseInPreOrderRecursive(root.right);
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

		RecursivePreOrderTraversal obj = new RecursivePreOrderTraversal();
		System.out.println("Pre-Order Traversal:" + "\n");
		obj.traverseInPreOrderRecursive(root);
	}

}
/*class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}
}
*/