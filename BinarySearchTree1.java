class Node
{

int key;
Node left,right;

Node(int key)
{

this.key=key;
left=right=null;

}
}

class Main
{
public static void main(String args[])
{


Node root=null;

root = insert(root, 50);
root = insert(root, 30);
root = insert(root, 20);
root = insert(root, 40);
root = insert(root, 70);
root = insert(root, 60);
root = insert(root, 85);

inorder(root);

}


static Node insert(Node root,int key)
{

if(root==null) return new Node(key);

if(root.key==key) return root;

if(root.key>key)
{

root.left=insert(root.left,key);

}

if(root.key<key)
{

root.right=insert(root.right,key);

}
return root;

}

static void inorder(Node root)
{

if(root!=null)
{

inorder(root.left);
System.out.print(root.key+" ");
inorder(root.right);
}
}

}