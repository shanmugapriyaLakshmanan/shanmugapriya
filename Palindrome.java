import java.util.Scanner;
public class Palindrome{
	public static void main(String[] args) {
		int N,a,b,c=0;
		Scanner in=new Scanner(System.in);
		N=in.nextInt();
		if(N>=0 && N<=1000){
			int l=Integer.toString(N).length();
			a=N;
			for(int i=0;i<l;i++){
				b=a%10;
				a=a/10;
				c=c*10+b;
			}
			if(c==N){
	         	System.out.println("the given value is palindrome");
	           }
			else{
				System.out.println("the given value is not a palindrome");
			}
		}
		else{
			System.out.println("invalid value");
		}
}
}
