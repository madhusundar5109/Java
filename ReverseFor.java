/* Reverse a Number
Input 1234 → Output: 4321. */


import java.util.*;
public class ReverseFor{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Number : ");


                int r = 0;

                for(int n = sc.nextInt(); n>1; n=n/10){
                        int i = n%10;
                        r=r*10+i;

                }
                System.out.println("Output : "+r);
        }
}