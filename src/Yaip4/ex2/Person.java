package Yaip4.ex2;

public class Person {

	private String name;
	private String address;
	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return "Person[name=" + name + ",address=" + address + "]";
	}
	
	public static void main(String[] args) {
		Person person = new Person("Loic", "2, Rue du Boulevard");
		
		System.out.println(person);
		
		person.setAddress("3, Rue du Boulevard");
		
		System.out.println("\nNom : " + person.getName());
		System.out.println("Adresse : " + person.getAddress());
	}

}
