
package algorithms.trees;

import java.util.Stack;

public class PostOrderTraversalUsingStack {

	static Stack<Node> stack1 = new Stack<Node>();
	static Stack<Node> stack2 = new Stack<Node>();
	
	public void postorderTraversal(Node root) {
	
		stack1.push(root);
		
		while (stack1.isEmpty() == false) {
			Node temp = stack1.pop();
			stack2.push(temp);
			if(temp.left!=null){
				stack1.push(temp.left);
			}
			if(temp.right!=null){
				stack1.push(temp.right);
			}
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

		PostOrderTraversalUsingStack obj = new PostOrderTraversalUsingStack();
		obj.postorderTraversal(root);
		System.out.println("Post Order Traversal using Stacks:\n");
		
		while(!stack2.isEmpty()){
			System.out.print(stack2.pop().data+" ");
		}
	
	}
}
/*  class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
	}
  }
  */