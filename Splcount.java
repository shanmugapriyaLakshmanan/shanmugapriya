import java.util.Scanner;
public class Splcount {
	public static void main(String[] args) {
     Scanner in=new Scanner(System.in);
     String s=in.nextLine();
     int count=0;
     String str="";
     String a[]=s.split("[A-Za-z0-9]");
     for(int i=0;i<a.length;i++){
    	 str=str+a[i];
     }
     System.out.println(str.length());
	}
}
