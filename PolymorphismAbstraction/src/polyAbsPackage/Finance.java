package polyAbsPackage;

public class Finance {
	public void processSalary(Employee e){
		e.netSalary();
		if (e instanceof FullTime){
			FullTime ft = (FullTime) e;
			ft.transport();
		}
		if (e instanceof Intern){
			Intern intrn = (Intern) e;
			intrn.transport();
		}
	}
}