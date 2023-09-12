package assignment.programs;

public class EvenNumbersAndItsPossitions {
	public static void msin(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		{

			for (int i = 2; i < arr.length; i++) {
				if (arr[i] / 2 == 0) {
					System.out.println(arr[i]);
				}

			}
		}
	}
}
