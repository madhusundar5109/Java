/* Reverse a Number
Input 1234 → Output: 4321. */



import java.util.*;
public class ReverseWhileDo{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Please enter a Number : ");
                int n = sc.nextInt();

                int r = 0;

                do{
                        int i=n%10;
                        r=r*10+i;
                        n=n/10;
                }while(n>0);
                System.out.println("Output : "+ r);
        }
}