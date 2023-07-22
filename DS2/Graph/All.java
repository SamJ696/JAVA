package com.DS2.Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class All {
    // ADJACENCY MATRIX.
    public static void main(String[] args) {

        // INPUT.
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int e = in.nextInt();

        int[][] adjMat = new int[n][n];

        for (int i=0; i<e; i++){
            int first = in.nextInt();
            int second = in.nextInt();

            adjMat[first][second] = 1;
            adjMat[second][first] = 1;
        }

        int source = in.nextInt();
        int end = in.nextInt();

        System.out.println(hasPath(adjMat, source, end));
    }

    public static void DFSTraversal(int[][] adjMat) {
        boolean[] visited = new boolean[adjMat.length];
        DFSVisited(adjMat, 0, visited);
    }

    public static void DFSTraversalMine(int[][] adjMat, int source){
        System.out.print(source + " ");

        for (int i=0; i<adjMat.length; i++){
            if (adjMat[source][i] == 1){
                adjMat[i][source] = 0;
                // i is neighbour of current vertex
                DFSTraversalMine(adjMat, i);
            }
        }
    }

    public static void DFSVisited(int[][] adjMat, int source, boolean[] visited){
        visited[source] = true;
        System.out.print(source + " ");

        for (int i=0; i<adjMat.length; i++){
            if (adjMat[source][i] == 1 && visited[i] == false){
                DFSVisited(adjMat, i, visited);
            }
        }
    }

    public static void BFSTraversal(int[][] adjMat){
        Queue<Integer> pendingVertices = new LinkedList<>();
        boolean[] visited = new boolean[adjMat.length];
        visited[0] = true;
        pendingVertices.add(0);

        while (!pendingVertices.isEmpty()){
            int currentVertex = pendingVertices.poll();
            System.out.print(currentVertex + " ");

            for (int i=0; i< adjMat.length; i++){
                if (adjMat[currentVertex][i] == 1 && visited[i] == false){
                    pendingVertices.add(i);
                    visited[i] = true;
                }
            }
        }
    }

    public static boolean hasPath(int[][] adjMat, int source, int end){
        if (source == end){
            return true;
        }

        for (int i=0; i<adjMat.length; i++){
            if (adjMat[source][i] == 1){
                adjMat[i][source] = 0;
                return hasPath(adjMat, i, end);
            }
        }

        return false;
    }
}
