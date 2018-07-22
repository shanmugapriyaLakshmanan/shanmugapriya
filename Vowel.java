import java.util.Scanner;
public class Vowel {
	public static void main(String[] args) {
		char ch;
		Scanner in=new Scanner(System.in);
		ch=in.next().charAt(0);
		if(ch=='a' || ch=='e'|| ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
			System.out.println("the given character is a vowel");
		}
		if(ch=='!'||ch=='@'||ch=='#'||ch=='$'||ch=='%'||ch=='^'||ch=='&'||ch=='*'||ch=='('||ch==')'){
			System.out.println("invalid character");
		}	
		else{
			System.out.println("the given character is consonant");
		}
	}
}
