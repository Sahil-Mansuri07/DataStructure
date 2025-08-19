// Recursively


class BSTree3
{
public static void main(String aergs[])
{

int x[]={10,20,30,40,45,50,60,70,80,90};

int key=45;

int idx=searchInfinite(x,key);

if(idx>=0)
{

System.out.println("Index is: "+idx);
System.out.println("Key is: "+x[idx]);

}
else
{

System.out.println("Key not found: "+key);

}

}

static int searchInfinite(int x[],int key)
{

int low=0;
int high=1;

while(x[high]<key)
{

low=high;
high=2*high;

}

return binarySearch(x,key,low,high);

}

static int binarySearch(int x[],int key,int low,int high)
{

int mid=(low+high)/2;

if(low>high) return -1;

if(x[mid]==key) return mid;


if(key>x[mid])
{

return binarySearch(x,key,mid+1,high);

}

if(key<x[mid])
{

return binarySearch(x,key,low,mid-1);

}
return -1;
}
}