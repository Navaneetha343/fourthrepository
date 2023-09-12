package collections;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDem {
	public static void main(String[] args) {
		TreeMap<String, Integer> I = new TreeMap(new  MyComparator1());
		
		I.put("hi", 10);
		I.put("aaa", 30);
		I.put("bb", 20);
		I.put("cc", 40);
		System.out.println(I);
	}

}
class MyComparator1 implements Comparator<Object>{

	

	@Override
	public int compare(Object o1, Object o2) {
		String s1= o1.toString();
		String s2= o2.toString();
		return -s2.compareTo(s1);
		 
	}}
                                                                                                        