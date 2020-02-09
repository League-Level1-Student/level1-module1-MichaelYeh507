package _06_duck;

public class Dog {
	int numberOfFriends;
	String favoriteFood;
	
	void bark() {
		System.out.println("I have " + numberOfFriends + " friends");
	}
	
	void lick() {
		System.out.println("EWWWWWWWWWW");
	}
	
	Dog(String favoriteFood, int numberOfFriends){
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}
}
