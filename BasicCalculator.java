package JavaPractice;

import java.util.Scanner;

public class BasicCalculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a: "); //user input
		int a= sc.nextInt();
		System.out.println("Enter the value of b: ");
		int b= sc.nextInt();
		addNumbers(a,b);             //method calling
		multiplyNumbers(a,b);
		divideNumbers(a,b);
		subNumbers(a,b);

	}
	public static void addNumbers(int a,int b) {
		int sum = a+b;
		System.out.println("Sum is: "+sum);
	}
	public static void multiplyNumbers(int a,int b) {
		int mul= a*b;
		System.out.println("Multiplication is: "+mul);
	}
	public static void divideNumbers(int a,int b) {
		int divide = a/b;
		System.out.println("Division is: "+divide);
	}
	public static void subNumbers(int a,int b) {
		int sub = a-b;
		System.out.println("Subtraction is: "+sub);
	}

}
