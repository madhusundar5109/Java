/* Count Digits of a Number
Input 12345 → Output: 5 digits. */

import java.util.*;

public class DigitsFor{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Number : ");
                //int n = sc.nextInt();

                int d = 0;

                for(int n=sc.nextInt(); n>=1; n=n/10){
                        d=d+1;
                }
                System.out.println("Output : "+d+" digits");
                sc.close();
        }
}