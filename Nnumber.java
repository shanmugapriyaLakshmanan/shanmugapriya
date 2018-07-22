import java.util.Scanner;
public class Guvi {
	public static void main(String[] args) {
		int a,sum=0;
		Scanner in=new Scanner(System.in);
		a=in.nextInt();
		if(a>=0){
		for(int i=0;i<=a;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	    }
		else{
			System.out.println("invalid no");
		}
	}
}

