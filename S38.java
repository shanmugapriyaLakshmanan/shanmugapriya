import java.util.Scanner;
public class S38 {
	public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     int a=in.nextInt();
     int b=in.nextInt();
     a=a^b;
     b=a^b;
     a=a^b;
     System.out.println(a+"  "+b);
	}
}
