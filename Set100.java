import java.util.Scanner;
public class Set100 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=0,mul=1;
		while(n!=0){
			a=n%10;
			mul=a*mul;
			n=n/10;
		}
		System.out.println(mul);
	}
}
