package callingMethods;

public class CallingMethods {
	
		int id;
		int roll;
		static String name;
		static int count = 0;

		public CallingMethods() {
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

			CallingMethods rfs1 = new CallingMethods();
			rfs1.id = 20;

			CallingMethods rfs2 = new CallingMethods();

			CallingMethods rfs3 = new CallingMethods();
			rfs3.id = 1;
			rfs3.roll = 5;
			run();
			rfs3.disply();
			System.out.println(j);
			rfs2.disply(2, 1);
			System.out.println("Number of objects created are " + count);
		}
	}

