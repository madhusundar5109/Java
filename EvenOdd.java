/*Even or Odd Checker
Input a number and print whether it’s even or odd.
 */

import java.util.*;

public class EvenOdd{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Please enter a number A : ");
                int A = sc.nextInt();

                if (A%2==0){
                        System.out.println(A+" is even number");
                }
                else{
                        System.out.println(A+" is odd number");
                }
        }
}