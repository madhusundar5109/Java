/* Sum of Digits
Input 5432 → Output: 14.*/

import java.util.*;
public class SumDigitsWhileDo{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Number : ");

                int n = sc.nextInt();

                int s = 0;
                do{
                        int i = n%10;
                        s=s+i;

                        n=n/10;
                }while(n>0);
                System.out.println("Output : "+s);
                sc.close();
        }
}