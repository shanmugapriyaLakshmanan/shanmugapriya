import java.util.*;
public class Median {
  public static void main(String[] argv) {
	  int N,temp=0;
      Scanner in=new Scanner(System.in);
      System.out.print("Enter the value");
      N=in.nextInt();
      if(N>=1 && N<=1000){
       System.out.print("Enter the values of array");
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
         int b=N%2;
         System.out.println(a[b+1]);
      }
      else{
    	  System.out.println("invalid value");
      }
  }
}
