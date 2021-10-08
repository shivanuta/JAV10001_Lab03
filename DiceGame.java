/*Student name : Prathyusha Peddireddy
Id : A00245208

Student name : Kavya Chapparapu 
 Id : A00246628

Student name : Shiva Rama krishna
Id : A00245380 */

package metrics;
//importing custom class
import metrics.Die;
public class DiceGame {
	public static void main(String args[])
	{
		System.out.println("Creating a default d6");
		//create an object using constructor
		Die obj1 = new Die();
		System.out.println("Creating a  d20");

		//create an object using constructor
		Die obj2 = new Die(20);
		System.out.println("Creating a Percentile die (a special d10)");

		//create an object using constructor
		Die obj3 = new Die("Percentile",10);

		//Display results
		System.out.println("The current side up for "+obj1.type+" is "+obj1.currentSideUp);
		System.out.println("The current side up for "+obj2.type+" is "+obj2.currentSideUp);
		System.out.println("The current side up for "+obj3.type+" is "+obj3.currentSideUp);
		System.out.println("Rolling the "+obj1.type+"...");
		obj1.roll();
		System.out.println("The new value is "+obj1.currentSideUp);
		System.out.println("Rolling the "+obj2.type+"...");
		obj2.roll();
		System.out.println("The new value is "+obj2.currentSideUp);
		System.out.println("Rolling the "+obj3.type+"...");
		obj3.roll();
		System.out.println("The new value is "+obj3.currentSideUp);
		System.out.println("Creating 5 d6...");
		Die dice1 = new Die();
		Die dice2 = new Die();
		Die dice3 = new Die();
		Die dice4 = new Die();
		Die dice5 = new Die();

		int counter=0;
		while(!((dice1.currentSideUp == dice2.currentSideUp) && (dice2.currentSideUp == dice3.currentSideUp) && (dice3.currentSideUp ==  dice4.currentSideUp) && (dice4.currentSideUp ==  dice5.currentSideUp)))
		{
			counter++;
			dice1.roll();
			dice2.roll();
			dice3.roll();
			dice4.roll();
			dice5.roll();
		}
		//Bonus roll
		System.out.println("YAHTZEE! it took "+counter+" rolls");
	}
}
