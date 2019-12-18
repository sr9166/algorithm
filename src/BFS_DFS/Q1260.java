package BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q1260 {
    static class Graph {
        class Node {
            int data;
            LinkedList<Graph.Node> adjacent;
            boolean marked;
            Node(int data) {
                this.data = data;
                this.marked = false;
                adjacent = new LinkedList<>();
            }
        }

        Graph.Node[] nodes;
        Graph(int size) {
            size++;
            nodes = new Graph.Node[size];
            for(int i = 0; i < size; i++) {
                nodes[i] = new Graph.Node(i);
            }
        }
        void addEdge(int i1, int i2) {
            Graph.Node n1 = nodes[i1];
            Graph.Node n2 = nodes[i2];

            if(!n1.adjacent.contains(n2))
                n1.adjacent.add(n2);
            if(!n2.adjacent.contains(n1))
                n2.adjacent.add(n1);
        }

        void dfs() {
            dfs(0);
        }

        void dfs(int idx) {
            Graph.Node root = nodes[idx];
            Stack<Graph.Node> stack = new Stack<>();
            stack.push(root);
            root.marked = true;
            while(!stack.empty()) {
                Graph.Node node = stack.pop();
                for(Graph.Node n : node.adjacent) {
                    if(!n.marked) {
                        n.marked = true;
                        stack.push(n);
                    }
                }
                visit(node);
            }
        }

        void dfsR() {
            dfsR(nodes[0]);
        }

        void dfsR(Graph.Node root) {
            if(root == null) return;

            root.marked = true;
            visit(root);
            for(Graph.Node n : root.adjacent) {
                if(!n.marked) {
                    dfsR(n);
                }
            }
        }

        void bfs() {
            bfs(0);
        }

        void bfs(int idx) {
            Graph.Node root = nodes[idx];
            Queue<Graph.Node> queue = new LinkedList<>();
            root.marked = true;
            queue.add(root);
            while(!queue.isEmpty()) {
                Graph.Node node = queue.poll();
                for(Graph.Node n : node.adjacent) {
                    if(!n.marked) {
                        n.marked = true;
                        queue.add(n);
                    }
                }
                visit(node);
            }
        }

        void visit(Graph.Node node) {
            System.out.print(node.data + " ");
        }

        void clear() {
            for(Node n : nodes) {
                n.marked = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        Graph g = new Graph(Integer.parseInt(line[0]));
        int edgeCnt = Integer.parseInt(line[1]);
        int root = Integer.parseInt(line[2]);

        for(int i = 0; i < edgeCnt; i++) {
            line = br.readLine().split(" ");
            g.addEdge(Integer.parseInt(line[0]), Integer.parseInt(line[1]));
            System.out.println(line);
        }

        g.bfs(root);
        g.clear();
        System.out.println();
        g.dfs(root);
    }
}
