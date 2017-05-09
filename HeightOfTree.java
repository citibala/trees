
package algorithms.trees;

public class HeightOfTree {

	public int getHeight(Node root) {
		int leftHeight = 0, rightHeight = 0;
		if (root == null)
			return 0;
		leftHeight = 1 + getHeight(root.left);
		rightHeight = 1 + getHeight(root.right);

		return Math.max(leftHeight, rightHeight);
	}

	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);

		HeightOfTree obj = new HeightOfTree();
		System.out.print("\nHeight of the Given Tree: ");
		System.out.print(obj.getHeight(root));

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
