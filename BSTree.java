class Main
{
public static void main(String aergs[])
{

int x[]={10,20,30,40,45,50,60,70,80,90};

int key=45;
int low=0;
int high=x.length-1;

int idx=binarySearch(x,key,low,high);

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

static int binarySearch(int x[],int key,int low,int high)
{

if(low>high) return -1;

while(low<=high)
{

int mid=(low+high)/2;

if(x[mid]==key) return mid;

if(x[mid]>key)
{

high=mid-1;

}
if(x[mid]<key)
{

low=mid+1;

}
}
return -1;
}
}