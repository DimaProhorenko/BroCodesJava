
public class IfStatements {
	public static void main(String[] args) {
		int age = 75;
		
		if (age >= 18 && age < 75) {
			System.out.println("Here's your beer. Cheers!");
		} else if (age >= 75) {
			System.out.println("Oh you've got yourself a free beer.");
		}
		else {
			System.out.println("Nope, no beer for you. You can have our best ice cream or soda.");
		}
	}
}
