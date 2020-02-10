import java.util.Scanner;
public class Calculator1 {
   public static void main(String[] args) {
      double a;
      double b;
      double ans;
      char operator;
      Scanner s = new Scanner(System.in);
      System.out.print("Enter two numbers: ");
    a = s.nextDouble();
      b= s.nextDouble();
      System.out.print("\nEnter an operator (+, -, *, /): ");
      operator= s.next().charAt(0);
      switch(operator) 
	{
         case '+': 
	ans = a + b;
            break;
         case '-': 
	ans = a - b;
            break;
         case '*': 
	ans = a * b;
            break;
         case '/': 
	ans = a / b;
            break;
         default:  
	System.out.printf("Error! Enter correct operator");
                    return;
      }
      System.out.print("\nThe result is given as follows:\n");
      System.out.printf(a + " " + operator + " " + b + " = " + ans);
   }
}
