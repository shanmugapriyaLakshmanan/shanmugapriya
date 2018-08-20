import java.util.Scanner;
public class Set62 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int count=0,count1=0;
	     char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i]=='0'||ch[i]=='1')
				count++;
			else
				count1++;
		}
		if(count==ch.length)
		System.out.println("yes");
		else
			System.out.println("no");
	}
}
