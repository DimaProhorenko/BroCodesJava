import java.util.Scanner;

public class StaticInitializer {
	static Scanner sc = new Scanner(System.in);
	static int b = sc.nextInt();
	static int h = sc.nextInt();
	static boolean flag = true;
	
	static {
		try {
			if (b <= 0 || h <= 0) {
				flag = false;
				throw new Exception("Breadth and height must be positive");
			} else {
				System.out.println(b * h);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	public static void main(String[] args) {
		
	}
}
