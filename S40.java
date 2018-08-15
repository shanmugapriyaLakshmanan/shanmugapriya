import java.util.*;
public class S40{
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
    int t=1,t1=0,sum=0;
    for(int i=1;i<=n;i++){
    	sum=t1+t;
    	t=t1;
    	t1=sum;
    	System.out.println(sum);
    }
	}
}
