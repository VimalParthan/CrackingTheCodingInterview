import java.util.EmptyStackException;

public class MultiStack {
	
	private int stackCapacity;
	private int [] stackValues;
	private int [] sizes;
	private int numberOfStacks = 3;
	
	
	public MultiStack(int stackCapacity){
		
		this.stackCapacity = stackCapacity;
		this.stackValues = new int[stackCapacity*numberOfStacks];
		this.sizes = new int[numberOfStacks];
		
	}
	
	
	
	public void push(int stackNumber,int value) throws FullStackException{
		if(isFull(stackNumber)){
			throw new FullStackException("The Stack is full");
		}
		
		int lastIndex = lastIndex(stackNumber);
		stackValues[lastIndex+1]= value;
		sizes[stackNumber]++;
		
	}
	
	public int pop(int stackNumber) throws EmptyStackException{
		
		if(isEmpty(stackNumber)){
			throw new EmptyStackException();
		}
		
		int lastIndex = lastIndex(stackNumber);
		int value = stackValues[lastIndex];
		stackValues[lastIndex] =0; 
		sizes[stackNumber]--;
		return value;
	}
	
	public int peek(int stackNumber) throws EmptyStackException{
		
		if(isEmpty(stackNumber)){
			throw new EmptyStackException();
		}
		
		int lastIndex = lastIndex(stackNumber);
		int value = stackValues[lastIndex];
		return value;
	}



	private boolean isEmpty(int stackNumber) {
		
		if(sizes[stackNumber]==0)
			return true;
		
		return false;
	}



	private int lastIndex(int stackNumber) {
		
		int offset = stackNumber*stackCapacity;
		int stackSize = sizes[stackNumber];
		
		return offset+stackSize-1;
	}



	private boolean isFull(int stackNumber) {
		
		if(sizes[stackNumber]==stackCapacity)
			return true;
		
		return false;
	}

}
