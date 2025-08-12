import java.util.Scanner;
class Bsort
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x[]=new int[10];
int e,f;
e=0;
while(e<=9)
{

System.out.print("Enter a number: ");
x[e]=sc.nextInt();
e++;
}

for(int i=0;i<x.length-1;i++)
{
for(int j=0;j<x.length-i-1;j++)
{
if(x[j]>x[j+1])
{
f=x[j+1];
x[j+1]=x[j];
x[j]=f;
}
}
}

for(int num:x)
{

System.out.print(num+" ");

}
}
}