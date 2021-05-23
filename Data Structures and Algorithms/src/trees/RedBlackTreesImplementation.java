package trees;

public class RedBlackTreesImplementation {
	
	public class Node{
		int data;
		Node left,right;
		boolean color;
		// RED links = true;
		// BLACK links = false;
		
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	
	public boolean isRed(Node h) {
		if(h == null) {
			return false;
		}
		if(h.color == true) {
			return true;
		}
		else
			return false;
	}
	
	public Node rotateLeft(Node h) {
//		assertion isRed(h.right);
		Node x = h.right;
		h.right = x.left;
		x.left = h;
		x.color = h.color;
		h.color = true;
		return x;
	}
	
	public Node rotateRight(Node h) {
//		assertion isRed(h.left);
		Node x = h.left;
		h.left = x.right;
		x.right = h;
		x.color = h.color;
		h.color = true;
		return x;
	}
	
	public void flipColors(Node h) {
//		assertion !isRed(h);
//		assertion isRed(h.left);
//		assertion isRed(h.right);
		h.color = true;
		h.left.color = false;
		h.right.color = false;	
	}

}
