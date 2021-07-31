package Tree;

class Node {
	int key;
	Node left;
	Node Right;

	Node(int k) {
		key = k;
	}
}

public class Treedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(10);
		root.left = new Node(20);
		root.Right = new Node(30);
		root.Right.left = new Node(40);
		root.Right.Right = new Node(50);
		System.out.println("Inorder");
		inOrder(root);
		System.out.println("preorder");
		preOrder(root);
		System.out.println("postorder");
		postOrder(root);

	}

	private static void postOrder(Node root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.Right);
			System.out.println(root.key+" ");
		}

	}

	private static void preOrder(Node root) {
		// TODO Auto-generated method stub
		if (root != null) {
			System.out.println(root.key+" ");
			preOrder(root.left);
			preOrder(root.Right);
		}
	}

	private static void inOrder(Node root) {
		// TODO Auto-generated method stub
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.key+" ");
			inOrder(root.Right);
		}
	}

}
