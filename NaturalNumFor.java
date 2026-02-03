/* Sum of Natural Numbers
Input n → print the sum of numbers from 1 to n.
Example: n=5 → Output: 15 */

import java.util.*;

public class NaturalNumFor{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Number : ");
                int n = sc.nextInt();

                int t = 0;

                for(int i=0; i<=n; i++){
                        t=t+i;
                }
                System.out.println("The total value is " + t);
                sc.close();
        }
}