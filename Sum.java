//To find the sum using java program
package JavaPractice;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int a,b,sum;
		Scanner sc = new Scanner(System.in); //user input
		System.out.println("Enter the value of a: ");
		a = sc.nextInt();
		System.out.println("Enter the value of b: ");
		b = sc.nextInt();
		sum = a+b;
		sc.close();
		System.out.println("Sum of a and b: "+sum);

	}

}
