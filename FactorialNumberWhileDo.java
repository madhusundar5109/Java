/* Factorial of a Number
Input a number → find its factorial using a loop.
Example: 5! = 120 */

import java.util.*;
public class FactorialNumberWhileDo{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Number : ");
                int n = sc.nextInt();

                int i = 1;
                double f = 1;

                do{
                        f = f*i;
                        i++;
                }while(i<=n);
                System.out.println(n+"!"+"="+f);
                sc.close();
        }
}