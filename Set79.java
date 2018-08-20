import java.util.Scanner;
public class Set79 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int n1=in.nextInt();
		int a=n*n1;
		double d=Math.sqrt(a);
		if((d*d)==a)
			System.out.println("yes");
		else
			System.out.println("no");
	}
	}
