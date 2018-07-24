package digi;
import java.util.*;
public class Amstrong1 {
  public static void main(String[] argv) {
	  int N,a=0,b,d=0,x,count=0,e=0;
      Scanner in=new Scanner(System.in);
      N=in.nextInt();
	  if(N>=0 && N<=100000){
         a=N;
     while(a!=0){
    	 a=a/10;
    	 count++;
        }
     e=N;
      while(e!=0){
    	 b=e%10;
    	int c=(int)Math.pow(b,count);
    	d=d+c;
    	 e=e/10;
       }
     if(d==N){
    	 System.out.println("yes");  
        }
     else{
    	 System.out.println("no");
     }
	  }
	  else{
		  System.out.println("invalid no");
	  }
      }
  
}
