import java.util.Scanner;
public class Set55 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int mul=n*m;
		if(mul%2==0)
		System.out.println("even");
		else
			System.out.println("odd");
	}
}
