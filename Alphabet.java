import java.util.Scanner;
public class Alphabet {
	public static void main(String[] args) {
		char ch;
		Scanner in=new Scanner(System.in);
		ch=in.next().charAt(0);
		if((ch>=65 && ch<=90)||(ch>=97 && ch<=122)){
			System.out.println("the given character is an alphabet");
		}
		else{
			System.out.println("the given character is not an alphabet");
		}
	}
}
