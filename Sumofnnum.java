import java.util.Scanner;
public class Sumofnnum {
	public static void main(String[] args) {
		int N=0,K,sum=0;
		Scanner in=new Scanner(System.in);
		N=in.nextInt();
		K=in.nextInt();
		int a[]=new int[N];
		for(int i=0;i<N;i++){
			a[i]=in.nextInt();
		}
        for(int i=0;i<K;i++){
        	sum=sum+a[i];
        }
		System.out.println(sum);
	}
}
