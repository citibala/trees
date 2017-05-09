package algorithms.trees;

import java.util.TreeMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;


public class TopViewOfTreeImplementation {

	/*public static Map<Integer, Integer> nodeMap = new TreeMap<>();
	
	public void printTopView(Node root){
		if (root == null)
			return;
		
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while (!queue.isEmpty()) {
		
			Node node = queue.remove();
	
			if (nodeMap.containsKey(1)) {

			} else {
				System.out.print(tnode.data + "   ");
				ht.put(lvl, tnode.data);
			}

			if (tnode.left != null) {
				queue.add(new QueuePack(lvl - 1, tnode.left));
			}
			if (tnode.right != null) {
				queue.add(new QueuePack(lvl + 1, tnode.right));
			}
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

		TopViewOfTreeImplementation obj  = new TopViewOfTreeImplementation();
		System.out.println("Top View of a Tree:\n");
		obj.printTopView(root);
	}
}
class Node {
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data = data;
	}*/
}