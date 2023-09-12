package package1;

public class Subtraction {
	public static void main(String[] args) {
		int empSalary = 20000;
		int empIncentives = 5000;
		int shiftAllowances = 4000;
		int providentFound = 3000;
		int T = ((empSalary+empIncentives+shiftAllowances)-providentFound);
		System.out.println("Total salary of employee is" + T);
	}

}


