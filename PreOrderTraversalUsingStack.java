
package algorithms.trees;

import java.util.Stack;

public class PreOrderTraversalUsingStack {

	static Stack<Node> stack = new Stack<Node>();

	public void preOrderTraversal(Node root) {
		while (true) {
			while (root != null) {
				System.out.print(root.data + " ");
				stack.push(root);
				root = root.left;
			}
			if (stack.isEmpty()) {
				return;
			}
			root = stack.pop();
			root = root.right;
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

		PreOrderTraversalUsingStack obj = new PreOrderTraversalUsingStack();
		System.out.println("Pre Order Traversal using Stack:\n");
		obj.preOrderTraversal(root);
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
