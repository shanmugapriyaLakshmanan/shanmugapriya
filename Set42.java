import java.util.*;
public class Set42 {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String s1=in.next();
	String s2=in.next();
	int l1=s1.length();
	int l2=s2.length();
	if(l1>l2)
		System.out.println(s1);
	else if(l2>l1)
		System.out.println(s2);
	else if(l1==l2)
		System.out.println(s2);
	}
}
