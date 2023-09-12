package package1;

public class Summof22arrays {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int[] arr1 = { 10, 20, 30, 40, 50 };

		int sum = 0;

		int sumOfTwo = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}

		for (int j = 0; j < arr.length; j++) {
			sumOfTwo = sumOfTwo + arr1[j];
		}
		System.out.print(sum + sumOfTwo);

	}

}
