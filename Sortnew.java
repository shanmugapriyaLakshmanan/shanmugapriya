import java.util.*;
public class Sortnew {
  public static void main(String[] argv) {
	  int N,temp=0;
      Scanner in=new Scanner(System.in);
      System.out.println("enter the values");
      N=in.nextInt();
      if(N>=1 && N<=1000){
        System.out.println("enter the values of Array");
         int a[]=new int[N];
         for(int i=0;i<N;i++){
        	 a[i]=in.nextInt();
         }
         Arrays.sort(a);
         for(int i=0;i<N;i++){
        	 System.out.println(a[i]);
         }
      }
      else{
    	  System.out.println("invalid value");
      }
  }
}
