package com.bayareala8s.datastructuresalgorithms;
public class BinaryTree {
	private Node root;

	public BinaryTree() {
		root = null;
	}

	public void preorder() {
		preorder(root);
		System.out.println();
	}

	private void preorder(Node p) {
		if(p==null)
			return;
		System.out.print(p.customer.getAge() + " ");
		System.out.print(p.customer.getFirstName() + " ");
		System.out.print(p.customer.getLastName() + " "); 
		preorder(p.lchild);
		preorder(p.rchild);
	}

	public void inorder() {
                inorder(root);
                System.out.println();
        }

        private void inorder(Node p) {
                if(p==null)
                        return;
                inorder(p.lchild);
		System.out.print(p.customer.getAge() + " ");
                System.out.print(p.customer.getFirstName() + " ");
                System.out.print(p.customer.getLastName() + " ");
                inorder(p.rchild);
        }

	public void postorder() {
                inorder(root);
                System.out.println();
        }

        private void postorder(Node p) {
                if(p==null)
                        return;     
                postorder(p.lchild);
                postorder(p.rchild);
		System.out.print(p.customer.getAge() + " ");
                System.out.print(p.customer.getFirstName() + " ");
                System.out.print(p.customer.getLastName() + " ");
        } 

	public void levelOrder() {
		if(root == null) {
			System.out.println("Tree is empty");
			return;
		}

		QueueA q = new QueueA(20);
		q.enqueue(root);

		Node p;
		while(!q.isEmpty()) {
			p = q.dequeue();
			System.out.print(p.customer.getAge() + " ");
                	System.out.print(p.customer.getFirstName() + " ");
                	System.out.print(p.customer.getLastName() + " ");
			if(p.lchild != null)
				q.insert(p.lchild);
			if(p.rchild != null)
				q.insert(p.rchild);
		}
		System.out.println();		
	}

	public int height() {
		return height(root);
	}

	private int height(Node p) {
		if(p == null)
			return 0;

		int hl = height(p.lchild);
		int hr = height(p.rchild);

		if(hl > hr)
			return 1 + hl;
		else
			return 1 + hr;
	}

}




