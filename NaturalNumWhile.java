/* Sum of Natural Numbers --
Input n → print the sum of numbers from 1 to n.
Example: n=5 → Output: 15 */


import java.util.*;
public class NaturalNumWhile{
        public static void main(String args[]){
                Scanner sc = new Scanner (System.in);
                System.out.print("Enter the Natural Number : ");
                int n = sc.nextInt();
                int i=1;
                int t=0;
                while(i<=n){
                        t = i+t;
                        i=i+1;
                        }
                System.out.println("The Output is " + t);
        }
}