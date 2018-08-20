import java.util.Scanner;
public class Set72 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		s=s.toLowerCase();
		String s1=s.replaceAll("[^aeiou]","");
		System.out.println(s1.length());
		if(s1.length()>0)
		    System.out.println("yes");
		else
			System.out.println("no");
	}
}
