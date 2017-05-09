
package algorithms.trees;

public class RecursiveInOrderTraversal {

	public void traverseInOrderRecursive(Node root) {
		if (root != null) {
			traverseInOrderRecursive(root.left);
			System.out.print(root.data + " ");
			traverseInOrderRecursive(root.right);
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

		RecursiveInOrderTraversal obj = new RecursiveInOrderTraversal();
		System.out.println("In-Order Traversal:" + "\n");
		obj.traverseInOrderRecursive(root);
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