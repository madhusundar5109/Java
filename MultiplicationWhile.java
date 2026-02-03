/* Multiplication Table
Input a number → print its multiplication table up to 10. */


import java.util.*;
public class MultiplicationWhile{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Number : ");
                int n = sc.nextInt();

                int m = 1;
                int i=1;

                while(i<=10){
                        m=n*i;
                        System.out.println(n + "*" + i + "=" + m);
                        i++;
                }
                sc.close();
        }
}