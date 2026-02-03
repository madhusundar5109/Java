/* Sum of Digits
Input 5432 → Output: 14. */


import java.util.*;
public class SumDigitsFor{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number : ");

                int s = 0;
                for(int n = sc.nextInt(); n>0; n=n/10){
                        int i=n%10;
                        s=s+i;
                }
                System.out.println("Output : "+s);
                sc.close();
        }
}