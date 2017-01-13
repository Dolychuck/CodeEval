import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * A class to model a Binary Search Tree and Solution to LOWEST COMMON ANCESTOR problem from codeEval.
 * @author Dustin Olychuck
 * @version 9/1/2017
 */
public class Tree {
	private Node root;
	
	/**
	 * 
	 * @param data The integer data that each Node contains.
	 */
	public void add(int data) {
		Node add = new Node(data);
		if (root == null) {
			root = add;
		} else {
			Node runner = root;
			while (true) {
				if (runner.data > data) {
					if (runner.left == null) {
						runner.left = add;
						break;
					}
					runner = runner.left;
				}
				if (runner.data <= data) {
					if (runner.right == null) {
						runner.right = add;
						break;
					}
					runner = runner.right;
				}
			}
		}
	}

	/**
	 * Prints to console the lowest common ancestor in a tree given two nodes.
	 * @param root The root node which is recursively called on the subs trees.
	 * @param one The first Node whose ancestor is being searched for.
	 * @param two The second Node whose ancestor is being searched for.
	 */
	public Node ancestor(Node root, int one, int two) {
		if(root == null)
			return null;
		if(one == root.data || two == root.data)
			return root;
		Node left = ancestor(root.left,one,two);
		Node right = ancestor(root.right,one,two);
		
		if(left == null && right == null)
			return null;
		else if(left != null && right!=null) {
			return root;
		}
		else {
			if(left == null)
				return right;
			else
				return left;
		}
	}
	
	/**
	 * Class for the Nodes for a BST.
	 * @author Dustin Olychuck
	 * @version 9/1/2017
	 */
	private static class Node {
		private Node left;
		private Node right;
		private int data;

		public Node(int data) {
			this.data = data;
		}
	}

	/**
	 * 
	 * @param file The file with pairs of integer values being checked for ancestors
	 */
	public void input(File file) {
		try {
			Scanner in = new Scanner(file);
			while(in.hasNext()) {
				Node result = ancestor(root,in.nextInt(),in.nextInt());
				if(result != null)
					System.out.println(result.data);		
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.add(30);
		tree.add(8);
		tree.add(52);
		tree.add(3);
		tree.add(20);
		tree.add(10);
		tree.add(29);
		
		//tree.input(new File("C:\\Users\\Dustin\\Desktop\\input.txt"));
		tree.ancestor(tree.root, 10, 29);
	}

}

