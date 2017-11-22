
public class Cat extends Animal{


	@Override
	public void setSerialId(int i) {
		super.setSerialId(i);
		this.name="Cat-"+i; 
	}
	
}
