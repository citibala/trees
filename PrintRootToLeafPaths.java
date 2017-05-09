
package algorithms.trees;

public class PrintRootToLeafPaths {

	public void printRootToLeafPaths(Node root, int[] leafPath, int pathLength) {
		if (root == null) {
			return;
		}
		leafPath[pathLength++] = root.data;
		if (root.left == null && root.right == null) {
			printPath(leafPath, pathLength);
		} else {
			printRootToLeafPaths(root.left, leafPath, pathLength);
			printRootToLeafPaths(root.right, leafPath, pathLength);
		}
	}
	public void printPath(int[] leafPath, int pathLength) {
		for (int i = 0; i < pathLength; i++) {
			System.out.print(leafPath[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] arg) {

		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);
		PrintRootToLeafPaths p = new PrintRootToLeafPaths();
		System.out.println("\nRoot to Leaf Paths:");
		p.printRootToLeafPaths(root, new int[250], 0);
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

