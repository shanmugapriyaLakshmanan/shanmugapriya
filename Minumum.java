
import java.util.*;
public class Minumum {
  public static void main(String[] argv) {
	  int N;
      Scanner in=new Scanner(System.in);
      N=in.nextInt();
      if(N>=1 && N<=100000){
         int a[]=new int[N];
         for(int i=0;i<N;i++){
        	 a[i]=in.nextInt();
         }
         int min=a[0];
         for(int i=0;i<N;i++){
         if(a[i]<min){
        	 min=a[i];
         }
         }
         System.out.println(min);
      }
      else{
    	  System.out.println("invalid value");
      }
  }
}
