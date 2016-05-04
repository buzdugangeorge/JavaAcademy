
public class Node {
	int		value;
	String	name;
	
	Node leftChild;
	Node rightChild;
	
	Node(int value, String name){
		this.value = value;
		this.name = name;
	}
	public String toString(){
		return "Node name: " + name + "has value: " + value;
	}
}