import java.util.Arrays;
import java.util.Scanner;
public class Set89 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		s=s.toLowerCase();
		String s1[]=s.split("");
		Arrays.sort(s1);
		for(int i=0;i<s1.length;i++){
				System.out.print(s1[i]);
		}
	}
}
