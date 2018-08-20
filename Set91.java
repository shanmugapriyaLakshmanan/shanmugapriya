import java.util.Scanner;
public class Set91{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int x=in.nextInt();
		int y=in.nextInt();
		int z=in.nextInt();
		int n=0;
		int vol=x*y*z;
		int area=(2*x*y)+(2*y*z)+(2*x*z);
		System.out.println(area+" "+vol);
	}
}
