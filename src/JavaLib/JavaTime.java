package JavaLib;

public class JavaTime {
	
	public static boolean isLeapYear (int year) {
		if (year < 0)
			year *= -1;
		if ((0 == year % 400) || ((0 == year % 4) && (0 != year % 100)))
			return true;
		else
			return false;
	}
	
	public static String monthToSeason (int month) {
		String season = "";
		switch(month) {
		case 1:
		case 2:
		case 3:
			season =  "Spring";
			break;
		case 4:
		case 5:
		case 6:
			season =  "Summer";
			break;
		case 7:
		case 8:
		case 9:
			season = "Fall";
			break;
		case 10:
		case 11:
		case 12:
			season = "Winter";
			break;
		default:
			season = "";
		}
		return season;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 13; i++)
			System.out.println(monthToSeason(i));
		int i = 0;
		do {
			System.out.println(i);
			i++;
		} while (i < 5);
		i = 0;
		while (i < 5) {
			System.out.println(i);
			i++;
		} ;
	}
}
