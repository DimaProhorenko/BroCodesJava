import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
	
	public static void printArray(String[] arr) {
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] friendsArray = {"John", "Mike", "Sam"};
		
		ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList(friendsArray));
		
		friendsArrayList.add("Andrew");
		
		friendsArrayList.remove("Mike");
		
		boolean containsMike = friendsArrayList.contains("Mike");
//		friendsArrayList.clear();
		
//		System.out.println(' ');
//		
//		System.out.println(friendsArrayList);
//		System.out.println(containsMike);
		
		friendsArray[1] = "Carl";
		
		friendsArrayList.set(1, "Carl");
		
		System.out.println(friendsArray[1]);
		
		System.out.println(friendsArrayList.get(1));
		

	}

}
