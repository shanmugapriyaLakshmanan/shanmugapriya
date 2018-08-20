import java.util.Scanner;
public class Set84 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		char ch=in.next().charAt(0);
		if((ch>=65 && ch<=90)||(ch>=97 && ch<=122)||(ch>=48 && ch<=57))
			System.out.println((int)ch);
	}
}
