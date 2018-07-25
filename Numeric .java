import java.util.Scanner;
public class Numeric {
	public static void main(String[] args) {
        int count=0,temp=0;
        Scanner in=new Scanner(System.in);
        String N;
        System.out.println("enter the value");
        N=in.next();
        char a[]=N.toCharArray();
        int l=a.length;
        for(int i=0;i<l;i++){
        if(a[i]>='0' && a[i]<='9'){
        	count++;
        }
        }
        if(count==l){
        System.out.println("yes");
        }
        else{
        	System.out.println("no");
        }
	}
}
