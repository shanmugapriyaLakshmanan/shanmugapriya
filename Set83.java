import java.util.Scanner;
public class Set83 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int choice=in.nextInt();
		switch(choice){
		case 1:{
			System.out.println(a/b);
			break;
		}
		case 2:{
			System.out.println(a%b);
			break;
		}
		default:
			System.out.println("invalid number");
		}
	}
}
