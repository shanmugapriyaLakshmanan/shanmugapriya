import java.util.Scanner;
public class Set99 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		int ans=(a*b)%c;
		System.out.println(ans);
	}
}
