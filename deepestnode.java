class BinarySearchTree
{
	static class Node
	{
		int data; 
		Node left , right ;
		Node(int key)
		{
			data = key;
			left = right = null;
		}
	}

	// public static int height(Node root)
	// {
	// 	if(root == null)
	// 		return 0;

	// 	int leftht = height(root.left);
	// 	int rightht = height(root.right);

	// 	return Math.max(leftht,rightht) + 1 ;
	// }

	// public static void deepestNode( Node root , int levels)
	// {
	// 	if (root == null) {
	// 		return ;
			
	// 	}


	// 	if(levels == 1)
	// 		System.out.println(root.data);
	// 	else if(levels > 1 )
	// 	{
	// 	deepestnode(root.left , levels-1);
	// 	deepestnode(root.right , levels-1);
	// }}

public static void main(String args[]) 
{ 
    Node root = new Node(1); 
    root.left = new Node(2); 
    root.right = new Node(3); 
    root.left.left = new Node(4); 
    root.right.left = new Node(5); 
    root.right.right = new Node(6); 
    root.right.left.right = new Node(7); 
    root.right.right.right = new Node(8); 
    root.right.left.right.left = new Node(9); 
      
    // Calculating height of tree 
    int levels = height(root); 
      
    // Printing the deepest node 
    deepestNode(root, levels); 
}
}