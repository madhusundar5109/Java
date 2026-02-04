*Simple Arithmetic Operations --
Take two integers as input and display the results of addition, subtraction, multiplication, and division.
*/

import java.util.*;

public class Arithmetic{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Please eneter the Number A : ");
                int A = sc.nextInt();
                System.out.print("Please eneter the Number B : ");
                int B = sc.nextInt();

                System.out.println("The Addition of two number are : "+ (A+B));
                System.out.println("The Substraction of two number are : "+ (A-B));
                System.out.println("The Multiplication of two number are : "+ (A*B));
                System.out.println("The Division of two number are : "+ (A/B));
        }
}