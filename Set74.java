import java.util.Scanner;
public class Set74 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		float a=in.nextFloat();
		for(int i=1;i<100;i=i+1){
		if(a<i){
		    System.out.println(i);
		    break;
		}}
	}
}
