
public class Dog extends Animal{

	@Override
	public void setSerialId(int i) {
		super.setSerialId(i);
		this.name="Dog-"+i; 
	}
	

}
