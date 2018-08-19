import java.util.Scanner;
public class Set53 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=0,sum=0;
		while(n!=0){
			a=n%10;
			sum=sum+a;
			n=n/10;
		}
		System.out.println(sum);
	}
}
