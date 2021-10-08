package metrics;

public class Die {

	//Variables declaration
	public String type;
	public int noOfSides;
	public int currentSideUp;

	//constructor to roll the dice
	public Die() {
		this.noOfSides = 6;
		this.type = "d6";
		this.roll();
	}
	//constructor to roll the dice
	public Die(int noOfSides) {
		this.type = "d"+noOfSides;
		this.noOfSides = noOfSides;
		this.roll();
	}
	//constructor to roll the dice
	public Die(String type, int noOfSides) {
		this.type = type;
		this.noOfSides = noOfSides;
		this.roll();
	}
	//Method that returns nothing and using Math.random
	public void roll()
	{
		this.currentSideUp=((int)(Math.random()*(this.noOfSides-1))+1);
	}
}

