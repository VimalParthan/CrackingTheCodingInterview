import java.util.ArrayList;
import java.util.List;

public class Node {
	
	private String data;
	private List<Node>adjacentNodes;
	private boolean visited;
	private boolean beingVisited;
	
	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public List<Node> getAdjacentNodes() {
		return adjacentNodes;
	}

	public void setAdjacentNodes(List<Node> adjacentNodes) {
		this.adjacentNodes = adjacentNodes;
	}

	public Node(String data) {
		this.data = data;
		this.adjacentNodes = new ArrayList<>();
	}
	
	public void addAjacentNode(Node node){
		this.adjacentNodes.add(node);
	}
	
	

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	public boolean isBeingVisited() {
		return beingVisited;
	}

	public void setBeingVisited(boolean beingVisited) {
		this.beingVisited = beingVisited;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (!data.equals(other.data))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return data;
	}
	

}
