class Qsort
{
static int partition(int x[],int l,int h)
{

int pivot=x[l];
int i=l;
int j=h; 

while(i<j)
{
while(x[i]<=pivot) i++;

while(x[j]>pivot) j--;
if(i<j)
{

int sw=x[j];
x[j]=x[i];
x[i]=sw;

}
}

int swp=x[j];
x[j]=x[l];
x[l]=swp;

return j;
}

static void quickSort(int x[],int l,int h)
{

if(l<h)
{

int pivot=partition(x,l,h);

quickSort(x,l,pivot-1);
quickSort(x,pivot+1,h);

}
}

public static void main(String args[])
{

int x[]={44,66,22,55,77,99,11,33};

int h=x.length-1;

System.out.println("Before Sort");

for(int num:x)
{

System.out.print(num+" ");

}
System.out.println();

quickSort(x,0,h);

System.out.println("After Sort");

for(int num:x)
{

System.out.print(num+" ");

}
}
}