import java.util.ArrayList;
import java.util.List;

public class Node<T> {
	
	private T data;
	private List<Node<T>> adjacentNodes;
	private boolean visited;
	
	
	
	public Node(T data) {
		super();
		this.data = data;
		this.adjacentNodes = new ArrayList<>();
	}
	
	public T getData() {
		return data;
	}
	public List<Node<T>> getAdjacentNodes() {
		return adjacentNodes;
	}
	
	public void addAdjacentNode(Node<T> node){
		this.adjacentNodes.add(node);
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	
}
