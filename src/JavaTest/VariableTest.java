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
		int j = ++i + i++ + ++i + ++i + i++; // 2 2 4 5 5 594 502 1535
		System.out.println(j);
		return 0;
	}
	
	public static int test6 () {
		int i = 1;
		boolean b = !(i++ == 3) ^ (i++ == 2) && (i++ == 3);
		System.out.println(b); // f
		System.out.println(i); // 3
		return 0;
	}
	
	public static int test7 () {
		int i = 3; // 11
		int j = 2; // 10
		// 11 10 01 0100
		int c = ((i|j)^(i&j)) << 1 >>> 1;
		System.out.println(c); // f
		i = 1;
		i += i++;
		System.out.println(i); // f
		return 0;
	}
	
	public static void test8 () {
		tip:
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " " + j);
				if (0 == j % 5)
					break tip;
			}
		}
	}
	
	public static void test9 () {
		for (int i = 0; i < 9; i++) {
			for (int j = 6; j < 15; j++) {
				if ((14 == i + j) && (8 == j - i)) {
					System.out.println("result is " + i + " " + j);
				}
			}
		}
	}
	
	public static void main (String[] args) {
		test9();
	}
}
