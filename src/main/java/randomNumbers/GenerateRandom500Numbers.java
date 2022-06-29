package randomNumbers;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

import org.testng.annotations.Test;

public class GenerateRandom500Numbers {

	@Test
	public void generateRandomNumber() {
	
		Set<Integer>mySet = new TreeSet<Integer>();
		while(mySet.size( ) !=500){
		mySet.add(ThreadLocalRandom.current().nextInt(100, 1000+1));
		}
		Object [ ] mySetArray = mySet.toArray( );
		for(int i=0; i<mySetArray.length-1; i++) {
		System.out.print( " " + mySetArray[i]);
		}
		System.out.println();
		System.out.println("Give me a number");
		Scanner userNumber= new Scanner(System.in);
		int userNum = userNumber.nextInt( );
		System.out.println("The smallest random number is: " + mySetArray[userNum - 1]);
		}

}
