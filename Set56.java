import java.util.Arrays;
import java.util.Scanner;
public class Set56 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		int count=0,count1=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<ch.length;i++){
			if((ch[i]>='A' && ch[i]<='Z')||(ch[i]>='a' && ch[i]<='z')){
				count=1;
			}
			if(ch[i]>='0'&& ch[i]<='9'){
				count1=1;
			}
		}
		if(count+count1==2)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}
