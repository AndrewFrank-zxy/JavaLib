package JavaLib;

import java.util.Scanner;

public class JavaBody {
	double height;
	double weight;
	double BMI;
	
	JavaBody(double h, double w) {
		this.height = h;
		this.weight = w;
	}
	
	public String getBMIRank () {
		BMI = weight / (height * height);
		
		if (BMI < 18.5) {
			return "体重过轻";
		} else if (BMI < 24) {
			return "正常范围";
		} else if (BMI < 27) {
			return "体重过重";
		} else if (BMI < 30) {
			return "轻度肥胖";
		} else if (BMI < 35) {
			return "中度肥胖";
		} else {
			return "重度肥胖";
		}
	}
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("请输入身高(m)：");
		double h = s.nextDouble();
		System.out.println("请输入体重(kg)：");
		double w = s.nextDouble();
		JavaBody jb = new JavaBody(h, w);
		String BMIRank = jb.getBMIRank();
		System.out.println("当前的BMI是：" + jb.BMI + "；属于" + BMIRank);
	}
}
