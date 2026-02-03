/* Positive, Negative, or Zero --
Input an integer and determine if it is positive, negative, or zero. */

import java.util.*;

public class DefineInt{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Please enter the Integer number for A : ");
                int A = sc.nextInt();
                if (A>0){
                        System.out.println("Given Number is Positive");
                }
                else if (A<0){
                        System.out.println("Given Number is Negative");
                }
                else {
                        System.out.println("Given Number is Zero");
                }
        }
}