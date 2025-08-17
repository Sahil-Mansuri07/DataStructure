class InsertionSort
{
public static void main(String args[])
{

int x[]={15,10,80,25,20,22,45};
int n=x.length;

for(int i=1;i<n;i++)
{

int temp=x[i];
int j=i-1;

while(j>=0 && x[j]>temp)
{

x[j+1]=x[j];
j--;
}

x[j+1]=temp;

}

for(int num:x)
{

System.out.print(num+" ");

}
}
}