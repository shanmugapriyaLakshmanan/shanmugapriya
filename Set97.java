import java.util.Scanner;
public class Set97 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=0,sum=0;
		while(n!=0){
			a=n%10;
			sum=a+(sum*10);
			n=n/10;
		}
		System.out.println(sum);
	}
}
