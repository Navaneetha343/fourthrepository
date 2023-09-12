package collections;
import java.util.Hashtable;
public class HaskTableDemoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Car, String> h = new Hashtable<>(); 
		h.put(new Car(1), "India");
		h.put(new Car(2), "China");
		h.put(new Car(3), "Japan");
		h.put(new Car(12), "India");
		System.out.println(h);
	}
 
}
