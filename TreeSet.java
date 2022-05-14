import java.io.*;
import java.util.*;
public class Dab
{
public static void main(String ar[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
int inp[]=new int[n];

for(int m=0;m<n;m++)
{
inp[m]=sc.nextInt();
}
int dig[]=new int[10];
int un=0,st=0;
//char c[];
String s=" ";
String sstr="";
String ustr="";
TreeSet<Integer> tr=new TreeSet<Integer>();
for(int i=0;i<inp.length;i++)
{
s=String.valueOf(inp[i]);
char c[]=s.toCharArray();


int narr[]=new int[c.length];
for(int j=0;j<c.length;j++)
{
narr[j]=Integer.parseInt(String.valueOf(c[j]));
}

for( int k=0;k<narr.length;k++)
{
dig[narr[k]]=(dig[narr[k]])+1;
}

for(int p=0;p<10;p++)
{
if(dig[p]!=0)
{
tr.add(dig[p]);
}
}

if(tr.size()>1)
{
un=un+1;
ustr+=s+" ";
}
else
{
st=st+1;
sstr+=s+" ";
}

for(int o=0;o<10;o++)
{
dig[o]=0;
}
tr.clear();
}

String uarray[]=ustr.split(" ");
int unum[]=new int[uarray.length];
for( int t=0;t<uarray.length;t++)
{
Integer.parseInt(String.valueOf(uarray[t]));
unum[t]=Integer.parseInt(String.valueOf(uarray[t]));

sum=sum+unum[t];
}
System.out.println(sum);

}
}
