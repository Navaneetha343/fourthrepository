package callingMethods;

public class Addition {
	int T;
	public static void main(String[] args) {
		Addition add1 = new Addition();
  		add1.disply();
		System.out.println("Total salary of employee is " + add1.T);
	}

	public void disply() {

		int empSalary = 20000;
		int empIncentives = 5000;
		int shiftAllowances = 4000;
		T = (empSalary + empIncentives + shiftAllowances);
		
	}

}
