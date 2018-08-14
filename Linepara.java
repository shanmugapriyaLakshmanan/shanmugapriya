import java.util.Scanner;
public class Linepara {
	public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     String s=in.nextLine();
     s=s.replace(" ","");
     int count=0;
     String s1[]=s.split("");
     for(int i=0;i<s1.length;i++){
    	 if(s1[i].equalsIgnoreCase("."))
    		 count++;
     }
     System.out.println(count+1);
	}
}
