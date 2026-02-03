/* Sum of Natural Numbers
Input n → print the sum of numbers from 1 to n.
Example: n=5 → Output: 15 */


import java.util.*;
public class NaturalNumWhileDo{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a Natural Number : ");
                int n = sc.nextInt();

                int i=1;
                int t=0;

                do{
                        t=t+i;
                        i++;
                }while (i<=n);
                System.out.println("The Total Value is " + t);
                sc.close();
        }
}