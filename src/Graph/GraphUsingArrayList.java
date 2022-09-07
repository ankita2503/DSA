package Graph;

import java.util.*;

public class GraphUsingArrayList {


    public static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {

        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("Adjacency list of vertex : " + i);
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> " + adj.get(i).get(j));
            }
            System.out.println();
        }
    }

    public static void DFS(ArrayList<ArrayList<Integer>> adj, int start) {

        Stack<Integer> stack = new Stack<>();
        stack.push(start);

        boolean[] visited = new boolean[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            visited[i] = false;
        }

        while (!stack.isEmpty()) {
            int s1 = stack.pop();
            if (visited[s1] == false) {
                System.out.print(s1 + " ");
                visited[s1] = true;
            }

            Iterator<Integer> itr = adj.get(s1).iterator();
            while (itr.hasNext()) {
                int next = itr.next();
                if (!visited[next])
                    stack.push(next);
            }
        }
    }

    public static void BFS(ArrayList<ArrayList<Integer>> adj, int start) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        boolean[] visited = new boolean[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            visited[i] = false;
        }

        while (!queue.isEmpty()) {
            int s1 = queue.poll();
            if (visited[s1] == false) {
                System.out.print(s1 + " ");
                visited[s1] = true;
            }

            Iterator<Integer> itr = adj.get(s1).iterator();
            while (itr.hasNext()) {
                int next = itr.next();
                if (!visited[next])
                    queue.add(next);
            }
        }
    }

    public static void main(String[] args) {
        int V = 5;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 4);
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 4);
        addEdge(adj, 2, 3);
        addEdge(adj, 3, 4);


        printGraph(adj);

        System.out.println("DFS");
        DFS(adj, 0);
        System.out.println();
        System.out.println("BFS");
        BFS(adj, 0);


    }
}
