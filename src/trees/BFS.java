package trees;

import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	static Queue<Node> nodeQ = new LinkedList<Node>();
	

    public static void breadthFirstTraversal(BinaryTree tree) {
    	
    	tree.root.setVisited(true);
    	
    	Node currentNode = tree.root;
    	System.out.println(currentNode.getData());
    	
    	if(currentNode.getLeft() != null) {
    		nodeQ.add(currentNode.getLeft());
    	}
    	
    	if(currentNode.getRight() != null) {
    		nodeQ.add(currentNode.getRight());
    	}
    	
    	while(!nodeQ.isEmpty()) {
    		
        	Node topNode = nodeQ.remove();
        	System.out.println(topNode.getData());
        	
        	if(topNode.getLeft() != null) {
        		nodeQ.add(topNode.getLeft());
        	}
        	
        	if(topNode.getRight() != null) {
        		nodeQ.add(topNode.getRight());
        	}
        	
    	}
    	
    }
    
    public static void main(String[] args) {
		
    	BinaryTree tree = new BinaryTree();
        tree.root= new Node(1);
        tree.root.setLeft(new Node(2));
        tree.root.setRight(new Node(3));
        tree.root.getLeft().setLeft(new Node(4));
        tree.root.getRight().setRight(new Node(5));
        
        breadthFirstTraversal(tree);
        
	}
}
