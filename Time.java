
import java.util.Scanner;
public class Timemin {
	public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     int h,m;
     if(n<60){
    	 System.out.println(0+" "+n);
     }
     else{
    	 m=n%60;
    	 h=n/60;
    	 System.out.println(h+" "+m);
     }
	}
}
