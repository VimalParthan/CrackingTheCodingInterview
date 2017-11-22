
public class Animal implements Comparable<Animal>{
	

	protected String name;
	
	protected Integer serialId;
	
	@Override
	public String toString() {
		return this.name;
	}
	
	
	public Integer getSerialId(){
		return this.serialId;
	}

	public void setSerialId(int i){
		this.serialId = i;
	}

	@Override
	public int compareTo(Animal o) {
		
		return this.serialId.compareTo(o.serialId);
	}

}
