package randomNumbers;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ThreadLocalRandom;

import org.testng.annotations.Test;

public class GenerateRandom500Numbers {

	//@Test
	public void generateRandomNumber() {
	
		Set<Integer>mySet = new TreeSet<Integer>();
		while(mySet.size( )!=500){
		mySet.add(ThreadLocalRandom.current().nextInt(100, 1000+1));
		}
		Object [ ] mySetArray = mySet.toArray( );
		for(int i=0; i<mySetArray.length-1; i++) {
		System.out.print( " " + mySetArray[i]);
		}
		System.out.println();
		System.out.println("Which number you want to know?");
		Scanner userNumber= new Scanner(System.in);
		int userNum = userNumber.nextInt( );
		System.out.println("The " +userNum+"th smallest random number is: " + mySetArray[userNum - 1]);
		}
	
    @Test
	public void randomNumber() {
		Set<Integer>mySet2=new TreeSet<Integer>();
		while(mySet2.size()!=500) {
			Random rnd = new Random();
			mySet2.add(rnd.nextInt(900)+100);
			}
		Object[]mySet2Array= mySet2.toArray();
		for(int i=0; i<=500; i++) {
			System.out.print(" "+ mySet2Array[i]);
		}
		int thNum= 10;
		System.out.println("The " + thNum + "th smallest number is "+ mySet2Array[thNum-1]);
		
	}

}
