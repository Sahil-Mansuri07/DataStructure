class MergeSort
{

static void mergeSort(int x[],int l,int r)
{

if(l<r)
{
int mid=(l+r)/2;

mergeSort(x,l,mid);
mergeSort(x,mid+1,r);
merge(x,l,mid,r);
}
}
static void merge(int x[],int l,int mid,int r)
{

int i=l;
int j=mid+1;
int k=l;
int y[]=new int[x.length];

while(i<=mid && j<=r)
{
if(x[i]<x[j])
{

y[k]=x[i];
i++;

}
else
{
y[k]=x[j];
j++;
}
k++;
}

while(j<=r)
{
y[k]=x[j];
j++;
k++;
}


while(i<=mid)
{

y[k]=x[i];
i++;
k++;

}

for(int p=l;p<=r;p++)
{

x[p]=y[p];

}
}
public static void main(String args[]) 
{
int x[]={9,4,7,6,3,1,5};
System.out.println("Before Sorting");

for(int num:x)
{

System.out.print(num+" ");

}
System.out.println();
mergeSort(x,0,x.length-1);

System.out.println("After Sorting");

for(int num:x)
{

System.out.print(num+" ");

}

}
}