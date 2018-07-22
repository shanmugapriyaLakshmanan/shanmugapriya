import java.util.Scanner;
public class Naturalno{
	public static void main(String[] args) {
		int a,sum=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		for(int i=0;i<=a;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
