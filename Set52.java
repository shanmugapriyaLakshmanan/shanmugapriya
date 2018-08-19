import java.util.Arrays;
import java.util.Scanner;
public class Set52 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a[]={1,2,3,4,5,6,7,8,9,10};
		String s[]={"one","two","three","four","five","six","seven","eight","nine","ten"};
		for(int i=0;i<a.length;i++){
			if(a[i]==n)
			System.out.println(s[i]);
		}
	}
}
