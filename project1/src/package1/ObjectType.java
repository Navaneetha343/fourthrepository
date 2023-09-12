package package1;
import package1.Employee;
public class ObjectType {
	
	public static void main(String[] args) {
		
Employee obj = new Employee();

if(obj instanceof Employee) { System.out.println("yes");
}
else {System.out.println("Wrong");
}

}
}
