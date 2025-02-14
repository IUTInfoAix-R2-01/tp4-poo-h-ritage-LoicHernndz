package Yaip4.ex2;

public class Staff extends Person {
	private String school;
	private double pay;
	
	public Staff(String name, String address, String school, double pay) {
		super(name, address);
		this.school = school;
		this.pay = pay;
	}
	
	public String getSchool() {
		return school;
	}
	
	public void setSchool(String school) {
		this.school = school;
	}
	
	public double getPay() {
		return pay;
	}
	
	public void setPay(double pay) {
		this.pay = pay;
	}
	
	@Override
	public String toString() {
		return "Staff[" + super.toString() + ", school=" + school + 
				", pay=" + pay + "]";
	}
	
	public static void main(String[] args) {
		Staff staff = new Staff("Loic", "2, Rue du Boulevard", "IUT Aix", 0.99);
		
		System.out.println(staff);
		
		staff.setSchool("AMU, IUT Aix");
		staff.setPay(0.98);
		
		System.out.println("\nNom : " + staff.getName());
		System.out.println("Adresse : " + staff.getAddress());
		System.out.println("Ecole : " + staff.getSchool());
		System.out.println("Revenue : " + staff.getPay());
	}
}

