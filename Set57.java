import java.util.Arrays;
import java.util.Scanner;
public class Set57 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int m=in.nextInt();
		int count=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<n;i++){
			if(a[i]==m)
				count++;
		}
		System.out.println(count);
	}
}
