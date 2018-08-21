
// BST checking

import java.util.*;

public class bst_check{

	struct Node
	{
		int data;

		Node left, right;

		Node(int data)
		{
			this.data = data;

			left = right = null;
		}
	}

	// It's better to have two functions

	boolean isBST()
	{
		return isBSTutil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	boolean isBSTutil(Node node, int max, int min)   // Basically, we start witht the root only
	{
		if(node == null)
		{
			return true;
		}

		if(node.data < min || node.data > max)
		{
			return false;
		}

		return (isBSTutil(node.left, min, node.data - 1) && isBSTutil(node.right, node.data + 1, max));
	}

	// Functions to find the minimum and maximum 

	static int find_max(Node node)
	{
		if(node == null)
		{
			return null;
		}

		int temp = node.data;

		int left_temp = find_max(node.left);

		int right_temp = find_max(node.right);

		if(left_temp > temp)
		{
			temp = left_temp;
		}

		if(right_temp > temp)
		{
			temp = right_temp;
		}

		return temp;
	}

	static int find_min(Node node)
	{
		if(node == null)
		{
			return null;
		}

		int temp = node.data;

		int left_temp = find_min(node.left);

		int right_temp = find_min(node.right);

		if(left_temp < temp)
		{
			temp = left_temp;
		}

		if(right_temp < temp)
		{
			temp = right_temp;
		}

		return temp;
	}
}