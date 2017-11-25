import java.util.List;
import java.util.Stack;

public class TopologicalOrdering {
	
	private Stack<Node> nodeStack= new Stack<>();
	
	public boolean hasCyclicDependency = false;
	
	public void dfs(List<Node> nodes){
		System.out.println(nodes);
		for(Node node:nodes){
			if(!node.isVisited()&&!hasCyclicDependency){
				dfs(node);
			}
		}
	}

	private void dfs(Node node) {
		
		
		node.setBeingVisited(true);
		for(Node dependantNode:node.getAdjacentNodes()){
			if(dependantNode.isBeingVisited()){
				hasCyclicDependency=true;
				return;
			}
			if(!dependantNode.isVisited()){
				dfs(dependantNode);
			}
			
		}
		
		if(hasCyclicDependency){
			return;
		}
		
		node.setBeingVisited(false);
		node.setVisited(true);
	
		nodeStack.push(node);
		
	
	}
	
	public Stack<Node> topologicalOrder(){
		return this.nodeStack;
	}

}
