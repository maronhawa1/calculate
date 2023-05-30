package freelancer;

import java.util.Scanner;

public class cal {
public static void calculator() {
	int num1, num2;
	char ch1='*';
	Scanner in = new Scanner(System.in);
	System.out.println("Enter your calculation: ");
	num1=in.nextInt();
	ch1=in.next().charAt(0);
	num2=in.nextInt();
	switch(ch1) {
	case '*':
		System.out.print("The result is "+num1*num2);
		break;
	case '+':
		System.out.print("The result is "+num1+num2);
		break;
	case '-':
		System.out.print("The result is "+(num1-num2));
		break;
	case '/':
		System.out.print("The result is "+num1/num2);
		break;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator();
	}

}
