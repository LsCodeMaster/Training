package polyAbsPackage;

public class Intern extends Employee {
	public Intern() {
		super("Intern");
	}

	public void netSalary() {
		System.out.println("Intern Employee's Salary");
	}
	
	public void transport() {
		System.out.println("Intern, got me coffee!");
	}
}