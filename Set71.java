import java.util.Scanner;
public class Set71 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String s1=new StringBuffer(s).reverse().toString();
		if(s1.equalsIgnoreCase(s))
		    System.out.println("yes");
		else
			System.out.println("no");
	}
}
