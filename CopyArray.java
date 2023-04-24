
import java.util.Arrays;

public class CopyArray {
	public static void main(String[] args) {
		String[] copyFrom = {"Affogato", "Americano", "Cappuccino", "Corretto","Dopio", "Espresso", "Frappucino", "Lungo", "Latte", "Amerifgo"};
		String[] copyTo = new String[7];
		
		System.arraycopy(copyFrom, 0, copyTo, 0, 7);
		
		
		String[] copyArr = Arrays.copyOfRange(copyFrom, 0, 3);
		String[] arr = Arrays.copyOfRange(copyFrom, 0, 4);
		String[] pizzaArr = new String[20];
		Arrays.fill(pizzaArr, "Pizza");
		
		Arrays.sort(copyFrom);
		
//		System.out.println(Arrays.toString(copyArr));
//		System.out.println(Arrays.binarySearch(copyArr, "jdsfj"));
//		System.out.println(Arrays.equals(copyArr, arr));
		System.out.println(Arrays.toString(copyFrom));
	}
}
