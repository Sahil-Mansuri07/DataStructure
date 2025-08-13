class HeapSort
{
void heapify(int x[],int n,int i)
{

int largest=i;
int left=2*i+1;
int right=2*i+2;

if(left<n && x[left]>x[largest])
{

largest=left;

}

if(right<n && x[right]>x[largest])
{

largest=right;

}
if(largest!=i)
{

int sw=x[i];
x[i]=x[largest];
x[largest]=sw;

heapify(x,n,largest);

}
}
void sort(int x[])
{

int n=x.length;
for(int i=n/2-1;i>=0;i--)
{

heapify(x,n,i);

}

for(int i=n-1;i>=0;i--)
{

int sw=x[0];
x[0]=x[i];
x[i]=sw;

heapify(x,i,0);

}
}

public static void main(String args[])
{

int x[]={4,10,3,5,1};

HeapSort hs=new HeapSort();
hs.sort(x);

for(int num:x)
{

System.out.print(num+" ");

}
}
}