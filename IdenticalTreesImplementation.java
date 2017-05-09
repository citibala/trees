
package algorithms.trees;

public class IdenticalTreesImplementation {

	public boolean isIdentiacalTrees(Node root1, Node root2){
		if((root1==null)&&(root2==null)){
			return true;
		}else if((root1!=null && root2==null)||(root1==null && root2!=null)){
			return false;
		}else if(root1.data==root2.data){
			return isIdentiacalTrees(root1.left, root2.left) && isIdentiacalTrees(root1.right, root2.right);
		}else{
			return false;
		}
	}
	public static void main(String args[]){
		
		Node root1 = new Node(10);
		root1.left = new Node(20);
		root1.right = new Node(30);
		root1.left.left = new Node(40);
		root1.left.right = new Node(50);
		root1.right.left = new Node(60);
		root1.right.right = new Node(70);
		
		Node root2 = new Node(10);
		root2.left = new Node(20);
		root2.right = new Node(30);
		root2.left.left = new Node(40);
		root2.left.right = new Node(50);
		root2.right.left = new Node(60);
		root2.right.right = new Node(70);
		
		IdenticalTreesImplementation obj=new IdenticalTreesImplementation();
		System.out.println("Is Identical Trees? "+obj.isIdentiacalTrees(root1, root2));
	}
}
