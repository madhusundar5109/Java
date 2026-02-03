/* Simple Calculator using Switch Case
Input two numbers and an operator (+, -, *, /, %) — perform the chosen operation. */

import java.util.*;
public class Calculator{
        public static void main(String args[]){
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the value of A : ");
                int A = sc.nextInt();
                System.out.print("Enter the value of B : ");
                int B = sc.nextInt();
                char ops;
                System.out.print("Enter an operator (+, -, *, /): ");
                ops = sc.next().charAt(0);
                System.out.println("You entered the operator: " + ops);

                switch(ops) {
                        case '+' :
                                System.out.println("The Addition of A + B = " + (A+B));
                                break;
                        case '-' :
                                System.out.println("The Substraction of A - B = " + (A-B));
                                break;
                        case '*' :
                                System.out.println("The Multiplication of A * B = " + (A*B));
                                break;
                        case '/' :
                                System.out.println("The Division of A / B = " + (A/B));
                                break;
                        case '%' :
                                System.out.println(" A % B = " + (A%B));
                                break;
                }
        }
}