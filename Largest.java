import java.util.Scanner;
public class Largest {

	public static void main(String[] args) {
		int a,b,c;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();

		if(a>b && a>c){
			System.out.println("the largest value is"+a);
		}
		if(b>a && b>c){
			System.out.println("the largest value is"+b);
		}
		else{
			System.out.println("the largest value is"+c);
		}
	}

}
