import java.util.*;
public class Rangeodd {
  public static void main(String[] argv) {
     int N,Q;
      Scanner in=new Scanner(System.in);
      N=in.nextInt();
      Q=in.nextInt();
      if(Q>0 && Q<=100000){
    	  for(int i=N;i<Q;i++){
    		  if(i%2!=0){
    			  System.out.println(i);
    		  }
    	  }
      }
  }
}
