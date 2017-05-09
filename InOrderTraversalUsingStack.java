
package algorithms.trees;

import java.util.Stack;

public class InOrderTraversalUsingStack {

	static Stack<Node> stack = new Stack<Node>();

	public void inOrderTraversal(Node root) {
		while (true) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}
			
			if (stack.isEmpty()) {
				return;
			}
			root =stack.pop();
			System.out.print(root.data + " ");
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

		InOrderTraversalUsingStack obj = new InOrderTraversalUsingStack();
		System.out.println("In Order Traversal using Stack:\n");
		obj.inOrderTraversal(root);
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
