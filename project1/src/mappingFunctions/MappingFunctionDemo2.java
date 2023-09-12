package mappingFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;


public class MappingFunctionDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Student number1 = new Student("Navaneetha", 27, 1234);
   Student number2 = new Student("Akanksha", 25, 1235);
   Student number3 = new Student("Laxmipriya", 25, 1236);
   Student number4 = new Student("Ajay", 30, 1237);
   List<Student> data= Arrays.asList( number1, number2, number3, number4);
  
     data.stream().filter(n->n.age>25).map(n1->n1.name).forEach(System.out::println);
   
   
	}

}
