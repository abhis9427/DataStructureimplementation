package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DfsTraversal implements IGraphTraversal {
    private Map<Integer, Boolean> m_visit;

    public DfsTraversal() {
        m_visit = new HashMap<>();
    }

    boolean visited(int source) {
        return !m_visit.containsKey(source) || !m_visit.get(source);
    }

    @Override
    public void visit(Graph g, int start) {
        if (visited(start)) {
            m_visit.put(start, true);
            System.out.println(start);
            List<Integer> neighs = g.getNeighbours(start);
            for (Integer node : neighs) {
                visit(g, node);
            }
        }
    }
}
