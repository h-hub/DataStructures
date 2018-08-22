package trees;

class Node
{
    private int data;
    private Node left, right;
    private boolean visited;
    
    public Node(int data)
    {
        this.data = data;
        left = right = null;
    }

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
    
	public boolean isLeaf() {
		
		if(this.left==null && this.right==null) {
			return true;
		}
		return false;
		
	}
}