package _06_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	
	void quack() {
		System.out.println("I have " + numberOfFriends + " friends");
	}
	
	void waddle() {
		System.out.println("Waddle waddle waddle waddle and he waddled away!");
	}
	
	Duck(String favoriteFood, int numberOfFriends) {
      	this.favoriteFood = favoriteFood;
      	this.numberOfFriends = numberOfFriends;
	}
}
