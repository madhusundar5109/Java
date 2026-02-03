/* Count Digits of a Number
Input 12345 → Output: 5 digits. */


import java.util.*;
public class DigitsWhile{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number : ");
                int n = sc.nextInt();

                int d = 0;
                int i = 1;

                while (n>=1){
                        d=d+1;

                        n=n/10;
                }
                System.out.println("output: " + d + " digits");
        }
}