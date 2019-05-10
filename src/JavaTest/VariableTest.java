package JavaTest;

import java.util.Scanner;

public class VariableTest {
	public static int test1 () {
		double a = 2.0;
		double r = 0.0;
		for (int i = 0; i < 22; i++) {
			r += Math.pow(a, 127 - i);
		}
		System.out.println(r);
		return 0;
	}
	
	int i = 1;
	public static int test2 (int i) {
		System.out.println(i);
		return 0;
	}
	
	public static int test3 (final int i) {
		System.out.println(i);
		return 0;
	}
	
	public static int test4 () {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		String n = scanner.nextLine();
		int b = scanner.nextInt();
		System.out.println(a + b);
		return 0;
	}
	
	public static int test5 () {
		int i = 1;
		int j = ++i + i++ + ++i + ++i + i++; // 2 2 4 5 5 
		System.out.println(j);
		return 0;
	}
	
	public static void main (String[] args) {
		test5();
	}
}
