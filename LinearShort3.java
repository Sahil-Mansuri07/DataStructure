class Lshort
{
public static void main(String args[])
{
int x[]={50,20,75,80,45,23,12,52,70,55};
int f,g;

for(int i=0;i<x.length;i++)
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

}//for loop close


for(int num:x)
{

System.out.print(num+" ");

}
}
}