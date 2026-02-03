/* Swap Two Numbers --
Take two variables and swap their values without using a third variable. */

import java.util.*;

public class swap{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Please enter the number of A : " );
                int A = sc.nextInt();
                System.out.print("please enter the number of B : " );
                int B = sc.nextInt();

                A = A+B;

                B = A-B;

                A = A-B;

                System.out.println("The Value of A : " + A);
                System.out.println("The Value of B : " + B);
        }
}