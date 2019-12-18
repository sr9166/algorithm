package BFS_DFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Graph {
    class Node {
        int data;
        LinkedList<Node> adjacent;
        boolean marked;
        Node(int data) {
            this.data = data;
            this.marked = false;
            adjacent = new LinkedList<>();
        }
    }

    Node[] nodes;
    Graph(int size) {
        nodes = new Node[size];
        for(int i = 0; i < size; i++) {
            nodes[i] = new Node(i);
        }
    }
    void addEdge(int i1, int i2) {
        Node n1 = nodes[i1];
        Node n2 = nodes[i2];

        if(!n1.adjacent.contains(n2))
            n1.adjacent.add(n2);
        if(!n2.adjacent.contains(n1))
            n2.adjacent.add(n1);
    }

    void dfs() {
        dfs(0);
    }

    void dfs(int idx) {
        Node root = nodes[idx];
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        root.marked = true;
        while(!stack.empty()) {
            Node node = stack.pop();
            for(Node n : node.adjacent) {
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

    void dfsR(Node root) {
        if(root == null) return;

        root.marked = true;
        visit(root);
        for(Node n : root.adjacent) {
            if(!n.marked) {
                dfsR(n);
            }
        }
    }

    void bfs() {
        bfs(0);
    }

    void bfs(int idx) {
        Node root = nodes[idx];
        Queue<Node> queue = new LinkedList<>();
        root.marked = true;
        queue.add(root);
        while(!queue.isEmpty()) {
            Node node = queue.poll();
            for(Node n : node.adjacent) {
                if(!n.marked) {
                    n.marked = true;
                    queue.add(n);
                }
            }
            visit(node);
        }
    }

    void visit(Node node) {
        System.out.print(node.data + " ");
    }
}

public class basic {
    public static void main(String[] args) {
        Graph g = new Graph(9);
        g.addEdge(0 ,1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(3, 5);
        g.addEdge(5, 6);
        g.addEdge(5, 7);
        g.addEdge(6, 8);

        g.bfs();
    }
}
