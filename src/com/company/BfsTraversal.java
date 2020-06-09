package com.company;

import java.util.*;

public class BfsTraversal implements IGraphTraversal {
    Map<Integer, Boolean> m_visit;

    public BfsTraversal() {
        m_visit = new HashMap<>();
    }

    boolean visited(int source) {
        return !m_visit.containsKey(source) || !m_visit.get(source);
    }

    @Override
    public void visit(Graph graph, int source) {
        Queue<Integer> q = new LinkedList<>();
        q.add(source);

        m_visit.put(source, true);
        while (!q.isEmpty()) {
            source = q.poll();
            System.out.println(source + " ");
            List<Integer> neighbours = graph.getNeighbours(source);
            for (Integer node : neighbours) {
                if (visited(node)) {
                    q.add(node);
                    m_visit.put(node, true);

                }
            }


        }

    }

}
