import java.util.Scanner;
public class Set66{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int count=0;
		for(int i=2;i<=n;i++){
			if(n%i==0)
				count++;
		}
		if(count==1)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
