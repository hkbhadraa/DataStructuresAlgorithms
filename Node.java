public class Node {
	Node lchild;
	Customer customer;
	Node rchild;

	public Node(Customer customer) {
		this.customer = customer;
		lchild = null;
		rchild = null;
	}
}
