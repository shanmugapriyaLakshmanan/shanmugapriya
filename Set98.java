import java.util.Arrays;
import java.util.Scanner;
public class Set98{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=in.nextInt();
		}
		for(int i=0;i<n-1;i++){
			if(a[i]>a[i+1]){
				System.out.println(i+1);
            break;
			}}
	}
}
