import java.util.Scanner;
public class Set50{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=0,count=0;
		for(int i=1;i<=n;i++){
			a=(int)Math.pow(2,i);
			if(a==n){
				count++;
				break;
		}
		}
		if(count==1)
		System.out.println("yes");
		else
			System.out.println("no");
	}
}
