
class H {
	int x;
	
	public void hello() {
		int j = 0;
		
		System.out.println(j);
	}
}

public class CheckVarNamesErrors {
	
	public static void main(String[] args) {
		H hon = new H();
		
		
		System.out.println(hon.x);
		hon.hello();
		
	}

}
