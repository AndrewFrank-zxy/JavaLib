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
			return "���ع���";
		} else if (BMI < 24) {
			return "������Χ";
		} else if (BMI < 27) {
			return "���ع���";
		} else if (BMI < 30) {
			return "��ȷ���";
		} else if (BMI < 35) {
			return "�жȷ���";
		} else {
			return "�ضȷ���";
		}
	}
	
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("���������(m)��");
		double h = s.nextDouble();
		System.out.println("����������(kg)��");
		double w = s.nextDouble();
		JavaBody jb = new JavaBody(h, w);
		String BMIRank = jb.getBMIRank();
		System.out.println("��ǰ��BMI�ǣ�" + jb.BMI + "������" + BMIRank);
	}
}
