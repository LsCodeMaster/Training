/**
 * 
 */
package polyAbsPackage;

/**
 * @author ilisze
 * 
 */
public class HR {
	public Employee recruit(String empType) {
		if (empType.equals("F")) {
			return new FullTime();
		} else if (empType.equals("I")) {
			return new Intern();
		} else if (empType.equals("C")) {
			return new Contract();
		} else
			return null;
	}
	public float avarageSalary(int[]... nums){
		int sum = 0;
		for (int x[] : nums){
			for (int xyVal: x){
				sum += xyVal;
			}
		}
		return ((float) sum) / nums.length;
	}
}