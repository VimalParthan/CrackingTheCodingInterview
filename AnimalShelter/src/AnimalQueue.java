import java.util.LinkedList;

public class AnimalQueue {
	
	private static Integer NUMBER_OF_ANIMALS = 0;
	
	private LinkedList<Dog> dogs = new LinkedList<>();
	
	private LinkedList<Cat> cats = new LinkedList<>();
	
	public void enqueu(Animal animal){
		animal.setSerialId(++NUMBER_OF_ANIMALS);
		if(animal instanceof Dog){
			dogs.add((Dog)animal);
		}else{
			cats.add((Cat)animal);
		}
	}
	
	public Animal dequeueAny(){
		
		if(dogs.size()==0){
			return cats.poll();
		}
		
		if(cats.size()==0){
			return dogs.poll();
		}
		
		return dogs.peek().getSerialId()<cats.peek().getSerialId()?dogs.poll():cats.poll();
	}
	
	public Cat dequeuCat(){
		return cats.poll();
	}
	
	public Dog dequeueDog(){
		return  dogs.poll();
	}
}
