//calling static and non-static methods and counting number of objects created. 
public class CallingMeethods {
	int id;
	int roll;
	static String name;
	static int count = 0;

	public CallingMeethods() {
		count++;
	}

	public static void run() {
		System.out.println(name);

	}

	public void disply() {
		System.out.println(id + " " + roll);

	}

	public void disply(int k, int l) {
		System.out.println(k + l);

	}

	public static void main(String[] args) {
		int j = 2;
		name = "navaneetha";

		CallingMeethods rfs1 = new CallingMeethods();
		rfs1.id = 20;

		CallingMeethods rfs2 = new CallingMeethods();

		CallingMeethods rfs3 = new CallingMeethods();
		rfs3.id = 1;
		rfs3.roll = 5;
		run();
		rfs3.disply();
		System.out.println(j);
		rfs2.disply(2, 1);
		System.out.println("Number of objects created are " + count);
	}
}
