/* Sum of Digits
Input 5432 → Output: 14. */


import java.util.*;
public class SumDigitsWhile{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter your Number : ");

                int n = sc.nextInt();

                int s = 0;

                while(n>0){
                        int i = n%10;
                        s=s+i;
                        n=n/10;
                }
                System.out.println("Output : " + s);
                sc.close();
        }
}