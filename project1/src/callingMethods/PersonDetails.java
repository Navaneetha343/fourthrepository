package callingMethods;

class Test1 {

	private String Name;
	private int Roll;
	private int Age;
	
	public int getAge() {
		return Age;
	}
	public String getName() {
		return Name;
	}
	public int getRoll() {
		return Roll;
	}
	public void setAge(int newAge) {
		Age = newAge;
	}
	public void setName(String newName) {
		Name = newName;
	}
	public void setRoll(int newRoll) {
		Roll = newRoll;
	}
}
public class PersonDetails {
	public static void main(String[] args) {
		Test1 obj = new Test1();

		obj.setName("Navaneetha");
		obj.setAge(27);
		obj.setRoll(51);

		System.out.println("Name " + obj.getName());
		System.out.println("Age " + obj.getAge());
		System.out.println("Roll no " + obj.getRoll());

	}
}
