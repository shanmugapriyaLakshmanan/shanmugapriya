import java.util.Scanner;
public class Set87 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int gcd=1;
		for(int i=1;i<=a && i<=b;i++){
			if(a%i==0 && b%i==0)
				gcd=i;
		}
		System.out.println(gcd);
	}
}
