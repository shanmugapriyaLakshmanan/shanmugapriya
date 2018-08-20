import java.util.Scanner;
public class Set80 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s[]=String.valueOf(n).split("");
		for(int i=0;i<s.length;i++){
			int a=Integer.valueOf(s[i]);
			if(a%2!=0)
				System.out.print(a+" ");
		}
	}
	}
