package mappingFunctions;

import java.util.Arrays;
import java.util.List;

public class MappingFunctionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<Integer> num= Arrays.asList(1,2,3,4,5);
       List<Integer> names=Arrays.asList(6,7,8,9);
      List<List<Integer>> newData= Arrays.asList(num,names);
     // newData.stream().forEach(System.out::println);
	newData.stream().flatMap(d->d.stream()).forEach(System.out::println);
	
	}

}
