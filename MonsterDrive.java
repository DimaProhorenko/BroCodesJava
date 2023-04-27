
class Monster {
	boolean frighten(int degree) {
		System.out.println("arrrrgh");
		return true;
	}
}

class Vampire extends Monster {
	boolean frighten(int degree) {
		System.out.println("A bite?");
		return true;
	}
}

class Dragon extends Monster {
	boolean frighten(int degree) {
		System.out.println("Breath fire");
		return true;
	}
}


public class MonsterDrive {

	public static void main(String[] args) {
		Monster[] monstersArr = {new Vampire(), new Dragon(), new Monster()};
		
		for (Monster monster : monstersArr) {
			monster.frighten(1);
		}

	}

}
