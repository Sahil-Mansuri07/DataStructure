class Node
{
int data;
Node next;

Node(int data)
{
this.data=data;
}
}

class Main
{
public static void main(String args[])
{

Node n1= new Node(20);
Node n2= new Node(40);
Node n3= new Node(60);
Node n4= new Node(80);
Node n5= new Node(100);
Node n6= new Node(10);
Node n7= new Node(30);
Node n8= new Node(50);
Node n9= new Node(70);
Node n10= new Node(90);

Node head=n1;
head.next=n2;
n2.next=n3;
n3.next=n4;
n4.next=n5;
n5.next=n6;
n6.next=n7;
n7.next=n8;
n8.next=n9;
n9.next=n10;
n10.next=null;

// Traverse after create 
traverse(head);

// Insert at a position
insertAt(55,head,2);

// Traverse after add 
traverse(head);

// Delete from a position
deleteFrom(head,2);

// Traverse after delete
traverse(head);

// Reverse
Node head2=reverse(head);

System.out.println("Reverse is ");
System.out.println();

// Traverse after reverse(Recursively)
traverse(head2);


}

// Traverse method
static void traverse(Node head)
{

Node curr=head;

while(curr!=null)
{

System.out.print(curr.data+" ");
curr=curr.next;

}
System.out.println("\n");

}

// Insert method 
static void insertAt(int data, Node head, int pos)
{

Node toAdd=new Node(data);

if(pos==0)
{

toAdd.next=head;
head=toAdd;
return;

}

Node prev=head;

for(int i=0;i<pos-1;i++)
{

prev=prev.next;

}

toAdd.next=prev.next;
prev.next=toAdd;

}

// Delete method
static void deleteFrom(Node head, int pos)
{

if(pos==0)
{

head=head.next;
return;

}

Node prev=head;

for(int i=0;i<pos-1;i++)
{

prev=prev.next;

}

prev.next=prev.next.next;

}

// Reverse Recursively
static Node reverse(Node head)
{


if(head==null||head.next==null)
{
return head;
}

Node newHead = reverse(head.next);
head.next.next = head
head.next = null;

return newHead;

}

}