import java.util.Scanner;
public class Set69 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int n1=in.nextInt();
		int s=Math.abs(n-n1);
		if(s%2==0)
			System.out.println("even");
		else
			System.out.println("odd");
	}
}
