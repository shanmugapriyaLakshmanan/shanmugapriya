import java.util.Scanner;
public class Numcharcount{
	public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     String s=in.nextLine();
     int count=0;
     char ch[]=s.toCharArray();
     for(int i=0;i<ch.length;i++){
    	 if(ch[i]>='0' && ch[i]<='9')
    		 count++;
     }
     System.out.println(count);
	}
}
