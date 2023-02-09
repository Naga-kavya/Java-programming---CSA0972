import java.util.*;
public class separate
{
	public static void main(String[] args)
	{
		String s;
		int len,i,c=0,v=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter any string:");
		s=sc.next();
		len=s.length();
		char a[]=new char[len];
		char vow[]=new char[len];
		char con[]=new char[len];
		for(i=0;i<len;i++)
		{
			a[i]=s.charAt(i);
			if(a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U'||a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u')
			{
				vow[v]=a[i];
				v++;
			}
			else
			{
				con[c]=a[i];
				c++;
			}
		}
		System.out.print("vowels:");
		for(i=0;i<v;i++)
		{
			System.out.print(vow[i]);
		}
		System.out.print("\nconsonents:");
		for(i=0;i<c;i++)
		{
			System.out.print(con[i]);
		}
	}
}
