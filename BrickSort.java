class BrickSort
{
public static void brickSort(int x[])
{

int n=x.length;
boolean sorted=false;
while(!sorted) 
{
boolean flag=false;

// for even index sorting 
for(int i=0;i<=n-2;i+=2)
{
if(x[i]>x[i+1])
{
int swp=x[i];
x[i]=x[i+1];
x[i+1]=swp;
flag=true;
}
}

// for odd index sorting
for(int i=1;i<=n-2;i+=2)
{
if(x[i]>x[i+1])
{
int swp=x[i];
x[i]=x[i+1];
x[i+1]=swp;
flag=true;
}
}

if(!flag)
{
break;
}
}
}
public static void main(String args[])
{

int x[]={50,25,75,15,18,55,45,48};

System.out.println("Before Sort");

for(int num:x)
{
System.out.print(num+" ");
}

brickSort(x);

System.out.println("\nAfter Sort");

for(int num:x)
{
System.out.print(num+" ");
}
}
}