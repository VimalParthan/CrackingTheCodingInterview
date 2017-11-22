import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class PlateStacks {
	
	private  List<Stack<Integer>> stacks;
	private int numOfStacks;
	private int stackCapacity;
	
	public PlateStacks(int stackCapacity){
		stacks = new ArrayList<>();
	}
	
	public void push(Integer i){
		if(stacks.isEmpty()){
			stacks.add(new Stack<Integer>(stackCapacity));
			numOfStacks++;
		}
		
		Stack<Integer> stack=stacks.get(stacks.size()-1);
		
		if(!stack.isFull()){
			stack.push(i);
		}else{
			stacks.add(new Stack<>(stackCapacity));
			stack = stacks.get(stacks.size()-1);
			stack.push(i);
		}
	}
	
	public Integer pop(){
		
		if(stacks.isEmpty())
			throw new EmptyStackException();
		else{
			Integer i = stacks.get(numOfStacks).pop();
			if(stacks.get(numOfStacks).size==0){
				stacks.remove(stacks.size()-1);
				numOfStacks--;
			}
			return i;
		}
	}
	
	public Integer popAt(int index){
		
		if(stacks.size()<index){
			throw new IndexOutOfBoundsException();
		}
		
		return leftShift(index,true);
	}

	private Integer leftShift(int index,boolean removeTop) {
		Stack<Integer> stack = stacks.get(numOfStacks);
		int removed_item;
		if(removeTop) removed_item = stack.pop();
		else removed_item = stack.removeBottom();
		if(stack.isEmpty()){
			stacks.remove(numOfStacks);
			numOfStacks--;
		}else if(stacks.size()>index+1){
			int v = leftShift(index+1,false);
			stack.push(v);
		}
		
		return removed_item;
	}

}
