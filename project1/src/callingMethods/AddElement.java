package callingMethods;

public class AddElement {
	static int[] temparr;

	public static void main(String[] args) {
		adding();

	}

	public static int[] adding() {
		int[] arr = { 1, 2, 2, 3, 4, 5 };
		 temparr = new int[arr.length + 1];

		int add = 6;
		for (int i = 0; i < arr.length; i++) {
			temparr[i] = arr[i];
		}
		temparr[arr.length] = add;
		for (int i = 0; i < temparr.length; i++) {
			System.out.println(temparr[i]);
		}
		return temparr;
	}
}
