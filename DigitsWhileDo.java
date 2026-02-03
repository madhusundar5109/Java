/* Count Digits of a Number
Input 12345 → Output: 5 digits. */


import java.util.*;

public class DigitsWhileDo{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Number : ");
                int n = sc.nextInt();

                int d = 0;

                do{
                        d=d+1;

                        n=n/10;
                }while(n>=1);
                System.out.println("output : "+d+" digits");
                sc.close();
        }
}