
package algorithms.trees;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	static Queue<Node> queue = new LinkedList<>();
	
	public void levelOrderTraversal (Node root){

		int levelSize = 0;
		if (root == null)
			return;
		
		queue.add(root);
		
		while (!queue.isEmpty()) {
			levelSize = queue.size();
			while (levelSize > 0) {
				Node n = queue.remove();
				System.out.print(" " + n.data);
				if (n.left != null)
					queue.add(n.left);
				if (n.right != null)
					queue.add(n.right);
				levelSize--;
			}
			System.out.println("");
		}
	}
	
	public static void main (String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);

		LevelOrderTraversal obj  = new LevelOrderTraversal();
		System.out.println("Level Order Traversal of a Tree:\n");
		obj.levelOrderTraversal(root);
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
