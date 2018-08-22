package trees;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	static Queue<Node> nodeQ = new LinkedList<Node>();
	static Deque<Node> nodeStack = new ArrayDeque<Node>();
	

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
    
    public static void depthFirstTraversal(BinaryTree tree) {
    	
    	
    	Node currentNode = tree.root;
    	nodeStack.add(currentNode);
    	System.out.println(currentNode.getData());
    	
    	while(!nodeStack.isEmpty()) {

    		currentNode = nodeStack.getLast();
    		
    		if(currentNode.getLeft() != null && !currentNode.getLeft().isVisited()) {
    			
        		currentNode.getLeft().setVisited(true);
        		System.out.println(currentNode.getLeft().getData());
        		nodeStack.add(currentNode.getLeft());
        		
        	} else 
        		if(currentNode.getRight() != null && !currentNode.getRight().isVisited()) {
        		
    			
        		currentNode.getRight().setVisited(true);
        		System.out.println(currentNode.getRight().getData());
        		nodeStack.add(currentNode.getRight());
        		
        	}
    		
    		
    		if(currentNode.isLeaf()) {
    			nodeStack.removeLast();
        	} else
        		if( (currentNode.getLeft() != null && currentNode.getLeft().isVisited()) 
    				&& (currentNode.getRight() != null && currentNode.getRight().isVisited()) ) {
        			nodeStack.removeLast();
    		}
        	
    	}
    	
    	
    	
    }
    

    public static void main(String[] args) {
		
    	BinaryTree tree = new BinaryTree();
        tree.root= new Node(1);
        tree.root.setLeft(new Node(2));
        tree.root.setRight(new Node(3));
        tree.root.getLeft().setLeft(new Node(4));
        tree.root.getLeft().setRight(new Node(5));
        
        breadthFirstTraversal(tree);
        
	}
}
