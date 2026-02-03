/* Largest of Three Numbers
Input three numbers and print the largest among them. */

import java.util.*;
public class largest{
        public static void main(String args[]){
                Scanner sc = new Scanner (System.in);
                System.out.print("Enter the number for A : " );
                int A = sc.nextInt();
                System.out.print("Enter the number for B : ");
                int B = sc.nextInt();
                System.out.print("Enter the number for C : ");
                int C = sc.nextInt();

                if(A > B && A > C){
                        System.out.println("A is greater");
                }
                else if (B>A && B>C){
                        System.out.println("B is greater");
                }
                else if (C>A && C>B){
                        System.out.println("C is greater");
                }
                else{
                        System.out.println("All are equal");
                }
        }
}