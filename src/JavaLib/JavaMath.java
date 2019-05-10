package JavaLib;

public class JavaMath {
	public static void intListPrint(int[] l) {
		//	Char 类型可以和 String 类型运算，结果为 String 类型	
		char temp = (char) ('0' + (l[0]));
		String out = "[" + temp;
		for (int i = 1; i < l.length; i++) {
			temp = (char) ('0' + (l[i]));
			out = out + ", " + temp;
		}
		out += "]";
		System.out.println(out);
	}
	
	public static int intListMax(int[] l) {
		int max = l[0];
		for (int i = 1; i < l.length; i++) {
			if (l[i] > max) max = l[i];
		}
		return max;
	}
	
	public static double intListAvarage(int[] l) {
		int sum = l[0];
		for (int i = 1; i < l.length; i++) {
			sum += l[i];
		}
		return (double)sum / (double)(l.length);
	}
	
	public static int[] intListCopy(int[] l) {
		int N = l.length;
		int[] r = new int [N];
		for (int i = 0; i < N; i++) {
			r[i] = l[i];
		}
		return r;
	}
	
	//	支持重载特性
	//	数组传递的是地址
	public static boolean intListCopy(int[] lFrom, int[] lTo) {
		if (lFrom.length == lTo.length) {
			for (int i = 0; i < lFrom.length; i++) {
				lTo[i] = lFrom[i];
			}
			return true;
		}
		return false;
	}
	
	public static boolean intListReverse(int[] l) {
		int N = l.length;
		for (int i = 0; i < N / 2; i++) {
			int temp = l[i];
			l[i] = l[N-1-i];
			l[N-1-i] = temp;
		}
		return true;
	}
	
	public static int[][] intMatrixMultiplication(int[][] a, int[][] b) {
		if (a[0].length == b.length) {
			int[][] c = new int[a.length][b[0].length];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; i < b[0].length; j++) {
					for (int k = 0; k < a[0].length; k++) {
						c[i][j] = a[i][k] * b[k][j];
					}
				}
			}
			//	待完善	
			return c;
		} else {
			int[][] c = {{0}};
			return c;
		}
		
	}
	
	public static String showIntBinary (int a) {
		String r = Integer.toBinaryString(a);
		System.out.println(a + "的二进制表达是" + r);
		return r;
	}
	
	// int 最大计算 16 的阶乘
	public static int intFactorial (int a) {
		int r = a;
		while (a > 1) {
			r *= --a;
		}
		return r;
	}
	
	public static void narcissisticNumber () {
		for (int i = 100; i <1000; i++) {
			int j = i;
			int k = 0;
			while (j > 0) {
				int m = j % 10;
				k += m * m * m;
				j /= 10;
			}
			if (i == k)
				System.out.println(i + "是水仙花数");
		}
	}
	
	public static void main (String[] args) {
//		int[] a = {1, 2, 3, 4, 5, 6};
//		System.out.println(intListMax(a));
//		System.out.println(intListAvarage(a));
//		intListPrint(intListCopy(a));
//		int[] b = new int [6];
//		intListCopy(a, b);
//		intListPrint(b);
//		intListReverse(a);
//		intListPrint(a);
//		System.out.println(intFactorial(16));
		narcissisticNumber();
	}
}
