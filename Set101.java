import java.util.Scanner;
public class Set101 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int n=in.nextInt();
		int l=s.length();
		System.out.println((s.substring(l-n)));
	}
}
