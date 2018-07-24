
import java.util.*;
public class Sort {
  public static void main(String[] argv) {
	  int N,temp=0;
      Scanner in=new Scanner(System.in);
      N=in.nextInt();
      if(N>=1 && N<=1000){
         int a[]=new int[N];
         for(int i=0;i<N;i++){
        	 a[i]=in.nextInt();
         }
         for(int i=0;i<N;i++){
        	 for(int j=i+1;j<N;j++){
         if(a[i]>a[j]){
        	 temp=a[i];
        	 a[i]=a[j];
        	 a[j]=temp;
         }
         }
         }
         for(int i=0;i<N;i++){
        	 System.out.println(a[i]);
         }
      }
      else{
    	  System.out.println("invalid value");
      }
  }
}
