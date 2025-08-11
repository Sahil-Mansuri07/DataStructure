class Lshort
{

public static void main(String args[])
{

int x[]={9,0,5,2,8,4,7,6,3,1};
int e,g;

for(int i=0;i<x.length-1;i++)
{
e=i;

for(int j=i+1;j<x.length;j++)
{

if(x[j]<x[e])
{

e=j;

}

}

g=x[e];
x[e]=x[i];
x[i]=g;

}

for(int num:x)
{System.out.print(num+" ");}
}
}