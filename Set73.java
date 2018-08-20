import java.util.Scanner;
public class Set73 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int n1=in.nextInt();
		int n2=in.nextInt();
		if(a>n1 && a<n2)
		    System.out.println("yes");
		else
			System.out.println("no");
	}
}
