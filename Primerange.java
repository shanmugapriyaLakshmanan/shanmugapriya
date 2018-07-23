import java.util.*;
public class Primerange {
  public static void main(String[] argv) {
     int N,Q,count=0;
      Scanner in=new Scanner(System.in);
      N=in.nextInt();
      Q=in.nextInt();
    	  for(int i=N+1;i<Q;i++){
    		  count=0;
    		  for(int j=1;j<=i;j++){
    		  if(i%j==0){
    			  count++;
    		  }
    	  }
    		  if(count==2){
    			  System.out.println(i);
    		  }
    	  }
      
  }
}
