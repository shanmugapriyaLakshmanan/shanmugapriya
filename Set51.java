import java.util.Arrays;
import java.util.Scanner;
public class Set51 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String a[]=String.valueOf(n).split("");
		for(int i=0;i<a.length;i++){
			System.out.print(Integer.valueOf(a[i])+" ");
		}
	}
}
