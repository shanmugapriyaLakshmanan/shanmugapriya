import java.util.Scanner;
public class Counts {
	public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     String input=in.nextLine();
     input=input.replaceAll(" ","");
     int l=input.length();
     System.out.println(l);
	}
}
