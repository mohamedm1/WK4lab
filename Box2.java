public class Box2 {

public int size = 0;
	
	public void printBox() {

		for (int i = 0; i<size; i++) { 
			for (int a = 0; a<size; a++) { 
			System.out.print("*");
	}
			System.out.println();
	}
}
		public void printbox(String string) {
			  for (int i = 0; i < size; ++i) {
		           for (int j = 0; j < size; ++j) {
		               System.out.print(string);
		}

			  }
		}
	
	
	public static void main(String[] args) {
	Box box= new Box();
	box.size = 5;
	box.printBox();

	
	System.out.println("output overloaded method, char as a\n");
	box.printbox("a");
}
