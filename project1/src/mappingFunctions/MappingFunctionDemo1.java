package mappingFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class MappingFunctionDemo1 {
public static void main(String[] args) {
	List<String> carNames = Arrays.asList("bmw12","jeep23","land over","buick");
	carNames.stream().map(n->n.toUpperCase()).forEach(System.out::println);
}
}
