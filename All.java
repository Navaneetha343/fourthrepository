public class All {
	
		int id;
		}
		class Bb {
		}
		 class Demo {
			
			All method1(Bb x) {
			
				return new All();
			}

			public static void main(String[] args) {
				
				 Demo d = new Demo();
				
				 Bb b= new Bb();
				
				 All a =d.method1(b);
				 System.out.println(a.id);
				 
			}
		}