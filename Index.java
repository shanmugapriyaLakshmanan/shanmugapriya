
import java.util.*;
public class Index {
  public static void main(String[] argv) {
	  int N,temp=0;
      Scanner in=new Scanner(System.in);
      N=in.nextInt();
         int a[]=new int[N];
         for(int i=0;i<N;i++){
        	 a[i]=in.nextInt();
         }
         for(int i=0;i<N;i++){
        	 System.out.println(a[i]+" "+i);
         }
  }
}
