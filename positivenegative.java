import java.util.Scanner;
public class Positivenega {

	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		if(n>0){
			System.out.println("positive");
		}
		else if(n<0){
			System.out.println("negative");
		}
		else{
			System.out.println("zero");
		}

	}

}
