import java.util.Stack;

public class MinStack2 extends Stack<Integer>{

	private static final long serialVersionUID = 1L;
	
	private Stack<Integer> stack2;
	
	public MinStack2(){
		this.stack2 = new Stack<>();
	}
	
	@Override
	public Integer push(Integer i){
		
		if(i<min()){
			stack2.push(i);
		}
		
		super.push(i);
		
		return i;
	}
	
	public Integer pop(){
		
		int value = super.pop();
		
		if(value==min()){
			stack2.pop();
		}
		
		return value;
		
	}
	


	public Integer min() {
		
		if(stack2.isEmpty()){
			return Integer.MAX_VALUE;
		}else{
			return stack2.peek();
		}
	}
}
