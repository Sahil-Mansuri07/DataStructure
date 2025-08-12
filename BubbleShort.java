class BubbleSort
{
public static void main(String args[])
{

int x[]={20,25,50,55,60,75};
int y;
for(int i=0;i<x.length-1;i++)
{
for(int j=0;j<x.length-i-1;j++)
{
if(x[j]>x[j+1])
{
y=x[j+1];
x[j+1]=x[j];
x[j]=y;
}
}
}

for(int num:x)
{

System.out.print(num+" ");

}
}
}