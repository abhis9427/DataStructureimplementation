package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        BfsTraversal b=new BfsTraversal();
        DfsTraversal d=new DfsTraversal();
        Graph g=new Graph(7);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(2,3);
        g.addEdge(2,4);
        g.addEdge(1,5);
        g.addEdge(1,6);




        b.visit(g,0);
        System.out.println("*********");
        d.visit(g,0);

    }
}
