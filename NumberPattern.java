/* Number Pattern
Input: n = 5
Output:

1
12
123
1234
12345 */


import java.util.*;
public class NumberPattern{
       public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the number : ");
                int n = sc.nextInt();

                int x = 1;

                while(x<=n){
                        int y = 1;
                        while(y<=x){
                                System.out.print(y);
                                y++;
                        }
                        System.out.println("");
                        x++;
                        sc.close();
                }
       }
}