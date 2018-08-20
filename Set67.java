import java.util.Scanner;
public class Set67 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		for(int i=10;i<100000;i=i+10){
			if(n<i){
				System.out.println(i);
				break;
			}
		}
	}
}
