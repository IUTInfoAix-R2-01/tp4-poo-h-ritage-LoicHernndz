package Yaip4.ex6;

public class Cat extends Mammal{

	public Cat(String name) {
		super(name);
	}
	
	public void greets() {
		System.out.println("Meow");
	}

	@Override
	public String toString() {
		return "Cat [" + super.toString() + "]";
	}

	public static void main(String[] args) {
		
		Cat cat1 = new Cat("Chat");
		
		System.out.println(cat1);
		cat1.greets();

	}

}
