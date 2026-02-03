/* Factorial of a Number
Input a number → find its factorial using a loop.
Example: 5! = 120 */


import java.util.*;

public class FactorialNumberWhile{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number : ");
                int n = sc.nextInt();

                int i = 1;
                double f = 1;

                while(i<=n){
                        f = f*i;
                        i++;
                }
                System.out.println(n+"!"+"="+f);
                sc.close();
        }
}