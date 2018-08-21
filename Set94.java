import java.util.Arrays;
import java.util.Scanner;
public class Set94 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int n1=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		System.out.println(a[n1-1]);
	}
}
