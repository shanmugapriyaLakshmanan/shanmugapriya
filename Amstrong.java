import java.util.*;
public class Amstrong {
  public static void main(String[] argv) {
     int N,a,b,c,d=0;
      Scanner in=new Scanner(System.in);
      N=in.nextInt();
       a=N;
     while(a!=0){
    	 b=a%10;
    	 c=b*b*b;
    	 d=d+c;
    	 a=a/10;
        }
     if(d==N)
    	System.out.println("yes");  
     else
    	 System.out.println("no");
  }
}
