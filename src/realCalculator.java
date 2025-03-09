
import java.util.Scanner;
public class realCalculator {
	
public static void main(String[] args)
{
int i;
double num1, num2;
		
try (Scanner sc = new Scanner(System.in)) {
System.out.println("Enter first number: ");

num1 =sc.nextDouble();

for(i=1;i<5;i++){
System.out.println("Enter next number: ");

num2 =sc.nextDouble();
System.out.println("Select operator (+,-,*,/,^)");

char op =sc.next().charAt(0);
double O = 0;

switch (op) {
case '+':O = num1 + num2;
break;

case '-':O = num1 - num2;
break;

case '*':O = num1 * num2;
				
break;
case '/':O = num1/num2;
break;

case '^': O = (num1+num2)*(num1 +num2);
break;
			
default: System.out.println("WRONG INPUT");
break;
}
			
System.out.print("THE FINAL RESULT IS :  ");
			
System.out.println( O );
			
System.out.println("Do you want to continue: ");
			
char d=sc.next().charAt(0);
if(d=='n'){
System.out.println("Thanks");
break;}
else if(d=='y'){
	num1=O;
}
else{
   System.out.println("something Went wrong");
	
    }	
   }
  }
 }
}
