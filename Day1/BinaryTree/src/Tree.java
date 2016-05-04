
public class Tree {
	
	Node root;
	
	public void addNode(int value, String name){
		Node newNode = new Node(value, name);
		
		if (root == null)
			root = newNode;
		else{
			Node focusNode = root;
			Node parent;
			while (true)
			{
				parent = focusNode;
				if (value < focusNode.value)
					focusNode = focusNode.leftChild;
				if (focusNode == null){
					parent.leftChild = newNode;
					return ;
				}
				else 
					focusNode = focusNode.rightChild;
				if (focusNode== null){
					parent.rightChild = newNode;
					return ;
				}
			}
		}
}

	public static void inOrderTraverse(Node focusNode){
		if (focusNode != null){
			inOrderTraverse(focusNode.leftChild);
			System.out.println(focusNode);
			inOrderTraverse(focusNode.rightChild);
		}
	}
	
	public static void preOrderTraverse(Node focusNode){
		if (focusNode != null){
			System.out.println(focusNode);
			preOrderTraverse(focusNode.leftChild);
			preOrderTraverse(focusNode.rightChild);
		}
	}
	

	public static void postOrderTraverseTree(Node focusNode){
		if (focusNode != null){
			postOrderTraverseTree(focusNode.leftChild);
			postOrderTraverseTree(focusNode.rightChild);
			System.out.println(focusNode);
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree tree = new Tree();
		
		tree.addNode(13, "UNU");
		tree.addNode(50, "DOI");
		tree.addNode(44, "TREI");
		tree.addNode(1, "PATRU");
		tree.addNode(17, "CINCI");
		postOrderTraverseTree(tree.root);
	}

}
