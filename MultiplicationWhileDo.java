/* Multiplication Table
Input a number → print its multiplication table up to 10. */


import java.util.*;
public class MultiplicationWhileDo{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number : ");
                int n = sc.nextInt();

                int i = 1;
                int m = 1;

                do{
                        m=n*i;
                        System.out.println( n + "*" + i + "=" + m);
                        i++;
                }while(i<=10);
                sc.close();
        }
}