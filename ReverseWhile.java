/* Reverse a Number
Input 1234 → Output: 4321. */


import java.util.*;
public class ReverseWhile{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Number : ");
                int n = sc.nextInt();

                int r = 0;

                while(n>0){
                        int i = n%10;
                        r = r*10+i;
                        n=n/10;
                }
                System.out.println(r);
                sc.close();
        }
}