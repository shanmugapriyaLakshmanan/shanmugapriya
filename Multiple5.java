import java.util.*;
public class Multiple5 {
  public static void main(String[] argv) {
     int N,count=0;
      Scanner in=new Scanner(System.in);
      N=in.nextInt();
      int Q=0;
    		  for(int j=5;j>0;j--){
    		  Q=Q+N;
    		  count++;
    		  System.out.println(Q);
    		  if(count==5){
    			  break;
    		  }
    	  }
       }
}
