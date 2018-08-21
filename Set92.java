import java.util.Arrays;
import java.util.Scanner;
public class Set92 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
}

