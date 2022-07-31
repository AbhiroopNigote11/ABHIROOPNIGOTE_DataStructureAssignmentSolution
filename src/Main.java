
public class Main {

	private Node node;

	private static Node skew;

	public static void main(String[] args) {

		Main tree = new Main();
		tree.node = insert(50, tree.node);
		insert(30, tree.node);
		insert(60, tree.node);
		insert(10, tree.node);
		insert(55, tree.node);
		System.out.println(tree.node);

		convert(tree.node);
		System.out.println(skew);
	}

	public static Node insert(int n, Node root) {
		if (root == null) {
			return new Node(n);
		}
		if (n < root.value) {
			root.left = insert(n, root.left);
		} else if (n > root.value) {
			root.right = insert(n, root.right);
		}
		return root;
	}

	public static void convert(Node root) {
		if (root != null) {
			convert(root.left);
			skew = insert(root.value, skew);
			convert(root.right);
		}
	}

}
