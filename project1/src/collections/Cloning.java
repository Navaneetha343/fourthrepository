package collections;

public class Cloning implements Cloneable {
         //int i=10;
         //int j=20;
	   int j;
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
      Cloning a1 = new Cloning();
      int[] a= {1,2,3,4,5};
            Object object1 =a.clone();
            int[ ] b= (int[])object1;
      a1.j=10;
      Object object = a1.clone();
      Cloning a2 = (Cloning)object; 
      
      System.out.println(b[2]);
	}
	

}
