
package algorithms.trees;

public class LeftViewOfTreeImplementation {

	public static int currLevel =0;	
	public void printLeftView(Node root, int nextLevel){
		
		if(root==null) return;
		if(currLevel<nextLevel){
			System.out.print ("  " + root.data);
			currLevel = nextLevel;
		}
		printLeftView(root.left,nextLevel+1);
		printLeftView(root.right,nextLevel+1);
	}
	public static void main (String[] args) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.left.right = new Node(50);
		root.right.left = new Node(60);
		root.right.right = new Node(70);

		LeftViewOfTreeImplementation obj  = new LeftViewOfTreeImplementation();
		System.out.println("Left View of a Tree:\n");
		obj.printLeftView(root,1);
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