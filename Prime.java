import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		int N,count=0;
		Scanner in=new Scanner(System.in);
		N=in.nextInt();
		if(N>=0 && N<=1000){
			for(int i=1;i<=N;i++){
				if(N%i==0){
					count++;
				}
			}
			if(count==2){
	         	System.out.println("yes");
	           }
			else{
				System.out.println("no");
			}
		}
		else{
			System.out.println("invalid value");
		}
}
}
