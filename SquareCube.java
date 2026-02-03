/* Square and Cube Finder --
Input a number and print its square and cube.
*/

import java.util.*;
public class SquareCube{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Please enter the Number of A : ");
                int A = sc.nextInt();

                System.out.println("The Square of A = " + (int) (Math.pow(A,2)));
                System.out.println("The Cube of A = " + (int) (Math.pow(A,3)));
        }
}