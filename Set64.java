import java.util.Scanner;
public class Set64 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int div;
		int n=in.nextInt();
	   int m=in.nextInt();
	      div=n%m;
	  if(div==0)
		System.out.println("even");
	  else
		System.out.println("odd");
	}
}
