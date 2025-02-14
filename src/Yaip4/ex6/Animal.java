package Yaip4.ex6;

public class Animal {
	
	private String name;
	
	public Animal(String name) {
		this.name = name;
	}

	public String toString() {
		return "Animal[name=" + name + "]";
	}

	public static void main(String[] args) {

		Animal animal = new Animal("Python");
		
		System.out.println(animal);
	}
}
