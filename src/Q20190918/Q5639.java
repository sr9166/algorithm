package Q20190918;

        import java.io.BufferedReader;
        import java.io.IOException;
        import java.io.InputStreamReader;

public class Q5639 {
    static class Node {
        int value;
        Node left;
        Node right;
        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }

    static class BinaryTree {
        Node root = null;

        public void addNode(int value) {
            if (root == null) {
                Node node = new Node(value);
                root = node; // root에 값이 없으면, root에 값을 넣는다.
            } else {
                // root가 존재할 경우, root 변경하기 위한 메소드 호출
                addNode(value, root);
            }
        }

        public void addNode(int value, Node root) {
            if (value <= root.value) {
                if (root.left == null) {
                    Node node = new Node(value);
                    root.left = node;
                } else {
                    addNode(value, root.left);
                }
            } else {
                if (root.right == null) {
                    Node node = new Node(value);
                    root.right = node;
                } else {
                    addNode(value, root.right);
                }
            }
        }

        void backPrint(Node root) {
            if(root == null)
                return;
            if(root.left != null)
                backPrint(root.left);
            if(root.right != null)
                backPrint(root.right);
            System.out.println(root.value);
        }

        void frontPrint(Node root) {
            System.out.println(root.value);
            if(root.left != null)
                frontPrint(root.left);
            if(root.right != null)
                frontPrint(root.right);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BinaryTree binaryTree = new BinaryTree();
        String line = "";
        int value;
        while((line = br.readLine()) != null) {
            value = parse(line);
            binaryTree.addNode(value);
        }

        binaryTree.backPrint(binaryTree.root);
    }

    private static int parse(String string) {
        return Integer.parseInt(string);
    }
}
