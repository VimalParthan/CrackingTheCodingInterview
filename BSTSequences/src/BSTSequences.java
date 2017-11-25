import java.util.ArrayList;
import java.util.LinkedList;

public class BSTSequences {
	
	public ArrayList<LinkedList<Integer>> allSequences(Node node){
		
		ArrayList<LinkedList<Integer>> result = new ArrayList<>();
	
		if(node==null){
			result.add(new LinkedList<>());
			return result;
		}
		
		LinkedList<Integer> prefix = new LinkedList<>();
		prefix.add(node.getData());
		
		
		ArrayList<LinkedList<Integer>> first = allSequences(node.getLeft());
		ArrayList<LinkedList<Integer>> second = allSequences(node.getRight());
		
		for(LinkedList<Integer> listOne: first){
			for(LinkedList<Integer> listTwo:second){
				ArrayList<LinkedList<Integer>>weaved = new ArrayList<>();
				
				weaved(listOne,listTwo,weaved,prefix);
				result.addAll(weaved);
			}
		}
		return result;
	}

	private void weaved(LinkedList<Integer> first,
			LinkedList<Integer> second, ArrayList<LinkedList<Integer>> results, LinkedList<Integer> prefix) {
		if(first.size()==0||second.size()==0){
			LinkedList<Integer> result = (LinkedList<Integer>) prefix.clone();
			result.addAll(first);
			result.addAll(second);
			results.add(result);
			return;
		}
		int headFirst = first.removeFirst();
		prefix.addLast(headFirst);
		weaved(first, second, results, prefix);
		prefix.removeLast();
		first.addFirst(headFirst);
		
		int headSecond = second.removeFirst();
		prefix.addLast(headSecond);
		weaved(first, second, results, prefix);
		prefix.removeLast();
		second.addFirst(headSecond);
		
		
	}

}
