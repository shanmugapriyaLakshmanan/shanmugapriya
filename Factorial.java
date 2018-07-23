import java.util.*;
public class Factorial {
  public static void main(String[] argv) {
     int N,Q=1;
      Scanner in=new Scanner(System.in);
      N=in.nextInt();
    		  for(int j=N;j>0;j--){
    		  Q=Q*j;
    	  }
      System.out.println(Q);
  }
}
