/*Personal Details Input
Take input from the user: name, age, and city — then display them in a single formatted line.*/

import java.util.*;
public class Main {
  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        
		System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Please enter the city: ");
        String city = sc.nextLine();
        
       	System.out.println("Your name is"+name);
        System.out.println("Your age is"+age);
        System.out.println("Your city name is"+city);
  }
}
