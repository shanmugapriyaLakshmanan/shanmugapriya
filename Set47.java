import java.util.Arrays;
import java.util.Scanner;
public class Set47 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		Arrays.sort(a);
			System.out.print(a[0]+" "+a[n-1]);
	}
}
