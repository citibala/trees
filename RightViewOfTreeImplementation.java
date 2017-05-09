
package algorithms.trees;

public class RightViewOfTreeImplementation {

	public static int currLevel =0;	
	public void printRightView(Node root, int nextLevel){
		
		if(root==null) return;
		if(currLevel<nextLevel){
			System.out.print ("  " + root.data);
			currLevel = nextLevel;
		}
		printRightView(root.right,nextLevel+1);
		printRightView(root.left,nextLevel+1);
	}
	public static void main (String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);

		RightViewOfTreeImplementation obj  = new RightViewOfTreeImplementation();
		System.out.println("Right View of a Tree:\n");
		obj.printRightView(root,1);
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