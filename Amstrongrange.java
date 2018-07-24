package digi;
import java.util.*;
public class Amstrongrange {
  public static void main(String[] argv) {
	  int N,a=0,b,d=0,x,count=0,e=0;
      Scanner in=new Scanner(System.in);
      N=in.nextInt();
      x=in.nextInt();
      for(int i=N+1;i<x;i++){
    	  count=0;
       a=i;
     while(a!=0){
    	 a=a/10;
    	 count++;
        }
     e=i;
     d=0;
    while(e!=0){
    	 b=e%10;
    	int  c=(int)Math.pow(b,count);
    	d=d+c;
    	 e=e/10;
       }
     if(d==i){
    	 System.out.println(i);  
        }
      }
  }
}
