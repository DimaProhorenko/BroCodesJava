
public class SwitchStatements {
	public static void main(String[] args) {
		String day = "Pizza";
		String message = "";
		
		switch(day) {
		case "Sunday": message = "Nope, you've got work today.";
		break;
		case "Wednesday": message = "I wish but no";
		break;
		case "Monday": message = "Finally, weekends.";
		break;
		default: message = "Ahhh, I don't even know what day it is";
		}
		
		System.out.println(message);
	}
}
