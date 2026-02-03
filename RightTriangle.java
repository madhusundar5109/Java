Input: n = 5
Output:

*
**
***
****
*****
 */


import java.util.*;
public class RightTriangle{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Number : ");
                int n = sc.nextInt();

                int x= 1;


                while(x<=n){
                        int y=1;
                        while(y<=x){
                                System.out.print("*");
                                y++;
                        }
                        System.out.println();
                        x++;
                }
        }
}