
import java.util.Scanner;
public class Ap {
	public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int a=in.nextInt();
     int d=in.nextInt();
     int out=n*(2*a+(n-1)*d)/2;	
     System.out.println(out);
	}
}
