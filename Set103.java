import java.util.Scanner;
public class Set103 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String a[]=s.split(" ");
		String s1="",con="";
		int l=s.length();
		for(int i=0;i<a.length;i++){
		s1=a[i].substring(0,1).toUpperCase()+a[i].substring(1, a[i].length());
		con=con+" "+s1;
		}
		System.out.println(con);
		}
}
