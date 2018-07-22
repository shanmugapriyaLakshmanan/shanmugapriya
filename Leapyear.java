import java.util.Scanner;
public class Leapyear{
	public static void main(String[] args) {
		int a;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		if((a%4==0 && a%100!=0)|| (a%400==0 && a%100==0)){
			System.out.println("the given year is leap year");
		}
		else{
			System.out.println("the given year is not a leap year");
		}
	}
}
