import java.util.Scanner;
public class Power{
	public static void main(String[] args) {
		double a,b,c;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=Math.pow(a,b);
		System.out.println(c);
	}
}
