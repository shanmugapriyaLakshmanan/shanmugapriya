import java.util.Scanner;
public class Set88 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int n=1;
		for(int i=1;i<=a && i<=b;i++){
			if(a%i==0 && b%i==0)
				n=i;
		}
		int lcm=(a*b)/n;
		System.out.println(lcm);
	}
}
