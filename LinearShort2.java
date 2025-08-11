import java.util.Scanner;

class Main
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);

int x[]=new int[10];
int e,f,g;

e=0;
while(e<=9)
{
System.out.print("Enter a number: ");
x[e]=sc.nextInt();
e++;
}

for(int i=0;i<x.length-1;i++)
{

f=i;

for(int j=i+1;j<x.length;j++)
{

if(x[j]<x[f])
{

f=j;

}

}

g=x[f];
x[f]=x[i];
x[i]=g;
}

for(int num:x)
{

System.out.print(num+" ");

}

}
}