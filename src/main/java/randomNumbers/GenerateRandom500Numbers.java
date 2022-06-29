package randomNumbers;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

import org.testng.annotations.Test;

public class GenerateRandom500Numbers {

	@Test
	public void generateRandomNumber() {
		
		System.out.println("Give me a number");
		Scanner userNumber= new Scanner(System.in);
		int userNum = userNumber.nextInt( );
		Set<Integer>mySet = new TreeSet<Integer>();
		while(mySet.size( ) !=500){
		mySet.add(ThreadLocalRandom.current().nextInt(userNum, 1000+1));
		}
		Object [ ] mySetArray = mySet.toArray( );
		System.out.println("The smallest random number is: " + mySetArray[0]);
		}

}
