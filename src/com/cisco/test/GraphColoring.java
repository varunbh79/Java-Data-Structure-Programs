package com.cisco.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class GraphColoring {

    private int V;
    private List<Integer> adj[];

    private GraphColoring (int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<> ();
        }
    }

    public static void main (String[] args) {
        GraphColoring g1 = new GraphColoring ( 5 );
        g1.addEdge ( 0, 1 );
        g1.addEdge ( 0, 2 );
        g1.addEdge ( 1, 2 );
        g1.addEdge ( 1, 3 );
        g1.addEdge ( 2, 3 );
        g1.addEdge ( 3, 4 );
        System.out.println ( "Coloring of graph 1" );
        g1.greedyColouring ();
    }

    private void greedyColouring () {

        int result[] = new int[V];
        Arrays.fill ( result, -1 );
        result[0] = 0;
        boolean[] available = new boolean[V];
        Arrays.fill ( available, true );

        for (int i = 1; i < V; i++) {

            Iterator<Integer> iterator = adj[i].iterator ();
            while (iterator.hasNext ()) {
                int it = iterator.next ();
                if (result[it] != -1)
                    available[result[it]] = false;
            }

            int c;
            for (c = 0; c < V; c++) {
                if (available[c])
                    break;
            }
            result[i] = c;
            Arrays.fill ( available, true );
        }

        for (int i = 0; i < V; i++) {
            System.out.println ( "Vertex " + i + "---->" + "Color" + result[i] );
        }

    }

    private void addEdge (int u, int v) {
        adj[u].add ( v );
        adj[v].add ( u );
    }


}
