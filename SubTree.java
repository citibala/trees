

package algorithms.trees;

public class SubTree {

boolean isValidSubTree(Node parent, Node child) 
    {    
        if (parent == null) 
            return false;
        if (child == null)
            return true;
        if (isIdentiacalTrees(parent, child)) 
            return true;
        return isIdentiacalTrees(parent.left, child)
		      || isIdentiacalTrees(parent.right, child);
    }	
 public boolean isIdentiacalTrees(Node root1, Node root2){
		if((root1==null)&&(root2==null)){
			return true;
		}else if((root1!=null && root2==null)||(root1==null && root2!=null)){
			return false;
		}else if(root1.data==root2.data){
			return isIdentiacalTrees(root1.left, root2.left)
					&& isIdentiacalTrees(root1.right, root2.right);
		}else{
			return false;
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
		
		Node subRoot = new Node(20);
		subRoot.left = new Node(40);
		subRoot.right = new Node(50);

		SubTree obj  = new SubTree();
		System.out.print("\nIs Second Tree is Subtree of First? ");
		System.out.print(obj.isValidSubTree(root,subRoot));
		
	}
}
class Node {
	int data;
	Node left;
	Node right;
	public Node(int data) {
		this.data = data;
  }
}


