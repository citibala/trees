

package algorithms.trees;

public class PrintLevelNodes {

	public void printSelectedLevel(Node node, int level) {
		if (node == null)
			return;
		if (level == 0) {
			System.out.print(node.data + " ");
			return;
		} else {
			printSelectedLevel(node.left, level - 1);
			printSelectedLevel(node.right, level - 1);
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

		PrintLevelNodes obj = new PrintLevelNodes();
		System.out.println("\nThe follow nodes are available in leve 2:");
		obj.printSelectedLevel(root, 2);

	}
}
