/* Factorial of a Number
Input a number → find its factorial using a loop.
Example: 5! = 120 */



import java.util.*;
public class FactorialNumberFor{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Numbers : ");
                int n = sc.nextInt();

                double f = 1;

                for(int i = 1; i<=n; i++){
                        f=f*i;
                }
                System.out.println(n+"!"+"="+f);
                sc.close();
        }
}