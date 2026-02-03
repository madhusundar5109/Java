/* Largest of Two Numbers
Input two numbers and print which one is larger. */

import java.util.*;

public class larger{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Value for A : ");
                int A = sc.nextInt();
                System.out.print("Enter the value of B : ");
                int B = sc.nextInt();

                if(A>B){
                        System.out.println( "A is Greater");
                }
                else if (B>A){
                        System.out.println( "B is Greater");
                }
                else{
                        System.out.println( "Both Numbers are equal");
                }
        }
}