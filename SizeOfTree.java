

package algorithms.trees;

public class SizeOfTree {

	public int findSize(Node root){
		if(root==null){
			return 0;
		}
		return 1 + findSize(root.left) + findSize(root.right);
	}
	public static void main (String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);

		SizeOfTree obj  = new SizeOfTree();
		System.out.print("Size of the Given Tree: ");
		System.out.print(obj.findSize(root));
		
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