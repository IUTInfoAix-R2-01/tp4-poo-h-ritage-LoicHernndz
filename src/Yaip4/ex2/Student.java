package Yaip4.ex2;

public class Student extends Person {
	private String program;
	private int year;
	private double fee;
	
	public Student(String name, String address, String program, int year, double fee) {
		super(name, address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	
	public String getProgram() {
		return program;
	}
	
	public void setProgram(String program) {
		this.program = program;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public double getFee() {
		return fee;
	}
	
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	@Override
	public String toString() {
		return "Student[" + super.toString() + ", program=" + program + 
				", year=" + year + ", fee=" + fee + "]";
	}
	
	public static void main(String[] args) {
		Student student = new Student("Loic", "2, Rue du Boulevard", "BUT Info", 1, 0.99);
		
		System.out.println(student);
		
		student.setProgram("BUT Informatique");
		student.setYear(2);
		student.setFee(1000000.99);
		
		System.out.println("\nNom : " + student.getName());
		System.out.println("Adresse : " + student.getAddress());
		System.out.println("Programme : " + student.getProgram());
		System.out.println("Annee : " + student.getYear());
		System.out.println("Montant : " + student.getFee());
	}
}
