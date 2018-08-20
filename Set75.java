import java.util.Scanner;
public class Set75 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int l=s.length();
		if(l%2==0)
			System.out.println(s.substring(0,l/2-1)+"**"+s.substring(l/2+1));
		else
			System.out.println(s.substring(0,l/2)+"*"+s.substring(l/2+1));
	}
}
