package Yaip4.ex6;

public class Dog extends Mammal{

	public Dog(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Woof");
	}
	
	public void greets(Dog another) {
		System.out.println("Woooof");
	}

	@Override
	public String toString() {
		return "Cat [" + super.toString() + "]";
	}

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("Chien");
		Dog dog2 = new Dog("Chhhien");
		
		System.out.println(dog1);
		dog1.greets();
		dog2.greets(dog1);

	}

}
