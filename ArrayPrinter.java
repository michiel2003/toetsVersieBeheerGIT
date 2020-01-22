
public class ArrayPrinter {
		
	public static void main(String args[]) {
		int[] array = {12, 5, 4, 8, 9};
		ArrayPrinter exec = new ArrayPrinter();
		exec.printarray(array);
	}
	
	public void printarray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
}
