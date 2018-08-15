import java.util.Arrays;
import java.util.Scanner;
public class S39{
	public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int b[]=new int[10];
     for(int i=0;i<10;i++){
     b[i]=in.nextInt();
     }
     Arrays.sort(b);
     System.out.println(b[9]);
	}
}
