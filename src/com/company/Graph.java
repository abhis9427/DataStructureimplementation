package com.company;

import java.util.*;
// this is graph implimentation
public class Graph {
    int vertex;
    ArrayList<ArrayList<Integer>> adj_list;

    List<Integer> getNeighbours(int source) {
        return adj_list.get(source);
    }

    Graph(int v) {
        vertex = v;
        adj_list = new ArrayList<>(vertex);
        for (int i = 0; i < vertex; i++) {
            adj_list.add(new ArrayList<>());
        }
    }

    void addEdge(int v, int u) {
        adj_list.get(v).add(u);
        adj_list.get(u).add(v);
    }
}
