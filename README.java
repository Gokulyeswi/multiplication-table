# multiplication-table
import java.util.*;
public class multiplicationtable
{
public static void main(String ar[])throws Exception
{
int n;
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=1;i<=12;i++)
{
System.out.println(n+"*"+i+"="+n*i);
}
}
}
