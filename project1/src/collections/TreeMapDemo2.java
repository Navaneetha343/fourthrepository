package collections;
import java.util.Comparator;
import java.util.TreeMap;
public class TreeMapDemo2 {
public static void main(String[] args) {
	TreeMap<String, Integer> I = new TreeMap<>(new MyComparator2());
		I.put("Ajay", 30);
	    I.put("Navaneetha", 20);
	     I.put("Ammu", 10);
System.out.println(I);
}
}
class MyComparator2 implements Comparator<Object> {
	


@Override
public int compare(Object o1, Object o2) {
	// TODO Auto-generated method stub
	String s1= o1.toString();
	String s2= (String)o2;
	return -s2.compareTo(s1);
}
}
